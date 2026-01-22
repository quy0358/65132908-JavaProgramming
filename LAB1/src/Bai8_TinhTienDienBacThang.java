import java.util.Scanner;

public class Bai8_TinhTienDienBacThang {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Nhập số điện tiêu thụ (kWh)
        System.out.print("Nhập số kWh tiêu thụ: ");
        int kwh = sc.nextInt();

        // Đơn giá theo bậc (VND/kWh)
        final double BAC1 = 1678; // 0-50
        final double BAC2 = 1734; // 51-100
        final double BAC3 = 2014; // 101-200
        final double BAC4 = 2536; // 201-300
        final double BAC5 = 2834; // >300

        double tienDien = 0; 

        // Tính tiền điện theo bậc thang
        if (kwh <= 50) {
            tienDien = kwh * BAC1;
        } else if (kwh <= 100) {
            tienDien = 50 * BAC1 + (kwh - 50) * BAC2;
        } else if (kwh <= 200) {
            tienDien = 50 * BAC1 + 50 * BAC2 + (kwh - 100) * BAC3;
        } else if (kwh <= 300) {
            tienDien = 50 * BAC1 + 50 * BAC2 + 100 * BAC3 + (kwh - 200) * BAC4;
        } else {
            tienDien = 50 * BAC1 + 50 * BAC2 + 100 * BAC3 + 100 * BAC4 + (kwh - 300) * BAC5;
        }

        // In kết quả
        System.out.println("Tiền điện phải trả: " + tienDien + " VND");

        sc.close();
    }
}
