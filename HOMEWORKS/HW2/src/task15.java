import org.w3c.dom.ls.LSOutput;

import java.util.Scanner;

public class task15 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter N: ");
        int N = sc.nextInt();
         int suma = 0;
         int i = 0;

        do {
            suma = suma + i;
            i++;

        } while(i<=N);

        System.out.println(suma);
    }
}
