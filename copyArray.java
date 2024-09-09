import java.util.Scanner;
public class copyArray {
    static void changing(int[]ar){
        for(int i=0;i<ar.length;i++){
            ar[3]=69;
        }
    }
    public static void main(String[] arr){
        System.out.println("Enter array size :");
        Scanner sc= new Scanner(System.in);
        int num=sc.nextInt();
        int[] ar=  new int[num];
        System.out.println("Enter your array elements :");
        for(int i=0;i<num;i++)
        {
            ar[i]=sc.nextInt();
        }
        System.out.print("Your enterd original array is :");
        for(int i=0;i<num;i++)
        {
            System.out.print(ar[i] +" ");
        }
        changing(ar.clone());
        System.out.print("\nYour enterd array after some changes is :");
        for(int i=0;i<num;i++)
        {
            System.out.print(ar[i] +" ");
        }
    }
}
