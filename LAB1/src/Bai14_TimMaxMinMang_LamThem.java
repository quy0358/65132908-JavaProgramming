import java.util.Scanner;

public class Bai14_TimMaxMinMang_LamThem {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        // Nhập số phần tử
        System.out.print("Nhập số phần tử của mảng: ");
        int n = sc.nextInt();
        int[] arr = new int[n];
        // Nhập mảng
        for (int i = 0; i < n; i++) {
            System.out.print("Nhập phần tử arr[" + i + "]: ");
            arr[i] = sc.nextInt();
        }
        // Giả sử phần tử đầu là max và min
        int max = arr[0];
        int min = arr[0];
        // Tìm max và min
        for (int i = 1; i < n; i++) {
            if (arr[i] > max) max = arr[i];
            if (arr[i] < min) min = arr[i];
        }
        // In kết quả
        System.out.println("Số lớn nhất: " + max);
        System.out.println("Số nhỏ nhất: " + min);

        sc.close();
    }
}
