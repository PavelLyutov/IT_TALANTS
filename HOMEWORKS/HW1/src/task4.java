import java.util.Scanner;

public class task4 {
    public static void main(String[] args) {

        System.out.println("Въведете число А :");
        Scanner scA = new Scanner(System.in);
        int A = scA.nextInt();

        System.out.println("Въведете различно число В :");
        Scanner scB = new Scanner(System.in);
        int B = scB.nextInt();

        if (A > B) {
            System.out.println(B + " ; " + A);
        } else {
            System.out.println(A + " ; " + B);
        }
    }
}

