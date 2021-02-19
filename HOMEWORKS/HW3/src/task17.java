import java.util.Scanner;

public class task17 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter size of array: ");
        int size = sc.nextInt();
        int[] arr = new int[size];
        for (int i = 0; i < size; i++) {
            System.out.println("Enter arr[" + i +"]");
            arr[i] = sc.nextInt();
        }
        boolean zebra = true;
        for (int i = 0; i < size; i++) {
            if(i%2!=0){
                if(i==size-1){
                    if(arr[i]>arr[i-1]){
                        continue;
                    }else{
                        zebra=false;
                        break;
                    }

                }else {
                    if (arr[i] > arr[i - 1] && arr[i] > arr[i + 1]) {
                        continue;
                    } else {
                        zebra = false;
                        break;
                    }
                }
            }else{
                if(i==0){
                    if(arr[i]<arr[i+1]){
                        continue;
                    }else{
                        zebra = false;
                        break;
                    }
                }else {
                    if(i==size-1){
                        if(arr[i]<arr[i-1]){
                            continue;
                        }else{
                            zebra=false;
                            break;
                        }

                    }else {
                        if (arr[i] < arr[i - 1] && arr[i] < arr[i + 1]) {
                            continue;
                        } else {
                            zebra = false;
                            break;
                        }
                    }
                }
            }
        }


        if(zebra){
            System.out.println("Zigzaobraznna nagore redica");
        }else{
            System.out.println("NE E Zigzaobraznna nagore redica");
        }
    }
}
