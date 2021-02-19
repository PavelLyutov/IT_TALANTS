import java.util.Scanner;

public class task16 {
    public static void main(String[] args) {

        System.out.println("Въведете естествено трицифрено число А :  ");
        Scanner scA = new Scanner(System.in);
        int A = scA.nextInt();


        if(A<999 || A > 100) {
            int a, b, c;
            c = A % 10;
            A = A / 10;
            b = A % 10;
            a = A / 10;

            System.out.println(a + " , " + b + " , " + c);

            if (a == b && a == c) {
                System.out.println("Digits are equal ! ");
            } else {
                if (a > b && a > c) {
                    if (b > c) {
                        System.out.println("Низходящ");
                    } else {
                        System.out.println("Ненаредени");
                    }
                } else {


                    if (a < b) {
                        if (b < c) {
                            System.out.println("Възходящ");
                        } else {
                            System.out.println("Ненаредени");
                        }
                    } else {
                        System.out.println("Ненаредени");
                    }
                }
            }
        }else{
            System.out.println("Въведеното число не е трицифрено : ");
        }
    }
}
