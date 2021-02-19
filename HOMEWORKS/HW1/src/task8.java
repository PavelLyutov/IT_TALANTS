import java.util.Scanner;

public class task8 {
    public static void main(String[] args) {
        System.out.println("Въведете целочислено число в интервала [1000,9999] :");
        Scanner sc = new Scanner(System.in);
        int number = sc.nextInt();

        int x1,x2,x3,x4;

        x1 = number%10;
        number = number/10;
        x2 = number%10;
        number = number/10;
        x3 = number%10;
        x4 = number/10;
        //System.out.println(" x1: " + x1 + " x2: " + x2 + " x3: "  + x3 + " x4: " + x4);

        int A,B;
        A =x4*10 +x1;
        B = x3*10 + x2;
        System.out.println("първото ново число е : "+ A + " a второто е : " + B);

        if(A<=B)
        {
            if(A==B){
                System.out.println("Двете числа са равни");
            }
            else{
                System.out.println("Първото ново число е по- малко");
            }

        }else
        {
            System.out.println("първото ново число е по голямо !");
        }





    }

}
