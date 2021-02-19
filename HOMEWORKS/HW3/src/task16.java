public class task16 {
    public static void main(String[] args) {
        double[] arr ={-1.12, -2.43, 3.1, 4.2, 0, 6.4, - 7.5, 8.6, 9.1, -4}; //по условуе предварително зададен масив с 10 елемента
        double[] arr2 = new double[10];

        for (int i = 0; i <10 ; i++) {
            if(arr[i]< -0.231){
                arr2[i] = Math.round(((i+1)*(i+1) + 41.25)*100.0)/100.0;
            }else{
                arr2[i] = Math.round((arr[i]*(i+1))*100.0)/100.0;
            }
        }
 //izpolzvam funkciqta round da zakruglq zashtoto inache  v rezultata mi izlizaha chisla s mn 0 sled zapetaqta
        for (int i = 0; i <10 ; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
        for (int i = 0; i <10 ; i++) {
            System.out.print(arr2[i] + " ");
        }
    }
}
