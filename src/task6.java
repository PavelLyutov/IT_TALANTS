import java.util.Scanner;

public class task6 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Gime me a number: ");
        int number = sc.nextInt();
        int count=0;

     if(number>=0)
     {
         if(number == 0)
         {
             System.out.println(0);
         }else
         {
             for (int i = 1; i <= number; i++) {
                 count = count + i;

             }
         }

        }else{

         for (int i = number; i <=1 ; i++) {
             count = count + i;

         }


     }
        System.out.println(count);
    }
}
