import java.util.Scanner;

public class sortingArray {
    static void swap(int[] arr,int i,int j)
    {
        int temp=arr[i];
        arr[i]=arr[j];
        arr[j]=temp;
    }
    static void reverse(int[] arr)
    {
        int i=0,j=arr.length-1;
        while (i<j)
        {
            swap(arr,i,j);
            i++;
            j--;
        }
    }
    static int[] sortSquares(int[] arr) {
        int n = arr.length;
        int left = 0, right = n - 1;
        int[] ans = new int[n];
        int k = 0;
        while (left <= right) {
            if (Math.abs(arr[left]) > Math.abs(arr[right])) {
                ans[k++] = arr[left] * arr[left];
                left++;
            } else {
                ans[k++] = arr[right] * arr[right];
                right--;
            }
        }
        return ans;
    }

    static void printArray(int[] arr)
    {
        for(int i=0;i<arr.length;i++)
        {
            System.out.print(arr[i]+" ");
        }
    }
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter your array length: ");
        int n=sc.nextInt();
        int[] arr=new int[n];
        System.out.println("Enter array elements: ");
        for(int i=0;i<arr.length;i++)
        {
            arr[i]=sc.nextInt();
        }
        int[] ans=sortSquares(arr);
        printArray(arr);
        reverse(ans);

        System.out.println("\nShorted Array:\n");
        printArray(ans);





    }
}
