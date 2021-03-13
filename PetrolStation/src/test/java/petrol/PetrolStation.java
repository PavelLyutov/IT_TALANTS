package petrol;

import util.Randomizator;

import java.util.ArrayList;
import java.util.Collections;

public class PetrolStation {

    private String name;
    private ArrayList<Kolonka> kolonki;
    private Kasa kasa1;
    private Kasa kasa2;
    private ArrayList<Receipt> archive;

    public PetrolStation(String name) {
        Kasa.petrolStation = this;
        kasa1 = new Kasa(1);
        kasa2 = new Kasa(2);
        archive = new ArrayList<>();
        this.name = name;
        this.kolonki= new ArrayList<>();
        for (int i = 0; i < 5; i++) {
            this.kolonki.add(new Kolonka(i+1));
        }
    }

    public synchronized void enterCar(Car car){
        System.out.println("kola vliza subudete gi");
        kolonki.get(Randomizator.random(0,kolonki.size()-1)).addCar(car);
        notifyAll();
    }

    public boolean isStationEmpty(){

            for(Kolonka k :kolonki){
                if(!k.isEmpty() && !k.nowFueling() && !k.getNextCar().isNowPaying()){
                    return false;
                }
            }
            return true;
    }

    public Kolonka kolonkaZaRabota() throws Exception {
        Collections.shuffle(kolonki);
        for(Kolonka k : kolonki){
            if(!k.isEmpty() &&  !k.nowFueling()){
                return k;
            }
        }
        throw new Exception("No cars in the Petrol Station!");
    }

    public Kasa getRandomKasa(){
        if(Randomizator.random(1,2)==1){
            return kasa1;
        }else{
            return kasa2;
        }
    }

    public ArrayList<Receipt> getArchive() {
        return archive;
    }

    public void fuelCars() throws Exception {
        Kolonka k = null;
        Car c = null;
            synchronized (this) {
                    while (isStationEmpty()) {
                        System.out.println("izchakva zashtoto benzinostanciqta e prazna");
                        try {
                            wait();
                        } catch(InterruptedException e){
                            System.out.println("subudihme otnovo");
                    }
                }
                     k = kolonkaZaRabota();
                     k.setNowFueling(true);
                     c = k.getNextCar();
                     c.setKolonka(k);
                System.out.println("benzindjiq sipva gorivo na kolonka " + c.getKolonka().getId() + ",na kola  " + c.getCarNumber()+ " " + c.getNeededFuel() + " litra");

            }
            Thread.sleep(5000);
            k.setNowFueling(false);
            //колата е заредена и сега трябва да си плати
            c.setNowPaying(true);
            getRandomKasa().addCustumer(c);

           // c.payingTheFuel();
            //sled kato plati moje da se mahne
    }
}
