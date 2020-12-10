import java.util.Scanner;

public class task8 {
    public static void main(String[] args) {
        Scanner sc1 = new Scanner(System.in);
        System.out.println("Enter  number  =");
        int num = sc1.nextInt();

        if(num == 1){
            System.out.println(0);
        }else
        {

            int x =num-1;
            for (int i = 1; i <=num ; i++) {
                for (int j = 1; j <=num ;j++) {


                    System.out.print(x);


                }
                x=x+2;
                //мислех си че числата които се появяват трябва да са ограничени от броя цифри да е равен на въведенето N

//                if(x==10)
//                {
//                    x = 0;
//                }
//
//                if(x==11)
//                {
//                    x=1;
//                }
                System.out.println();

            }
        }

    }
}
