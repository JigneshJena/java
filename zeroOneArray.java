import java.util.Scanner;
public class zeroOneArray {
    static void swap(int[] arr,int i,int j)
    {
        int temp=arr[i];
        arr[i]=arr[j];
        arr[j]=temp;
    }
    static void printArray(int[] arr)
    {
        for(int i=0;i<arr.length;i++)
        {
            System.out.print(arr[i]+" ");
        }
    }
    static void shortArray(int[] arr)
    {
        int n=arr.length;
    int left =0,right=n-1;
         while(left < right)
         {
               if(arr[left]==1 && arr[right]==0)
              {
                 swap(arr,left,right);
                   left++;
                     right--;
               }
               if(arr[left]==0){
                   left++;
               }
               if(arr[right]==1)
               {
                   right--;
               }
         }
    }

    public static void main(String[] args) {
//        int arr[] = {1, 1, 1, 1, 0, 1, 1, 0, 0};
//        int count = 0;
//        for (int i = 0; i < arr.length; i++) {
//            if (arr[i] == 0) {
//                count++;
//            }
//
//        }
//        System.out.println(count);
//        for (int i = 0; i < arr.length; i++) {
//            if (i < count) {
//                arr[i] = 0;
//            } else {
//                arr[i] = 1;
//            }
//        }
//        for (int i = 0; i < arr.length; i++) {
//            System.out.print(arr[i]+" ");
//
//        }
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter array size :");
        int n=sc.nextInt();
        int[] arr=new int[n];
        for(int i=0;i<n;i++)
        {
            arr[i]=sc.nextInt();
        }
        printArray(arr);
        shortArray(arr);
        System.out.println("\n Sorted Array  ");
        printArray(arr);

        
        
    }
}