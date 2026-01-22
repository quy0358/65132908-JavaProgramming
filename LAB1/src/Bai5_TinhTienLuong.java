import java.util.Scanner;

public class Bai5_TinhTienLuong {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        // Nhập số giờ làm
        System.out.print("Nhập số giờ làm: ");
        double soGioLam = sc.nextDouble();
        // Nhập lương theo giờ
        System.out.print("Nhập lương theo giờ: ");
        double luongGio = sc.nextDouble();
        double tongLuong;
        // Tính lương
        if (soGioLam <= 40) {
            tongLuong = soGioLam * luongGio;
        } else {
            double gioVuot = soGioLam - 40;
            tongLuong = 40 * luongGio + gioVuot * luongGio * 1.5;
        }

        // Xuất kết quả
        System.out.println("Tổng lương là: " + tongLuong);

        sc.close();
    }
}
