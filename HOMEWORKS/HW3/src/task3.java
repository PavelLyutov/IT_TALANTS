import java.util.Scanner;

public class task3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter N:");
        int n = sc.nextInt();
        int[] array = new int[10];

        for (int i = 0; i < 10; i++) {
            if(i<=1){
                array[i] = n;
            }else{
                array[i] = array[i-1]+array[i-2];
            }
        }

        for (int i = 0; i < 10; i++) {
            System.out.print(array[i] + " ");

        }
    }
}
