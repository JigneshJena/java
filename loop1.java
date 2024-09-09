import java.util.Scanner;
public class loop1 {
    public static void main(String[] args){
        System.out.println("Enter your num:");
        Scanner sc = new Scanner(System.in);
        int num=sc.nextInt();
        int Sum=0;
        for(int i=1;i<=num;i++){
            Sum +=i;
        }
        System.out.println("The sum is :"+Sum);
    }
}
