import java.util.Scanner;
public class rotateArrau {
    static int[] rotate(int[] arr,int k){
        int n=arr.length;
        k=k%n;
        int[] ans = new int[n];
        int j=0;

        for(int i=n-k;i<n;i++)
        {
            ans[j++]=arr[i];
        }
        for (int i=0;i<n-k;i++)
        {
            ans[j++]=arr[i];
        }
        return ans;
    }
    public static void printarray(int[] arr )
    {
        for(int i=0;i<arr.length;i++)
        {
            System.out.print(arr[i]+" ");
        }
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the array size:");
        int n,k;
        n=sc.nextInt();
        int[] arr = new int[n];
        for(int i=0;i<n;i++)
        {
            arr[i]=sc.nextInt();
        }
        System.out.println("Enter the number of rotation:");
        k=sc.nextInt();
        int[] ans =rotate(arr,k);
        printarray(ans);
    }
}
