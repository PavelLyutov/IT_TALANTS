public class task3 {
    public static void main(String[] args) {
        int[][] arr = {{48,72,13,14,15},
                {21,22,53,24,75},
                {31,57,33,34,35},
                {41,95,43,44,45},
                {59,52,53,100,55},
                {61,69,63,7,65}
        };
        int sum = 0;
        int srednoAritmetichno = 0;
        int count = 0;

        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                sum = arr[i][j] + sum;
                count++;
            }
        }

        srednoAritmetichno = sum / count;
        System.out.println("Sum of all elements of array is " + sum);
        System.out.println("Srednoto aretmetichno e " + srednoAritmetichno);
    }
}
