import java.util.Scanner;

public class task4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter size of array: ");
        int size = sc.nextInt();
        int[] array = new int[size];
        for (int i = 0; i < size; i++) {
            System.out.println("Enter ["+ i +"]");
            array[i] = sc.nextInt();
        }

        boolean isMirrorLike = true;
        for (int i = 0; i < size; i++) {
            if(array[i]!=array[size-i-1])
            {
                isMirrorLike = false;
                break;
            }
        }

        if(isMirrorLike){
            System.out.println("Array is miror like");
        }else{
            System.out.println("Array is not miror like");
        }
    }
}
