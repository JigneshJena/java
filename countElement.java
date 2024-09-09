import java.util.Scanner;
public class countElement {
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter your array element:");
        int n=sc.nextInt();
        int[] arr=new int[n];
        int a=0;

        System.out.println("Enter your array elements:");
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
        System.out.println("Enter your x element to count the number:");
        int x=sc.nextInt();
        for(int i=0;i<n;i++){
        if(arr[i]>x){
            a++;
        }
        }
        System.out.println("The eneterd element appear :"+a+" time");
    }
}
