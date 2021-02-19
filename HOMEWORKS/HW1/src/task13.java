import java.util.Scanner;

public class task13 {
    public static void main(String[] args) {
        System.out.println("Въведете целочислено число a в интервала [-100,100] отнасящо се за температура :");
        Scanner sc = new Scanner(System.in);
        int temp = sc.nextInt();

        if(temp >100 || temp <-100)
        {
            System.out.println("Невалиди данни , моля въведете температура между [-100,100]");
        }
        else {

            if (temp <= -20) {
                System.out.println("Ледено студено !");
            }
            if (temp <= 0 && temp > -20) {
                System.out.println("Студено !");
            }
            if (temp > 0 && temp <= 15) {
                System.out.println("Хладно!");
            }
            if (temp > 15 && temp <= 25) {
                System.out.println("Топло !");
            }
            if (temp > 25) {
                System.out.println(" Горещо !");
            }
        }
    }
}
