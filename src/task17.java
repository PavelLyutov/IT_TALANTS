import java.util.Scanner;

public class task17 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter N for size for square[3,20] : ");
        int N = sc.nextInt();

        Scanner sc1 = new Scanner(System.in);
        System.out.println("Enter char");
        char b = sc1.next().charAt(0);

        if(N>=3 && N<=20) {

            for (int i = 1; i <= N; i++) {

                for (int j = 1; j <= N; j++) {

                    if ((i == 1) || (i == N) || (j == 1) || (j == N)) {
                        System.out.print('*');
                    } else {
                        System.out.print(b);
                    }


                }
                System.out.println();

            }
        }else
        {
            System.out.println("The number must be in the interval [3,20]");
        }

    }
}
