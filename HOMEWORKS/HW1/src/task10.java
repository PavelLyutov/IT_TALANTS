import java.util.Scanner;

public class task10 {
    public static void main(String[] args) {
        System.out.println("Въведете целочислено число a в интервала [10,9999] :");
        Scanner sc = new Scanner(System.in);
        int number = sc.nextInt();

    int count2 = 0;
    int count3=0;

        if(number%5 == 1)
        {
            if(number%10 == 6)
            {
                count3 = 2;
                number = number -6;

            }

            if(number%10 == 1)
            {
                number = number-6;
                count3 = 2;

            }
        }
        count2 = count2 + number/5;
        count3 = count3 + number/5;



        if(number%5 == 2)
        {
        count2 = count2 +1;
        }
        if(number%5 == 3)
        {
            count3 =count3 + 1;
        }
        if(number%5 == 4)
        {
            count2 = count2 + 2;
        }
        System.out.println(count2 +  "  Пъти по 2 литра ");
        System.out.println(count3+  "  Пъти по 3 литра ");


    }
}
