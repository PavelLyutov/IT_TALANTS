import java.util.Scanner;

public class task22 {
    public static void main(String[] args) {
        Scanner sc1 = new Scanner(System.in);
        System.out.println("Enter another number  [1;999]");
        int a = sc1.nextInt();
        int counter=1;
        int i=1;

        while(counter<=10)
        {
            if(i%2==0 || i%3==0 || i%5==0)
            {
                System.out.print(counter +":" + i +",");
                counter++;
            }
            i++;
        }
    }
}
