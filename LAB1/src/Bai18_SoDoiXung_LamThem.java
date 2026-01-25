import java.util.Scanner;

public class Bai18_SoDoiXung_LamThem {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Nhập số n: ");
        int n = scanner.nextInt();
        int temp = Math.abs(n);
        int dao = 0;
        int goc = temp;
        while (temp > 0) {
            dao = dao * 10 + temp % 10;
            temp /= 10;
        }
        if (dao == goc) {
            System.out.println(n + " là số đối xứng");
        } else {
            System.out.println(n + " không phải là số đối xứng");
        }

        scanner.close();
    }
}
