import java.util.*;

class Mat {
    int row;
    int col;
    int[][] mat;

    public Mat(int row, int col) {
        this.row = row;
        this.col = col;
        this.mat = new int[row][col];

    }

    void getValues() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter values");
        for (int i = 0; i < row; i++) {
            for (int j = 0; j < col; j++) {
                mat[i][j] = scanner.nextInt();
            }
        }

    }

    void DisplayValues() {
        for (int i = 0; i < row; i++) {
            for (int j = 0; j < col; j++) {
                System.out.print(mat[i][j] + " ");

            }
            System.out.println();

        }

    }

    public static  Mat FindProduct(Mat a, Mat b) {
  // Ensure the matrices are multiplicable (columns of a must equal rows of b)
  if (a.col != b.row) {
    System.out.println("Matrix multiplication not possible. Incompatible dimensions.");
    return null;
}

        Mat pro = new Mat(a.row,b.col);
        for (int i = 0; i < a.row; i++) {
            for (int j = 0; j < b.col; j++) {

                for (int k = 0; k < a.col; k++){

                    pro.mat[i][j] += a.mat[i][k] *  b.mat[k][j];
                }

            }
            System.out.println();

        }

        return pro;

    }


}

public class Matrixx {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Input number of rows and columns
        System.out.println("Enter rows:");
        int row = scanner.nextInt();

        System.out.println("Enter cols:");
        int col = scanner.nextInt();

        // Create a matrix object
        Mat m1 = new Mat(row, col);
        Mat m2 = new Mat(row, col);


        // Get values for the matrix
        m1.getValues();
        m2.getValues();


        // Display the matrix
        m1.DisplayValues();
        m2.DisplayValues();



        try{
            Mat prod = Mat.FindProduct(m1, m2);
            prod.DisplayValues();
        }
        catch(Exception e)
        {}
    }
}