import java.util.Scanner;

public class task14 {
    public static void main(String[] args) {
        System.out.println("Въведете координата за позиция в шах [1,8]:");
        Scanner sc1 = new Scanner(System.in);
        int x1 = sc1.nextInt();

        System.out.println("Въведете координата за позиция в шах [1,8]");
        Scanner sc2 = new Scanner(System.in);
        int y1 = sc2.nextInt();

        System.out.println("Въведете координата за позиция в шах [1,8]:");
        Scanner sc3 = new Scanner(System.in);
        int x2 = sc3.nextInt();

        System.out.println("Въведете координата за позиция в шах [1,8]");
        Scanner s4 = new Scanner(System.in);
        int y2 = s4.nextInt();


        if((x1 < 1 || x1>8) || (x2 < 1 || x2>8) || (y1 < 1 || y1>8) || (y2 < 1 || y2>8) )
        {
            System.out.println("Някоя от координатите е извън интерва !");
        }else {
            boolean z1 = false;
            ;
            boolean z2 = false;
            ;

            if ((x1 % 2 == 0) == (y1 % 2 == 0)) {
                z1 = true;
            }

            if ((x2 % 2 == 0) == (y2 % 2 == 0)) {
                z2 = true;
            }

            if (z1 == z2) {
                System.out.println("еднакъв цвят са !");
            } else {
                System.out.println("не са еднакъв цвят са !");
            }
        }
    }
}
