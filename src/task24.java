import java.util.Scanner;

public class task24 {
    public static void main(String[] args) {
        Scanner sc1 = new Scanner(System.in);
        System.out.println("Enter another number  [10;30000]=");
        int num = sc1.nextInt();



            int  reversedInteger = 0, remainder, originalInteger;

            originalInteger = num;

           if(num<30000 && num>10) {
               do {

                   remainder = num % 10;
                   reversedInteger = reversedInteger * 10 + remainder;
                   num /= 10;

               } while (num != 0);


               // palindrome if orignalInteger and reversedInteger are equal
               if (originalInteger == reversedInteger) {
                   System.out.println(originalInteger + " is a palindrome.");
               } else {
                   System.out.println(originalInteger + " is not a palindrome.");
               }
           }else{
               System.out.println("The number is not in the interval");

           }


    }
}
