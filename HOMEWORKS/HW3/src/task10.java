import java.util.Scanner;

public class task10 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int array[] = new int[7];
        int sum=0;
        for (int i = 0; i < 7; i++) {
            System.out.print("Vuvedi array[" + i+ "]");
            array[i] =sc.nextInt();
            sum = sum + array[i];
        }
        int middle = sum/7;
        int number=0;

        for (int i = 0; i < 7; i++) {
            if(array[i]-middle==0){
                number=array[i];
            }
        }
        System.out.println(number);

    }
}
