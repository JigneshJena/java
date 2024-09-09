import java.util.Scanner;
public class arrayInput {
//    static void changeArray(int[] arr){
//
//    }
    public static void main(String[] args){
        System.out.println("Enter array size:");
        Scanner sc = new Scanner(System.in);
        int num=sc.nextInt();
        int[] arr=new int[num];
        System.out.println("Enter array Elements :");
        for(int i=0;i<arr.length;i++){
            arr[i] =sc.nextInt();
        }
        System.out.println("Your enterd array is :");
        for(int i=0;i<arr.length;i++){
            System.out.print(arr[i]+" ");
        }
    }
}
