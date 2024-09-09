import java.util.Scanner;
public class sortedArray {
    static boolean check(int[] arr){
        boolean c=true;
        for(int i=1;i<arr.length;i++)
        {
            if(arr[i]<arr[i-1]){
                c=false;
                break;
            }
        }
        return c;
    }
    public static void main(String[] args){

        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int[] arr= new int[n];
        System.out.println("Enter element:");
        for(int i=0;i<n;i++)
        {
            arr[i]=sc.nextInt();
        }
        System.out.println("The array are shorted  "+check(arr));
    }
}
