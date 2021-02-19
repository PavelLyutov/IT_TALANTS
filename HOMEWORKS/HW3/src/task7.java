import java.util.Scanner;

public class task7 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter size of array: ");
        int size = sc.nextInt();
        int[] array = new int[size];
        for (int i = 0; i < size; i++) {
            System.out.println("Enter array["+ i +"]");
            array[i] = sc.nextInt();
        }
        int[] newArray = new int[size];

        for (int i = 0; i < size; i++) {
            if(i==0 || i ==(size-1)){
                newArray[i] = array[i];
            }
            else{
                newArray[i] =array[i-1] + array[i+1];
            }
        }

        for (int i = 0; i < size; i++) {
            System.out.print(newArray[i] + " ");
        }

    }
}
