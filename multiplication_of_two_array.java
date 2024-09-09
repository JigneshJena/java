import java.util.Scanner;

public class multiplication_of_two_array {
    static void printArray(int[][] arr){
        for (int i=0;i<arr.length;i++){
            for(int j=0;j<arr[i].length;j++){
                System.out.print(arr[i][j]+" ");
            }
            System.out.println();
        }
    }

    static void multiplicationMatrix(int[][] arr,int[][] brr,int row,int column,int row2,int column2){
        if(column!=row2){
            System.out.println("Bhag ja bsdk");
            return;
        }
        int[][] mul=new int[column][row2];
        for(int i=0;i<arr.length;i++){
            for (int j=0;j<arr[i].length;j++)
            {
                for(int k=0;k<row2;k++)
                {
                    mul[i][j] +=(arr[i][k]*brr[k][j]);
                }
            }
        }
        System.out.println("your multiplication array is :");
        printArray(mul);
    }

    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter your array row:");
        int row,column;
        row=sc.nextInt();
        System.out.println("Enter your array column: ");
        column=sc.nextInt();
        System.out.println("Enter first matrix:");
        int[][] arr=new int[row][column];
        System.out.println("Enter "+row*column+" elements");

        for (int i=0;i<row;i++){
            for(int j=0;j<column;j++){
                arr[i][j]=sc.nextInt();
            }
        }



//------------------------------------------------------2-----------------------------

        System.out.println("Enter second matrix:");
        System.out.println("Enter no of rows :");
        int row2,column2;
        row2=sc.nextInt();
        System.out.println("Enter your array column: ");
        column2=sc.nextInt();

        int[][] brr=new int[row2][column2];
        System.out.println("Enter "+row2*column2+" elements");

        for (int i=0;i<row2;i++){
            for(int j=0;j<column2;j++){
                brr[i][j]=sc.nextInt();
            }
        }
        System.out.println("your first array:");
        printArray(arr);
        System.out.println("your second array:");
        printArray(brr);
        multiplicationMatrix(arr,brr,row,column,row2,column2);
    }
}
