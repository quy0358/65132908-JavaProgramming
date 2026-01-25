import java.util.Scanner;

public class Bai17_TongChuSo_LamThem {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Nhập số n: ");
        int n = scanner.nextInt();
        int tong = 0;
        int temp = Math.abs(n);
        while (temp > 0) {
            tong += temp % 10;
            temp /= 10;
        }

        System.out.println("Tổng các chữ số của " + n + " = " + tong);
        scanner.close();
    }
}
