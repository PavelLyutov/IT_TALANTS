package rakia;

import people.RakiaMaker;

import java.util.ArrayList;
import java.util.Random;
import java.util.concurrent.CopyOnWriteArrayList;


public class Kazan {

    private static final int CAPACITY = 10;
    private String nameOfKazan;
    private boolean isEmpty;

    private CopyOnWriteArrayList<Fruit> plodove;
    RakiaBrewery rakiaBrewery;

    public String getNameOfKazan() {
        return nameOfKazan;
    }

    public Kazan(String name,RakiaBrewery rakia) {
        this.nameOfKazan = name;
        plodove=new CopyOnWriteArrayList<>();
        isEmpty=true;
        this.rakiaBrewery = rakia;
    }

    public boolean isEmpty() {
        return isEmpty;
    }

    public CopyOnWriteArrayList<Fruit> getPlodove() {
        return plodove;
    }

    public void setEmpty(boolean empty) {
        isEmpty = empty;
    }



    public boolean checkFullness(){
        return this.getPlodove().size()>=10;
    }

    public synchronized void  addFruitsToKazan(Fruit fruit){
            this.getPlodove().add(fruit);

    }

    public synchronized void removeFruitsFromKazan(){

        plodove.clear();
        this.isEmpty = true;

    }




}
