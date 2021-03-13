package petrol;

import util.DBConnector;

import java.sql.*;
import java.time.LocalDateTime;
import java.util.concurrent.ConcurrentLinkedQueue;

public class Kasa {

    public static PetrolStation petrolStation;
    private int id;
    private Kasier kasier;
  private  ConcurrentLinkedQueue<Car> klienti;

    public Kasa(int id) {
        this.klienti = new ConcurrentLinkedQueue<>();
        this.id = id;
        this.kasier= new Kasier(this,"worker " + id);
        kasier.start();

    }

    public void addCustumer(Car c){
        System.out.println("klienta otiva na kasata");
        klienti.add(c);
        synchronized (this){
            notifyAll();
        }
    }

    public Car removeCustumer(){
       return klienti.poll();
    }

    public boolean isEmpty(){
        return klienti.isEmpty();
    }

    public  synchronized void custumerPaying() {
        while (isEmpty()){
            try {
                wait();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
        System.out.println("kola s nomer: " + klienti.peek().getCarNumber() + "  e na kasata i gotov da plati");
        try {
            Thread.sleep(5000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        Receipt r = new Receipt(klienti.peek().getNeededFuel(),klienti.peek().getFuelType(),"Kolonka " + klienti.peek().getKolonka(), LocalDateTime.now());
        petrolStation.getArchive().add(r);
        System.out.println("kola s nomer: " + klienti.peek().getCarNumber() +  "klienta plati i napuska benzinostanciqta");
        addToDB(r);
        klienti.peek().setNowPaying(false);
        klienti.peek().getKolonka().removeCar(klienti.peek());
        removeCustumer();
    }

    void addToDB(Receipt r){
        String sql = "INSERT INTO archive (fuel,fueltype,kolonka,date) VALUE (?,?,?,?)";
        Connection connection =  DBConnector.getInstance().getConnection();
        try(PreparedStatement ps = connection.prepareStatement(sql, Statement.RETURN_GENERATED_KEYS)) {

            ps.setInt(1,r.getFuel());
            ps.setString(2, String.valueOf(r.getFuelType()));
            ps.setString(3,r.getKolonka());
            ps.setTimestamp(4,Timestamp.valueOf(r.getDate()) );
            ps.executeUpdate();

            } catch (SQLException throwables) {
            throwables.printStackTrace();
        }
//
        }
    }


