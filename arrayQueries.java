import java.util.Scanner;
public class arrayQueries {

//    static void printArray(int[] arr) {
//        for (int i = 1; i <= arr.length; i++) {
//            System.out.print(arr[i] + " ");
//        }
//    }

        static int[] makePrefixSumArray(int[] arr){

        for(int i=1;i<arr.length;i++)
        {
            arr[i] += arr[i-1];
        }
        return arr;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your array length: ");
        int n = sc.nextInt();
        int[] arr = new int[n];
        System.out.println("Enter array elements: ");
        for (int i = 1; i <= n; i++) {
            arr[i] = sc.nextInt();
        }
        int[] prefSum=makePrefixSumArray(arr);
        System.out.println("Enter number of queries ");
        int q=sc.nextInt();
        while (q-->0)
        {
            System.out.println("Enter range ");
            int l=sc.nextInt();
            int r=sc.nextInt();
            int ans=prefSum[r] -prefSum[r-1];
            System.out.println("Sum " +ans);

        }
    }
}