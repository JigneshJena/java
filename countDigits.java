import java.util.Scanner;
public class countDigits {
    public static void main(String[] args) {
        System.out.print("Enter your  number:");
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        int store = 0;
        while (num >0) {
            store = store + (num % 10);
            num = num / 10;
        }
        System.out.print("The total digit is :"+store);
    }
}
