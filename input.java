import java.sql.SQLOutput;
import java.util.Scanner;
public class input {
    public static void main(String[] arg) {
        Scanner sc = new Scanner(System.in);
//
//        System.out.println("Enter your  name");
//        String name = sc.nextLine ();
//        System.out.println("Name is "+ name);
//
//
//        System.out.println("Enter your lucky Number");
//        int num_1 =sc.nextInt();
//        System.out.println(" your lucky number is :" + num_1);
//    }
        System.out.println("Enter your first number :");
        int num1 = sc.nextInt();
        System.out.println("Enter your second number :");
        int num2 = sc.nextInt();
//        int num3 = num1 + num2;
        System.out.println("The total of two numbers are :" + (num1+num2));
    }
}
