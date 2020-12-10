import java.util.Scanner;

public class task10 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter A: ");
        int A = sc.nextInt();

        boolean x = false;
        if(A<=2)
        {
            if(A == 2) {
                System.out.println("2 е просто число");
            }else {
                if(A==1) {
                    System.out.println("1 е просто число");
                }else {
                    System.out.println("Числото трябва да е положително");
                }
            }
            
        }else {
            for (int i = 2; i <A ; i++) {

                if(A%i ==0) {
                    x = true;
                    break;
                }
                
            }

        }

        if(x){
            System.out.println("Числото е просто");
        }else {
            System.out.println("Числото не е просто");
        }

            
        }
    }


