import java.util.Scanner;
public class rectangular_pattern {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your number:");
        int num=sc.nextInt();
        //this is the first Pattern loop
        for(int i=1;i<=num;i++){
            for(int j=1;j<=num;j++){
                System.out.print("*");
            }
            System.out.print("\n");
        }
        System.out.println("This is the rectangular pattern of *");
        //this is the second Pattern loop
        for(int i=1;i<=num;i++){
            for(int j=1;j<=i;j++){
                System.out.print("*");
            }
            System.out.print("\n");
        }
        System.out.println("This is the triangle pattern of *");
        //this is the third Pattern loop
        for(int i=1;i<=num;i++){
            for(int j=1;j<=num;j++){
                System.out.print(j);
            }
            System.out.print("\n");
        }
        System.out.println("This is the rectangular numerical pattern ");
        //this is the fourth Pattern loop
        for(int i=1;i<=num;i++){
            for(int j=1;j<=i;j++){
                System.out.print(j);
            }
            System.out.print("\n");
        }
        System.out.println("This is the Triangle numeric  pattern ");

        for(int i=1;i<=num;i++){
            for(int k=1;k<=num-i+1;k++){
                System.out.print(" ");
            }
            for(int j=1;j<=2*i-1;j++){
                System.out.print(j);
            }
            System.out.print("\n");
        }
        System.out.println("\n");
        //-------------------------------------------

        for(int i=1;i<=num;i++){
            for(int j=i;j<=num;j++){
                System.out.print(j);
            }
            for(int k=1;k<=i-1;k++){
                System.out.print(k);
            }
            System.out.print("\n");
        }



        }
}
