package petrol;

public class Kasier extends Thread {
    private Kasa kasa;
    private String name;
    public Kasier(Kasa kasa,String name) {
        this.kasa = kasa;
        this.name=name;
    }

    @Override
    public void run() {
        while (true){
            kasa.custumerPaying();

        }
    }
}
