import java.util.Scanner;

public class task12 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int array[] = new int[7];


        for (int i = 0; i < 7; i++) {
            System.out.print("Vuvedi array[" + i+ "]");
            array[i] =sc.nextInt();
        }
        for (int i = 0; i < 7; i++) {
            if(i==0){
                int swap = array[i];
                array[i] = array[i+1];
                array[i+1]=swap;
            }else{
                if(i==2){
                    int sum = array[i] + array[i+1];
                    array[i] = sum - array[i];
                    array[i+1] =sum - array[i+1];
                }else{
                    if(i==4){
                        int multiply = array[i]*array[i+1];
                        array[i] = multiply/ array[i];
                        array[i+1] =multiply/array[i+1];

                    }
                }
            }

        }

        for (int i = 0; i < 7; i++) {
            System.out.print(array[i] + " ");
        }
    }
}
