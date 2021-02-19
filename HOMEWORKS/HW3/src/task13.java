import java.util.Scanner;

public class task13 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter number:");
        int n = sc.nextInt();
        int[] arr = new int[32];
        int count=0;
        for (int i = 31; i >=0 ; i--) {
            arr[i] = n%2;
            n= n/2;
            count++;

            if(n==0) {
                break;
            }
        }

        for (int i = 32-count; i < 32; i++) {
            System.out.print(arr[i]);

        }


    }
}
