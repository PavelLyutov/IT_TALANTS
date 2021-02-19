import java.util.Scanner;

public class task5 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Gime me a number: ");
        int number = sc.nextInt();

        Scanner sc1 = new Scanner(System.in);
        System.out.println("Gime me a number: ");
        int number1 = sc1.nextInt();

        if(number <= number1)
        {
            if(number == number1)
            {
                System.out.println("The two numbers are equal");
            }
            else
            {
                for (int i = number; i <=number1 ; i++) {

                    System.out.println(i);
                }
            }
        }else
        {
            for (int i = number1; i <=number ; i++) {

                System.out.println(i);
            }

        }
    }
}
