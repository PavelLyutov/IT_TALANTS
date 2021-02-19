import java.util.Scanner;

import static java.lang.Math.*;

public class task15 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter size of array: ");
        int size = sc.nextInt();
        double[] arr = new double[size];
        for (int i = 0; i < size; i++) {
            System.out.println("Enter arr["+i + "]");
            arr[i]=sc.nextDouble();
        }
        double max1=0.0,max2=0.0,max3=0.0;
        for (int i = 0; i < size; i++) {
            if(Math.abs(arr[i])>=max1){
                max1=arr[i];
            }
        }
        for (int i = 0; i < size; i++) {
            if(Math.abs(arr[i])>=max2 && Math.abs(arr[i]) != max1){
                max2=arr[i];
            }
        }
        for (int i = 0; i < size; i++) {
            if(Math.abs(arr[i])>=max3 &&   Math.abs(arr[i]) != max2 && Math.abs(arr[i]) != max1){
                max3=arr[i];
            }
        }

        System.out.println(max1 + " " + max2 + " " + max3);
    }
}
