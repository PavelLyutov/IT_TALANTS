import java.util.Scanner;

public class task1 {
    public static void main(String[] args) {
        System.out.println("Въведи число А: ");
        Scanner scA = new Scanner(System.in);
        double A = scA.nextDouble();

        System.out.println("Въведи число B: ");
        Scanner scB = new Scanner(System.in);
        double B = scB.nextDouble();

        System.out.println("Въведи число C: ");
        Scanner scC = new Scanner(System.in);
        double C = scC.nextDouble();

        if (A < C && C < B){
            System.out.println("Числото С е между А и В");
        }else {
            System.out.println("Числото С не е между А и В");
        }



       // System.out.println(A);
       // System.out.println(B);
       // System.out.println(C);


    }

}
