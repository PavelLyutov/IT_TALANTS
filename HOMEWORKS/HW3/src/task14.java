public class task14 {
    public static void main(String[] args) {
        double[] array = { 7.1,8.5,0.2,3.7,0.99,1.4,-3.5,-110,212,341,1.2};
        int size2 = 0;
        int count = 0;

        for (int i = 0; i < array.length; i++) {
            if(array[i]>=-2.99 && array[i]<=2.99){
         //       array2[count]=array[i];
                size2++;
            }
        }
        double[] array2 = new double[size2];
        for (int i = 0; i < array.length; i++) {
            if(array[i]>=-2.99 && array[i]<=2.99){
                array2[count]=array[i];
                count++;
            }
        }

        for (int i = 0; i < array2.length; i++) {
            System.out.print(array2[i] + " ");
        }
    }
}
