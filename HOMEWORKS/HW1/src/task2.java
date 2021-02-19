import java.util.Scanner;
public class task2 {
    public static void main(String[] args) {
        System.out.println("Въведи цяло число А: ");
        Scanner scA = new Scanner(System.in);
        int A = scA.nextInt();

        System.out.println("Въведи цяло число B: ");
        Scanner scB = new Scanner(System.in);
        int B = scB.nextInt();

        System.out.println("Въведи число с плаваща запетая C: ");
        Scanner scC = new Scanner(System.in);
        double C = scC.nextDouble();

        System.out.println("Въведи число с плаваща запетая D: ");
        Scanner scD = new Scanner(System.in);
        double D = scD.nextDouble();

        int sumaX = A + B;
        int razlikaX = A - B;
        int proizvedenieX = A*B;
        int delenieX = A/B;
        int ostatukX = A%B;

        double sumaY = C + D;
        double razlikaY = C - D;
        double proizvedenieY = C*D;
        double delenieY = C/D;
        double ostatukY = C%D;

        System.out.println("Сумата на А и В е :" + sumaX );
        System.out.println("Разликата на А и В е :" + razlikaX );
        System.out.println("Произведението на А и В: " + proizvedenieX );
        System.out.println("Целочислено деление на А и В: " + delenieX);
        System.out.println("Деление с остатък на А и В : "+ ostatukX);

        System.out.println("Сумата на C и D е :" + sumaY );
        System.out.println("Разликата на C и D е :" + razlikaY );
        System.out.println("Произведението на C и D: " + proizvedenieY );
        System.out.println("Целочислено деление на C и D: " + delenieY);
        System.out.println("Деление с остатък на C и D : "+ ostatukY);
    }
}
