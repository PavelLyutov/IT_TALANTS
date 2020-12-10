import java.util.Scanner;

public class task13 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter sum[2;27]: ");
        int sum = sc.nextInt();

        if(sum >=2 && sum <=27) {

            for (int i = 100; i < 1000; i++) {
                int a = i;
                int x1 = i % 10;
                int b = i / 10;
                int x2 = b % 10;
                int x3 = b / 10;
                int xSum = x1 + x2 + x3;

                if(xSum == sum)
                {
                    System.out.println(i);
                }else
                {
                    continue;
                }
            }
        }else{
            System.out.println("You need to enter a number between 2 and 27");

        }

    }
}
