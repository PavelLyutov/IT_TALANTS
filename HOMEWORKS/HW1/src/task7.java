import java.util.Scanner;

public class task7 {
    public static void main(String[] args) {
            System.out.println("Въведете час като целочислено число time :");
            Scanner sc = new Scanner(System.in);
            int time = sc.nextInt();

        System.out.println("Въведете сума(пари) с число с плаваща :");
        Scanner scMoney = new Scanner(System.in);
        double  money = scMoney.nextDouble();

        System.out.println("Въведете дали човека е болен :");
        Scanner scTime = new Scanner(System.in);
        boolean health = scTime.nextBoolean();


        if(health){
            System.out.println("Болен съм и няма да излизам");
        }else
        {
            System.out.println("здрав съм и ще отида на кино с приятели");
        }

        if(money>0)
        {
            System.out.println("Ще си купя лекарства");
            if(money<10){
                {
                    System.out.println("ще отида на кафе");
                }
            }
        }else
        {
            System.out.println("ще стоя вкъщи и ще пия чай");
        }
    }

}
