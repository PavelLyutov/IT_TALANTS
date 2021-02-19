import java.util.Scanner;

public class task3 {
    public static void main(String[] args) {

        System.out.println("Въведете число А :");
        Scanner scA = new Scanner(System.in);
        int A = scA.nextInt();

        System.out.println("Въведете число В :");
        Scanner scB = new Scanner(System.in);
        int B = scB.nextInt();

        int X =  B;
        B =  A;
        A = X;

        System.out.println("Числото А става :" + A);
        System.out.println("Числото B става :" + B);


    }
}
