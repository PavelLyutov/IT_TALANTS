import java.util.Scanner;

public class task6 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter size of array: ");
        int size = sc.nextInt();
        int[] array = new int[size];
        for (int i = 0; i < size; i++) {
            System.out.println("Enter array["+ i +"]");
            array[i] = sc.nextInt();
        }

        System.out.println("Enter size of array2: ");
        int size2 = sc.nextInt();
        int[] array2 = new int[size2];
        for (int i = 0; i < size2; i++) {
            System.out.println("Enter array2["+ i +"]");
            array2[i] = sc.nextInt();
        }


        if(size != size2){
            System.out.println("Arrays are with differents size");
        }else{
            boolean areEqual = true;
            for (int i = 0; i < size; i++) {
                if(array[i]!=array2[i]){
                    areEqual = false;
                    break;
                }

            }
            if(areEqual){
                System.out.println("arrays are equal");
            }else{
                System.out.println("arrays are not equal");
            }
        }


    }
}
