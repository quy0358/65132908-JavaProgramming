import java.util.Scanner;

public class Bai2_ChuviDT {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 Scanner sc = new Scanner(System.in);

	        // Nhập 2 cạnh
	        System.out.print("Nhập cạnh thứ nhất: ");
	        double canh1 = sc.nextDouble();

	        System.out.print("Nhập cạnh thứ hai: ");
	        double canh2 = sc.nextDouble();

	        // Tính toán
	        double chuVi = 2 * (canh1 + canh2);
	        double dienTich = canh1 * canh2;
	        double canhNho = Math.min(canh1, canh2);

	        // Xuất kết quả
	        System.out.println("Chu vi hình chữ nhật: " + chuVi);
	        System.out.println("Diện tích hình chữ nhật: " + dienTich);
	        System.out.println("Cạnh nhỏ của hình chữ nhật: " + canhNho);

	        sc.close();
	}

}
