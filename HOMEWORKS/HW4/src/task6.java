public class task6 {
    public static void main(String[] args) {
        int[][] arr = {{48,72,13,14,15,5},
                {21,22,53,24,75,6},
                {31,57,33,34,35,6},
                {41,95,43,44,45,7},
                {59,52,53,100,55,8},
                {61,69,63,7,65,9}
        };
    //по условие имаме 6x6
        //в примера редовете се броят от 1ви а не от 0
        int sum = 0;
        for (int i = 0; i < 6; i++) {
            for (int j = 0; j < 6; j++) {
                if(i%2!=0){
                    sum = sum + arr[i][j];
                    System.out.print(arr[i][j] + ",");
                }
            }
            if(i%2!=0) {
                System.out.print("Sum is " + sum);
                System.out.println();
            }
            sum = 0;
        }
    }
}
