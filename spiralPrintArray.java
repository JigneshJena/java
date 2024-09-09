import java.util.Scanner;
public class spiralPrintArray {
    static void printMatrix(int[][] matrix) {
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                System.out.print(matrix[i][j] + " ");
            }
            System.out.println();
        }
    }


    static void printSpiralOrder(int[][] matrix,int r,int c){
            int topRow=0,bottomRow =r-1,leftCol=0,rightCol=c-1;
            int totalEolements=0;
            while(totalEolements<r*c){
                //topRow -> leftCol to rightCol
                for(int j=leftCol;j<=rightCol &&totalEolements<r*c;j++){
                    System.out.print(matrix[topRow][j]);

                    totalEolements++;
                }

                topRow++;
                //rightCol -> topRow to BottomRow
                for(int i=topRow;i<=bottomRow && totalEolements<r*c;i++){
                    System.out.print(matrix[i][rightCol]);
                    totalEolements++;
                }
                rightCol--;
                //bottomRow ->rightCol to leftCol
                for(int j=rightCol;j>=leftCol && totalEolements<r*c;j--){
                    System.out.print(matrix[bottomRow][j]);
                    totalEolements++;
                }
                bottomRow--;
                //leftCol->  BottomRow to topRow
                for(int i=bottomRow;i>=topRow && totalEolements<r*c;i--){
                    System.out.print(matrix[i][leftCol]);

                    totalEolements++;
                }
                leftCol++;
            }
    }



    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter number of rows and columns of matrix");
        int r = sc.nextInt();
        int c = sc.nextInt();
        int[][] matrix = new int[r][c];
        int total = r * c;
        System.out.println("Enter " + total + " element");


        for (int i = 0; i < r; i++) {
            for (int j = 0; j < c; j++) {
                matrix[i][j] = sc.nextInt();
            }
        }
        System.out.println("Your Enterd matrix is :");
        printMatrix(matrix);

        printSpiralOrder(matrix,r,c);
    }
}

//import java.util.Scanner;
//
//public class spiralPrintArray  {
//    public static void main(String[] args) {
//        Scanner sc = new Scanner(System.in);
//        System.out.println("Enter the number of rows and columns for the matrix:");
//        int rows = sc.nextInt();
//        int cols = sc.nextInt();
//
//        int[][] matrix = new int[rows][cols];
//        System.out.println("Enter the matrix elements:");
//
//        for (int i = 0; i < rows; i++) {
//            for (int j = 0; j < cols; j++) {
//                matrix[i][j] = sc.nextInt();
//            }
//        }
//
//        System.out.println("Your entered matrix is:");
//        printMatrix(matrix);
//
//        System.out.println("Printing the matrix in spiral order:");
//        printSpiralOrder(matrix, rows, cols);
//    }
//
//    static void printMatrix(int[][] matrix) {
//        for (int i = 0; i < matrix.length; i++) {
//            for (int j = 0; j < matrix[i].length; j++) {
//                System.out.print(matrix[i][j] + " ");
//            }
//            System.out.println();
//        }
//    }
//
//    static void printSpiralOrder(int[][] matrix, int rows, int cols) {
//        int topRow = 0, bottomRow = rows - 1, leftCol = 0, rightCol = cols - 1;
//
//        while (topRow <= bottomRow && leftCol <= rightCol) {
//            // Print top row
//            for (int j = leftCol; j <= rightCol; j++) {
//                System.out.print(matrix[topRow][j] + " ");
//            }
//            topRow++;
//
//            // Print rightmost column
//            for (int i = topRow; i <= bottomRow; i++) {
//                System.out.print(matrix[i][rightCol] + " ");
//            }
//            rightCol--;
//
//            // Print bottom row
//            if (topRow <= bottomRow) {
//                for (int j = rightCol; j >= leftCol; j--) {
//                    System.out.print(matrix[bottomRow][j] + " ");
//                }
//                bottomRow--;
//            }
//
//            // Print leftmost column
//            if (leftCol <= rightCol) {
//                for (int i = bottomRow; i >= topRow; i--) {
//                    System.out.print(matrix[i][leftCol] + " ");
//                }
//                leftCol++;
//            }
//        }
//    }
//}
