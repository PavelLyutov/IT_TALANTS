public class task4 {
    public static void main(String[] args) {
        int[][] arr = {{1,2,3,4},
                {5,6,7,8},
                {9,10,11,12},
                {13,14,15,16}
        };

        //ако някой от вътрешните масиви е с различен размер няма да работи , но по условие имаме
        // предварително зададаени елементи следователно ще знаем размера
        int[][] copy = new int[arr.length][arr[0].length];

        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                copy[i][j] = arr[j][i];
            }
        }

        for (int i = 0; i < copy.length; i++) {
            for (int j = 0; j < copy[i].length; j++) {
                System.out.print(copy[i][copy[i].length-j-1] + " ");
            }
            System.out.println();
        }
    }
}
