import java.util.Scanner;
public class addTwoArrayInJava {
    static void printArray(int[][] arr){
        for (int i=0;i<arr.length;i++){
            for(int j=0;j<arr[i].length;j++){
                System.out.print(arr[i][j]+" ");
            }
            System.out.println();
        }
    }
    static void SumArray(int[][] arr,int row,int column,int row2,int column2,int[][]xrr,int[][]crr){
        if(row!=row2||column!=column2){
        System.out.println("Not possible");
            return;
        }
        for (int i=0;i<arr.length;i++){
            for(int j=0;j<arr[i].length;j++){
                crr[i][j]=arr[i][j]+xrr[i][j];
            }
        }
//        return crr;
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
        System.out.println("your first array:");
        printArray(arr);


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
        System.out.println("your second  array:");
//        printArray(arr);
          printArray(brr);
        int[][] crr=new int[column][column2];
        System.out.println("Addition of two array is :");
        SumArray(arr,row,column,row2,column2,brr,crr);
        printArray(crr);
    }
}
