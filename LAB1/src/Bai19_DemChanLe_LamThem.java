import java.util.Scanner;

public class Bai19_DemChanLe_LamThem {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Nhập số phần tử n: ");
        int n = scanner.nextInt();
        int[] a = new int[n];
        int chan = 0, le = 0;
        for (int i = 0; i < n; i++) {
            System.out.print("a[" + i + "] = ");
            a[i] = scanner.nextInt();

            if (a[i] % 2 == 0)
                chan++;
            else
                le++;
        }

        System.out.println("Số phần tử chẵn = " + chan);
        System.out.println("Số phần tử lẻ = " + le);
        scanner.close();
    }
}  
