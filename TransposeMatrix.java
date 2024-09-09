import java.util.Scanner;

public class TransposeMatrix {
    static void printArray(int[][] arr) {
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                System.out.print(arr[i][j] + " ");
            }
            System.out.println();
        }
    }

    static int[][] findTranspose(int[][] arr, int row, int column) {//This methods only work for square matrix
//        int[][] ans = new int[column][row];
        for (int i = 0; i <column; i++) {
            for (int j = i; j <row; j++) {
//                ans[i][j] = arr[j][i];
                int temp=arr[i][j];
                arr[i][j]=arr[j][i];
                arr[j][i]=temp;
            }

        }            return arr;
    }
        public static void main (String[]args)
        {
            Scanner sc = new Scanner(System.in);
            System.out.println("Enter your array row:");
            int row, column;
            row = sc.nextInt();
            System.out.println("Enter your array column: ");
            column = sc.nextInt();
            int[][] arr = new int[row][column];
            System.out.println("Enter array elements :");

            for (int i = 0; i < row; i++) {
                for (int j = 0; j < column; j++) {
                    arr[i][j] = sc.nextInt();
                }
            }
            System.out.println("enterd array");
            printArray(arr);
            System.out.println("Transpose array is");

            printArray(findTranspose(arr,row,column));
//            int[][] ans=findTranspose(arr,row,column);
//            printArray(ans);


        }
    }