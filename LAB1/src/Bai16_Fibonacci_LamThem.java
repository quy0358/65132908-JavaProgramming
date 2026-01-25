import java.util.Scanner;

public class Bai16_Fibonacci_LamThem {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Nhập n: ");
        int n = scanner.nextInt();
        int a = 0, b = 1;
        System.out.print("Dãy Fibonacci: ");
        for (int i = 1; i <= n; i++) {
            System.out.print(a + " ");
            int c = a + b;
            a = b;
            b = c;
        }

        scanner.close();
    }
}
