import java.util.Scanner;

public class task9 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter size of array: ");
        int size = sc.nextInt();
        int[] array = new int[size];
        for (int i = 0; i < size; i++) {
            System.out.println("Enter array["+ i +"]");
            array[i] = sc.nextInt();
        }
        int swap;
        for (int i = 0; i < size/2; i++) {
            swap = array[i];
            array[i] = array[size-i-1];
            array[size-i-1] = swap;
        }
        for (int i = 0; i < size; i++) {
            System.out.print(array[i] + " ");
        }
    }
}
