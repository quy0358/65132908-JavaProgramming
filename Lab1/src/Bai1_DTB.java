/**
 * 
 */
import java.util.Scanner;
/**
 * 
 */
public class Bai1_DTB {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub	
		Scanner sc = new Scanner(System.in);
        // Nhập họ và tên
        System.out.print("Nhập họ và tên sinh viên: ");
        String hoTen = sc.nextLine();
        // Nhập điểm trung bình
        System.out.print("Nhập điểm trung bình: ");
        double diemTB = sc.nextDouble();
        // Xuất kết quả
        System.out.println("Họ và tên sinh viên: " + hoTen);
        System.out.println("Điểm trung bình: " + diemTB);
        sc.close();
	}

}
