import java.util.Scanner;

public class Bai11_DanhSachSinhVien_LamThem {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Nhập số lượng sinh viên
        System.out.print("Nhập số lượng sinh viên: ");
        int n = sc.nextInt();
        sc.nextLine(); // Xóa bộ nhớ đệm

        String[] dsSinhVien = new String[n];

        // Nhập tên sinh viên
        for (int i = 0; i < n; i++) {
            System.out.print("Nhập tên sinh viên thứ " + (i + 1) + ": ");
            dsSinhVien[i] = sc.nextLine();
        }

        // Xuất danh sách sinh viên
        System.out.println("\nDanh sách sinh viên:");
        for (int i = 0; i < n; i++) {
            System.out.println((i + 1) + ". " + dsSinhVien[i]);
        }

        sc.close();
    }
}
