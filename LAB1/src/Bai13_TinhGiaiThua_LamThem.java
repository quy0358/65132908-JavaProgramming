import java.util.Scanner;

public class Bai13_TinhGiaiThua_LamThem {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Nhập số n: ");
        int n = scanner.nextInt();
        long giaiThua = 1;
        for (int i = 1; i <= n; i++) {
            giaiThua *= i;
        }

        System.out.println(n + "! = " + giaiThua);
        scanner.close();
    }
}
