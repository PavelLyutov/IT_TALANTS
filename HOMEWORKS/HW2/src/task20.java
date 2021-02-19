public class task20 {
    public static void main(String[] args) {

        int counter = 1;
        for (int i = 0; i <=9 ; i++) {
            for (int j = 1; j <= 10; j++) {
                int x = i+j;
                if(x==10)
                {
                    x = 0;
                }
                if(x>10)
                {
                    x = x-10;
                }
                System.out.print(x);

            }
            System.out.println();
        }
    }
}
