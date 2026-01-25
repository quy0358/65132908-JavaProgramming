import java.util.Scanner;

public class Bai15_DemSoChuSo_LamThem {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        // Nhập số nguyên n
        System.out.print("Nhập số nguyên n: ");
        int n = sc.nextInt();
        int dem = 0;
        int temp = Math.abs(n); // Lấy trị tuyệt đối để xử lý số âm
        // Đếm chữ số
        if (temp == 0) {
            dem = 1;
        } else {
            while (temp > 0) {
                dem++;
                temp /= 10;
            }
        }
        // In kết quả
        System.out.println("Số chữ số của " + n + " là: " + dem);

        sc.close();
    }
}
