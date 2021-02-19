import java.sql.SQLOutput;
import java.util.Scanner;

public class task1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter size of array: ");
        int size = sc.nextInt();
        int[] array = new int[size];
        int min = 0;

        for (int i = 0; i < size; i++) {
            System.out.println("Enter ["+ i +"]");
            array[i] = sc.nextInt();
        }
        for (int i = 0; i < size; i++) {
            if(array[i]%3==0 && array[i]<min){
                min=array[i];
            }else{
                continue;
            }
        }

        System.out.println("Smallest number that is devided by 3 is " + min);

    }
}
