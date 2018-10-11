public class MyClass {

    public static void main(String args[]) {

            int pascal[][] = new int[11][12];   // 2D Array size 11x12
            pascal[0][0] = 1;   // Sets the first "top of triangle" to 1

            for (int row = 0 ; row < 11; row++) {   // Calculates and stores the values for the triangle
                for (int col = 0; col < 12; col++) {
                    if (col > 0 && row > 0) {
                        pascal[row][col] = pascal[row - 1][col] + pascal[row - 1][col - 1];
                    } else if (row > 0) {
                        pascal[row][col] = pascal[row - 1][col];
                    }
                }
            }

        for (int i = 0; i < 11; i++) {  // Displays triangle to the console
            for (int j = 0; j < 12; j++) {
                if (pascal[i][j] != 0) {
                    System.out.print(pascal[i][j] + " ");
                }
            }
            System.out.println();   // Moves to the next row of the triangle
        }
    }
}
