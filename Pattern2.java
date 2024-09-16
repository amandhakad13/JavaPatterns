import java.util.Scanner;

public class Pattern2 {
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            int n;
            
            System.out.print("Enter number : ");
            n = sc.nextInt();
            
            for(int i = 0; i < n; i++) {
                for(int j = 0; j < n; j++) {
                    System.out.print("* ");
                }
                System.out.println();
            }
        }
    }
}