public class task7 {
    public static void main(String[] args) {
        int[][] arr = {{48,72,13,14,15,5},
                      {21,22,53,24,75,26},
                      {31,57,33,34,35,6},
                      {41,95,43,44,45,7},
                      {59,52,53,100,55,8},
                      {61,69,63,7,65,9}
        };
        int sum = 0;
        int sumTotal=0;
        int n=6,m =6; // rows cols
        int row=0,col=0;
        for (int i = 0; i < n*m; i++) {
            if(col==n){
                col=0;
                row++;
            }

            if((row + col)%2==0){
                System.out.print(arr[row][col] + ",");
                sum = sum + arr[row][col];
            }
            col++;

            if(col==n){
                System.out.print("sumata e " + sum);
                sumTotal = sumTotal+sum;
                sum=0;
                System.out.println();
            }


        }
        System.out.println("Total sum of elements " + sumTotal);
    }
}
