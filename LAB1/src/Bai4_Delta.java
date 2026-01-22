import java.util.Scanner;

public class Bai4_Delta {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        // Nhập các hệ số
        System.out.print("Nhập a: ");
        double a = sc.nextDouble();
        System.out.print("Nhập b: ");
        double b = sc.nextDouble();
        System.out.print("Nhập c: ");
        double c = sc.nextDouble();
        // Tính delta
        double delta = b * b - 4 * a * c;
        System.out.println("Delta = " + delta);
        // Tính và xuất căn delta (nếu delta >= 0)
        if (delta >= 0) {
            double canDelta = Math.sqrt(delta);
            System.out.println("Căn delta = " + canDelta);
        } else {
            System.out.println("Delta âm, không có căn bậc hai thực.");
        }
        sc.close();
    }
}
