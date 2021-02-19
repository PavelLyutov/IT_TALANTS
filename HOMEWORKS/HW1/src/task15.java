import java.util.Scanner;

public class task15 {

    public static void main(String[] args) {

        System.out.println("Въведете естествено число А[0,24]");
        Scanner scA = new Scanner(System.in);
        int A = scA.nextInt();
        if(A <0 || A > 24)
        {
            System.out.println("въведеното число е извън интервала");
        }
        else
        {
            if(A>18 || A < 4){
                System.out.println("Good Evening");
            }else{
                if(A<9){
                    System.out.println("Good morning");
                }
                else
                {
                    System.out.println("Good afternoon !");
                }
            }
        }


    }
}
