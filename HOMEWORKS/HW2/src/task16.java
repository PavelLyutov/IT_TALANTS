import java.util.Scanner;

public class task16 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter N:[10,5555]");
        int N = sc.nextInt();

        Scanner sc1 = new Scanner(System.in);
        System.out.println("Enter M:[10,5555");
        int M = sc1.nextInt();

        if(N<10 || N>5555 || M<10 || M>5555)
        {
            System.out.println("N or M is not in the interval");
        }else{

            if(N>=M){
                if(N==M)
                {
                    System.out.println("Numbers are equal !");
                }else{

                    for (int i = N; i >M ; i--) {

                        if(i%50 == 0)
                        {
                            System.out.println(i);
                        }
                        else{
                            continue;
                        }

                    }
                }
            }else
            {
                for (int i = M; i >N ; i--) {

                    if(i%50 == 0)
                    {
                        System.out.println(i);
                    }
                    else{
                        continue;
                    }

                }

            }

        }
    }
}
