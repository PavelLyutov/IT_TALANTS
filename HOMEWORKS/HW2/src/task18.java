import java.util.Scanner;

public class task18 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter number[1,9]: ");
        int a = sc.nextInt();

        Scanner sc1 = new Scanner(System.in);
        System.out.println("Enter another number [1;9]");
        int b =sc1.nextInt();

        if(a<1 || a >9 || b<1 || b>9){
            System.out.println("one of the numbers is not in the interval");
        }else {

            for (int i = 1; i <= a; i++) {
                for (int j = 1; j <= b; j++) {
                    int x = i * j;
                    System.out.println(i + "*" + j + "=" + x);

                }

            }
        }

    }
}
