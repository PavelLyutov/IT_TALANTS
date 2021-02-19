import java.util.Scanner;

public class task19 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter number[10,99]: ");
        int a = sc.nextInt();


    do {
        if (a % 2 == 0) {
            a = a / 2;
            System.out.print(a + " ");
        } else {
            a = a * 3 + 1;
            System.out.print(a + " ");
        }
    }while (a!=1);


    }
}
