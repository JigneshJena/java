
    import java.util.Scanner;

    public class sum {
        static int sum(int[] arr, int target) {
            int n = arr.length;
            int ans = 0;
            for (int i = 0; i < n; i++) {
                for (int j = i + 1; j < n; j++) {
                    if (arr[i] + arr[j] == target) {
                        ans++;
                    }
                }
            }
            return ans;
        }

        public static void main(String[] args) {
            Scanner scc = new Scanner(System.in);
            System.out.print("Enter array size: ");
            int n = scc.nextInt();
            int[] arr = new int[n];

            System.out.println("Enter " + n + " elements:");
            for (int i = 0; i < n; i++) {
                arr[i] = scc.nextInt();
            }

            System.out.print("Enter target sum: ");
            int target = scc.nextInt();

            int result = sum(arr, target);
            System.out.println("Number of pairs with sum equal to target: " + result);
        }
    }

