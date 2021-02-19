import java.util.Scanner;

public class task8 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter size of array: ");
        int size = sc.nextInt();
        int[] array = new int[size];
        for (int i = 0; i < size; i++) {
            System.out.println("Enter array["+ i +"]");
            array[i] = sc.nextInt();
        }

        int count = 1;
        int longestNum = array[0];
        int longestCount = 1;

        for (int i = 1; i < size; i++)
        {
            if (array[i] != array[i-1])
            {
                count = 0;
            }
            count++;

            if (count > longestCount)
            {
                longestCount = count;
                longestNum = array[i];
            }
        }

        for (int i = 0; i < longestCount; i++) {
            System.out.print(longestNum + " ");
        }



        }
    }

