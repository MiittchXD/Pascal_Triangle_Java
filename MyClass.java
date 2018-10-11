
public class MyClass {


    public static void main(String args[]) {

            int pascal[][] = new int[11][12];
            pascal[0][0] = 1;

            for (int row = 0 ; row < 11; row++) {
                for (int col = 0; col < 12; col++) {
                    if (col > 0 && row > 0) {
                        pascal[row][col] = pascal[row - 1][col] + pascal[row - 1][col - 1];
                    } else if (row > 0) {
                        pascal[row][col] = pascal[row - 1][col];
                    }
                }
            }

        for (int i = 0; i < 11; i++) {
            for (int j = 0; j < 12; j++) {
                if (pascal[i][j] != 0) {
                    System.out.print(pascal[i][j] + " ");
                }
            }
            System.out.println();

        }
    }
}
