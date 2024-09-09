public class swapvalueinarray {
    public static void swap(int a,int b){
        System.out.println("The original values are before swap is :");
        System.out.println(a+" "+b);

        a=a+b;
        b=a-b;
        a=a-b;
        System.out.println("The values after swaping is :");
        System.out.println(a+" "+b);

    }
    public static void main(String[] args) {

        int a=9;
        int b=3;
        int[] arr= {1,2,3,4,5};
        swap(a,b);

    }
}
