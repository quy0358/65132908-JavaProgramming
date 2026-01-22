import java.util.Scanner;

public class Bai12_KiemTraSoNguyenTo_LamThem {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Nhập số nguyên n
        System.out.print("Nhập số nguyên n: ");
        int n = sc.nextInt();

        // Biến đánh dấu số nguyên tố
        boolean laSoNguyenTo = true;

        // Số nhỏ hơn 2 không phải số nguyên tố
        if (n < 2) {
            laSoNguyenTo = false;
        } else {
            // Kiểm tra từ 2 đến căn bậc hai của n
            for (int i = 2; i <= Math.sqrt(n); i++) {
                if (n % i == 0) {
                    laSoNguyenTo = false;
                    break;
                }
            }
        }

        // In kết quả
        if (laSoNguyenTo) {
            System.out.println(n + " là số nguyên tố.");
        } else {
            System.out.println(n + " không phải là số nguyên tố.");
        }

        sc.close();
    }
}
