import java.util.Scanner;

public class task11 {
    public static void main(String[] args) {

        System.out.println("Въведете целочислено число a в интервала [111,999] в което не се сърдържа 0 :");
       Scanner sc = new Scanner(System.in);
         int number = sc.nextInt();

         int x1,x2,x3;

         int real = number;
         x1 = number%10;
         number = number/10;
         x2 = number%10;
         x3 = number/10;
        System.out.println(x1 + "  " + x2 + "  "  + x3) ;

        boolean b1 ;
        b1 = true;

        if(real % x1 != 0)
        {
            b1 = false;
        }
        if(real  % x2 != 0)
        {
            b1 = false;
        }
        if(real % x3 != 0)
        {
            b1 = false;
        }

        if(b1)
        {
            System.out.println(" дели се  на всяка своя цифра");
        }
        else
        {
            System.out.println("не се дели на всяка своя цифра");
        }
    }
}
