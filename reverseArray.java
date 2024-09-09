import java.util.Scanner;
public class reverseArray {
   public static void reverse(int[]arr){
       System.out.println("Your reverse array is :");
       for(int i=(arr.length-1);i>=0;i--)
       {
           System.out.print(arr[i]+" ");
       }
   }
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter array elemts :");
        int[] arr=new int[5];
        for(int i=0;i<5;i++)
        {
            arr[i]=sc.nextInt();
        }
        reverse(arr);
    }
}
