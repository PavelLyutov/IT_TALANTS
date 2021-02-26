package people;

import rakia.Fruit;
import rakia.FruitType;
import rakia.Kazan;
import rakia.RakiaBrewery;

import java.util.Random;

public class RakiaMaker extends Thread {
    private String name;
    private int age;
    private RakiaBrewery rakiaBrewery;


    public RakiaMaker(int age, String name, RakiaBrewery rakiaBrewery) {
        super(name);
        this.age = age;
        this.rakiaBrewery = rakiaBrewery;
    }


    @Override
    public void run() {
        while (true) {
            if(rakiaBrewery.getTotalRakiaMade()>=20)
            {
               // Thread.currentThread().interrupt();
                break;
            }
           rakiaBrewery.emptyKazan();
               }
    }

    @Override
    public String toString() {
        return "RakiaMaker{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }
}

