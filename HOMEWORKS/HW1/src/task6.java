import java.util.Scanner;

public class task6 {
    public static void main(String[] args) {
        System.out.println("Въведете число a1 :");
        Scanner scA1 = new Scanner(System.in);
        int a1 = scA1.nextInt();
        System.out.println("Въведете число a2 :");
        Scanner scA2 = new Scanner(System.in);
        int a2 = scA2.nextInt();
        System.out.println("Въведете число a3 :");
        Scanner scA3 = new Scanner(System.in);
        int a3 = scA3.nextInt();

        int x1 = a1;
        int x2 = a2;
        int x3 = a3;

        a1 =x2;
        a2 = x3;
        a3 = x1;

        System.out.println("числото a1 : " + a1);
        System.out.println("числото a2 : " + a2);
        System.out.println("числото a3 : " + a3);


    }
}
