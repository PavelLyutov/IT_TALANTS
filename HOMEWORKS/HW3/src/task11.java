import java.util.Scanner;

public class task11 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int array[] = new int[7];
        int newArray[] = new int[7];
        int count=0;
        for (int i = 0; i < 7; i++) {
            System.out.print("Vuvedi array[" + i+ "]");
            array[i] =sc.nextInt();
            if(array[i]%5==0 && array[i]>5){
                newArray[count] = array[i];
                count++;
            }
        }

        for (int i = 0; i < count; i++) {
            System.out.print(newArray[i] + " ");
        }
        System.out.print("- " + count + " numbers");
    }
}
