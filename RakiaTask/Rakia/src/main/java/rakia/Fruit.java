package rakia;

import java.util.Random;

public class Fruit {
    private FruitType type;
    private int kg;

    public Fruit() {
        this.kg = 1;
        Random r = new Random();
        int x = (r.nextInt(3));

        if(x==0) {
            this.type = FruitType.APRICOT;
        }else{
            if(x==1){
                this.type=FruitType.GRAPE;
            }else{
                this.type=FruitType.PlUMB;
            }
        }
    }

    public FruitType getType() {
        return type;
    }
}
