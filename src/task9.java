import java.util.Scanner;

public class task9 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter A: ");
        int A = sc.nextInt();

        Scanner sc1 = new Scanner(System.in);
        System.out.println("Enter B: ");
        int B = sc1.nextInt();
        
        int count = 0 ;

        if(A<=B)
        {
            if(A==B){
                System.out.println("The numbers are equal");
            }else
            {
                for (int i = A; i <B ; i++) {
                    int x = i*i;

                    if(x%3 == 0)
                    {
                        System.out.print("skip 3 ,");
                    }else
                    {
                        count = count + x;
                        System.out.print( x +"," );

                        if(count>200)
                        {
                            break;
                        }
                    }
                    
                }
            }
        }else{
            for (int i = B; i <A ; i++) {
                int x = i*i;

                if(i%3 == 0)
                {
                    System.out.print("skip 3 ,");
                }else
                {
                    count = count + x;
                    System.out.println("," + x +"," );

                    if(count>200)
                    {
                        break;
                    }
                }

            }

        }
            
    }
}
