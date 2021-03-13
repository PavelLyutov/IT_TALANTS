package petrol;

import util.Randomizator;

public class Car {
    private int carNumber;
    private FuelType fuelType;
    private int neededFuel;
    private boolean nowPaying;
    private Kolonka kolonka;

    public Car(int carNumber) {
        nowPaying = false;
        this.carNumber = carNumber;
       int fuel = Randomizator.random(1,3);
       if(fuel==1){
           fuelType=FuelType.Diesel;
       }else{
           if(fuel==2){
               fuelType=FuelType.Gas;
           }else{
               fuelType=FuelType.Petrol;
           }
       }
       neededFuel = Randomizator.random(10,40);
    }


    public FuelType getFuelType() {
        return fuelType;
    }

    public int getNeededFuel() {
        return neededFuel;
    }

    public boolean isNowPaying() {
        return nowPaying;
    }

    public void setNowPaying(boolean nowPaying) {
        this.nowPaying = nowPaying;
    }

    public void setKolonka(Kolonka kolonka) {
        this.kolonka = kolonka;
    }

    public Kolonka getKolonka() {
        return kolonka;
    }

    public int getCarNumber() {
        return carNumber;
    }
}
