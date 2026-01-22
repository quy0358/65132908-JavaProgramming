
import java.util.Scanner;

public class Bai6_QuyDoiTienTe {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        final double TY_GIA_USD = 23500;
        final double TY_GIA_EUR = 27000;

        System.out.print("Nhập số tiền USD: ");
        double usd = sc.nextDouble();

        System.out.print("Nhập số tiền EUR: ");
        double eur = sc.nextDouble();

        double vndFromUSD = usd * TY_GIA_USD;
        double vndFromEUR = eur * TY_GIA_EUR;

        System.out.println("Số tiền quy đổi từ USD sang VND: " + vndFromUSD);
        System.out.println("Số tiền quy đổi từ EUR sang VND: " + vndFromEUR);

        sc.close();
    }
}
