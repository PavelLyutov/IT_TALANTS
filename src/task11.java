import java.util.Scanner;

public class task11 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter N: ");
        int N = sc.nextInt();

        for (int i = 0; i < N; i++) {
            for (int j = 0; j < N - i; j++) {
                System.out.print(" ");
            }
            for (int k = 0; k < (2 * i + 1); k++){
                System.out.print("*");
            }

            System.out.println();
        }














// Елха но неизпълнена от вътре
//        for (int i = 0; i < N; i++) {
//            for (int j = 0; j < N - i; j++){
//                System.out.print(" ");
//                }
//            for (int k = 0; k < (2 * i + 1); k++) {
//
//                if((k==0) || (k == (2*i ))){
//                    System.out.print("*");
//                }
//                else{
//                    System.out.print(" ");
//                }
//
//            }
//            System.out.println();
//        }
    }
}
