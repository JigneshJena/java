import java.util.Scanner;
public class EvenOdd {
    public static void main(String[] args){
        System.out.println("Enter  your number:");
        Scanner sc=new Scanner(System.in);
        int num= sc.nextInt();
        if(num%2==0){
            System.out.println("The number is Even No:"+num);
        }
        else{
            System.out.println("The number is Odd no:"+num);
        }
    }
}
