import java.util.Scanner;

public class Pattern1 {
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            int n, count;
            System.out.print("Enter number : ");
            n = sc.nextInt();
            for(int i = 1; i <= n; i++) {
                count = i+1;
                for(int j = 1; j <= n; j++) {
                    System.out.print(count+" ");
                    count++;
                }
                System.out.println();
            }
        }
    }
}