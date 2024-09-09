import java.util.Scanner;
public class binary_to_decimal {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
//        int binary_num = sc.nextInt();
        int ans = 0;
        int pw = 1;
//       while (binary_num>0){
//           int unit_digit=binary_num %10;
//           ans += (unit_digit*pw);
//           binary_num /=10;
//           pw *=2;
//       }
//       System.out.println(ans);
        int decimal_number = sc.nextInt();
        while(decimal_number>0){
            int parity = decimal_number %2;
            ans += (parity * pw);
            pw *=10;
            decimal_number /=2;
//            System.out.println(decimal_number);
        }
        System.out.println(ans);
    }
}
