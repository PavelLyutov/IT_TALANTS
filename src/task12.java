import java.util.Scanner;

public class task12 {
    public static void main(String[] args) {

        for (int i = 100; i <1000 ; i++) {
            int a = i;
            int x1 = i%10;
            int b = i/10;
            int x2 = b%10;
            int x3 = b/10;

            //System.out.println(x3 + "," + x2 +"," + x1);
            if(x1 != x2 && x2 != x3 && x1 != x3  )
            {
                System.out.println(i);
           }

        }

    }
}
