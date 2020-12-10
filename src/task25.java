import java.util.Scanner;

public class task25 {
    public static void main(String[] args) {
        Scanner sc1 = new Scanner(System.in);
        System.out.println("Enter  number  =");
        int num = sc1.nextInt();

        int fakt=1;

        int counter=1;
        do{
            fakt = fakt*counter;
            counter++;

        }while((counter-1)!=num);

        System.out.println(num+ "! = " + fakt);
    }
}
