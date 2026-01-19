import java.util.Scanner;

public class Bai3_TheTich {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Nhập cạnh khối lập phương
        System.out.print("Nhập cạnh của khối lập phương: ");
        double canh = sc.nextDouble();

        // Tính thể tích
        double theTich = Math.pow(canh, 3);

        // Xuất kết quả
        System.out.println("Thể tích khối lập phương: " + theTich);

        sc.close();
    }
}
