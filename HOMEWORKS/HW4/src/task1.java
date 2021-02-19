public class task1 {
    public static void main(String[] args) {
        int[][] arr = {{48,72,13,14,15},
                {21,22,53,24,75},
                {31,57,33,34,35},
                {41,95,43,44,45},
                {59,52,53,100,55},
                {61,69,63,7,65}
                };
        int min = arr[0][0];
        int max = arr[0][0];

        for (int row = 0; row <arr.length ; row++) {
            for (int col = 0; col < arr[row].length; col++) {
                if(arr[row][col]>max){
                   max = arr[row][col];
                }

                if(arr[row][col]<min){
                    min = arr[row][col];
                }
            }
        }

        System.out.println("Maximum number is " + max);
        System.out.println("Minimum number is " + min);

    }
}
