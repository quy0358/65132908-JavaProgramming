import java.util.Scanner;

public class Bai10_KiemTraChanLe_LamThem {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Nhập số nguyên
        System.out.print("Nhập một số nguyên: ");
        int n = sc.nextInt();

        // Kiểm tra chẵn lẻ
        if (n % 2 == 0) {
            System.out.println(n + " là số chẵn.");
        } else {
            System.out.println(n + " là số lẻ.");
        }

        sc.close();
    }
}
