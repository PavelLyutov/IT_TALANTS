import java.util.Scanner;

public class task2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter size of array: ");
        int size = sc.nextInt();
        int[] array = new int[size];
        for (int i = 0; i < size; i++) {
            System.out.println("Enter ["+ i +"]");
            array[i] = sc.nextInt();
        }

        int[] newArray = new int[size*2];
        for (int i = 0; i <size*2 ; i++) {
            if(i<size){
                newArray[i] = array[i];
            }else{
                newArray[i] = array[size*2-i-1];
            }

        }
        // НЕ ВЯРВАМ В ЗОДИИ
        for (int i = 0; i < size*2; i++) {
            System.out.print(newArray[i] + " ");

        }
    }
}
