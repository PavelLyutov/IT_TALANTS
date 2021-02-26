package people;

import rakia.Fruit;
import rakia.Kazan;
import rakia.RakiaBrewery;

import java.sql.SQLOutput;

public class Harvester extends Thread {

    private RakiaBrewery rakiaBrewery;
    private int age;
    private String name;

    public Harvester(int age, String name, RakiaBrewery rakiaBrewery) {
        super(name);
        this.age = age;

        this.rakiaBrewery = rakiaBrewery;
    }

    public RakiaBrewery getRakiaBrewery() {
        return rakiaBrewery;
    }

    public Fruit harvestSomeFruit() {
        try {
            Thread.sleep(200); // TODO this should be 200 but only for testing is good 1000

        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        return new Fruit();
    }


    @Override
    public void run() {
        while (true) {
            if(rakiaBrewery.getTotalRakiaMade()>=20)
            {
                Thread.currentThread().interrupt();
                break;

            }
            Fruit f = this.harvestSomeFruit();
         //   System.out.println(this.getName() + " набра 1кг " + f.getType() );
            rakiaBrewery.addToKazan(f);

        }


    }


    @Override
    public String toString() {
        return "Harvester{" +
                "age=" + age +
                ", name='" + name + '\'' +
                '}';
    }
}