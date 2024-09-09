import java.util.Scanner;
public class findingpair {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter your array Size:");
        int num=sc.nextInt();
        int[] arr=new int[num];
        System.out.println("Enter array elements:");
        for(int i=0;i<num;i++)
        {
            arr[i]=sc.nextInt();
        }
        System.out.println("Enter the target to find the  pair:");
        int a=0,x;
        x=sc.nextInt();
        for(int i=0;i<num;i++){
            for(int j=i+1;j<num;j++){
                for(int k=j+1;k<num;k++) {
                    if ((arr[i] + arr[j]+arr[k] )== x) {
                        a++;
                        System.out.print("["+i+" "+j+" " +k+" ] ");

                    }
                }
            }
        }
        System.out.println("\nThe total pair is :"+a);
    }
}
