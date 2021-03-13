package util;

import java.util.Random;

public class Randomizator {

    public static int random(int min, int max){
        return new Random().nextInt(max - min + 1) + min;
    }
}
