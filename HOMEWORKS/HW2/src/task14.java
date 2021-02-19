import java.util.Scanner;

public class task14 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter N[10,200]: ");
        int N = sc.nextInt();

        for (int i = 200; i >10 ; i--) {

            if(i< N && i%7 == 0)
            {
                System.out.println(i);
            }else{
                continue;
            }

        }
    }
}
