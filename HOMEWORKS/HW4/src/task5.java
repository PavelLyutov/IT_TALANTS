public class task5 {
    public static void main(String[] args) {
        int[][] arr = {  {1,2,3,4},
                         {5,6,7,8},
                         {9,10,11,12},
                         {13,14,15,16}
        };
        //знаем че вианги size = 4 по условие
        int maxSumRows =0;
        int maxSumCol = 0;
        int sum = 0;

        for (int i = 0; i < 4; i++) {
            for (int j = 0; j < 4; j++) {
                sum = arr[i][j] + sum;
            }
            if(sum>maxSumRows){
                maxSumRows = sum;
                sum = 0;
            }
        }

        //използваме наученото в предната задача
        int[][] copy = new int[arr.length][arr[0].length];

        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                copy[i][j] = arr[j][i];
            }
        }

        for (int i = 0; i < 4; i++) {
            for (int j = 0; j < 4; j++) {
                sum = copy[i][j]+sum;
            }
            if(sum>maxSumCol){
                maxSumCol=sum;
                sum=0;
            }
        }

        System.out.println("Maximum sum by rows is " + maxSumRows);
        System.out.println("Maximum sum by columns is " + maxSumCol);

        if(maxSumCol>maxSumRows){
            System.out.println("Maximum sum by columns is bigger");
        }else{
            if(maxSumCol==maxSumRows){
                System.out.println("The max sums are equal!");
            }else{
                System.out.println("Maximum sum by rows is bigger");
            }

        }
    }
}
