import java.util.Scanner;

public class task5 {
    public static void main(String[] args) {

        System.out.println("Въведете число А :");
        Scanner scA = new Scanner(System.in);
        int A = scA.nextInt();
        System.out.println("Въведете число B :");
        Scanner scB = new Scanner(System.in);
        int B = scB.nextInt();
        System.out.println("Въведете число C :");
        Scanner scC = new Scanner(System.in);
        int C = scC.nextInt();

        if(A>B )
        {
            if(C>A)
            {
                System.out.println(C + " ; "+ A +" ; " + B);
            }
            else
                {
                if(C>B)
                    {
                    System.out.println(A + " ; "+  C + " ; "+ B);
                    }
                else
                    {
                    System.out.println(A + " ; "+ B + " ; "+ C );
                    }
                }
        }
        else{
            if(C>B)
            {
                System.out.println(C+ " ; "+  B+ " ; "+  A);
            }
            else
            {
                if(C>A)
                {
                    System.out.println(B+ " ; "+  C+ " ; "+  A);
                }
                else
                {
                    System.out.println(B+ " ; "+  A+ " ; "+  C);
                }
            }
        }

        }
}
