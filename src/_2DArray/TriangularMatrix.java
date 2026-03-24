package _2DArray;
public class TriangularMatrix {
    public static void main(String[] args) {

        int[][] a = {
            {1, 2, 3},
            {0, 5, 6},
            {0, 0, 9}
        };

        int n = a.length;

        boolean upper = true;
        boolean lower = true;

        for(int i = 0; i < n; i++) {
            for(int j = 0; j < n; j++) {

                if(i > j && a[i][j] != 0) {
                    upper = false;
                }

                if(i < j && a[i][j] != 0) {
                    lower = false;
                }
            }
        }

        if(upper)
            System.out.println("Upper Triangular Matrix");

        if(lower)
            System.out.println("Lower Triangular Matrix");

        if(!upper && !lower)
            System.out.println("Not a Triangular Matrix");
    }
}