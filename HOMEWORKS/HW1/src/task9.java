import java.util.Scanner;

public class task9 {
    public static void main(String[] args) {

        System.out.println("Въведете целочислено число a в интервала [10,99] :");
        Scanner sc = new Scanner(System.in);
        int number = sc.nextInt();

        System.out.println("Въведете целочислено число b в интервала [10,99] :");
        Scanner sc1 = new Scanner(System.in);
        int number1 = sc1.nextInt();

        int Proizv = number*number1;
        int lastDigit = Proizv % 10;

        if(lastDigit%2 == 0)
        {
            System.out.println(Proizv + " , "+ lastDigit + " четна ");
        }
        else
        {
            System.out.println(Proizv + " , "+ lastDigit + " нечетна ");

        }
    }
}
