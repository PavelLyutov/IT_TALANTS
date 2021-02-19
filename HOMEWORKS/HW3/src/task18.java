import java.util.Scanner;

public class task18 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter size of array: ");
        int size = sc.nextInt();
        int[] arr1 = new int[size];
        for (int i = 0; i < size; i++) {
            System.out.println("Enter arr1[" + i +"]");
            arr1[i] = sc.nextInt();
        }


        System.out.println("Enter size of array2: ");
        int size2 = sc.nextInt();
        int[] arr2 = new int[size2];
        for (int i = 0; i < size2; i++) {
            System.out.println("Enter arr2[" + i +"]");
            arr2[i] = sc.nextInt();
        }
        for (int i = 0; i < size; i++) {
            System.out.print(arr1[i] + " ");
        }
        System.out.println();
        for (int i = 0; i < size2; i++) {
            System.out.print(arr2[i] + " ");
        }
        System.out.println();

        if(size<size2){
            int[] arr3 = new int[size2];
            for (int i = 0; i < size2; i++) {
                if(i<=size){
                    if(arr1[i]>arr2[i]){
                        arr3[i] = arr1[i];
                    }else{
                        arr3[i]= arr2[i];
                    }

                }else{
                    arr3[i] =arr2[i];
                }

            }
            for (int i = 0; i < size2; i++) {
                System.out.print(arr3[i] + " ");
            }
        }else{// size2<size
           int[] arr3 = new int[size];
            for (int i = 0; i < size; i++) {
                if(i<size2){
                    if(arr1[i]>arr2[i]){
                        arr3[i] = arr1[i];
                    }else{
                        arr3[i]= arr2[i];
                    }

                }else{
                    arr3[i] = arr1[i];
                }
            }
            for (int i = 0; i < size; i++) {
                System.out.print(arr3[i] + " ");
            }
        }




    }
}
