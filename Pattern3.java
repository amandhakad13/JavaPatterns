
import java.util.Scanner;

public class Pattern3 {
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            int n;
            
            System.out.print("Enter the number : ");
            n = sc.nextInt();
            
            for(int i = 0; i < n; i++) {
                for(int j = 0; j <= i; j++) {
                    System.out.print("* ");
                }
                System.out.println();
            }
        }
    }
}
