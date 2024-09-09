import java.util.Scanner;
public class Rotatematrix {
    static void printMatix(int[][] arr){
        for(int i=0;i<arr.length;i++){
            for(int j=0;j<arr[i].length;j++){
                System.out.print(arr[i][j]+" ");
            }
            System.out.println();
        }
    }
    static int[][] findTranspose(int[][] arr, int row, int column) {//This methods only work for square matrix

        for (int i = 0; i <column; i++) {
            for (int j = i; j <row; j++) {
                int temp=arr[i][j];
                arr[i][j]=arr[j][i];
                arr[j][i]=temp;
            }

        }            return arr;
    }
    static void reverseArray(int[] arr){
        int i=0,j=arr.length-1;
        while(i<j){
            int temp=arr[i];
            arr[i]=arr[j];
            arr[j]=temp;
            i++;j--;
        }
    }
    static void rotate(int[][] matrix,int n){
            findTranspose(matrix,n,n);
            for(int i=0;i<n;i++){
                reverseArray(matrix[i]);
            }
    }
    public static void main(String[] args)

    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter number of rows and columns of matrix");
        int r = sc.nextInt();
        int c=sc.nextInt();
        int[][] matrix=new int[r][c];
        int totalElements=r*c;
        System.out.println("Enter "+totalElements+" Values");
        for (int i=0;i<r;i++){
            for(int j=0;j<c;j++){
                matrix[i][j]=sc.nextInt();
            }
        }
        System.out.println("input Matrix");
//        printMatix();
        rotate(matrix,r);
        printMatix(matrix);
    }
}
