import java.util.Scanner;

public class TongGiaiThua {
	public static void main(String[] args) {
		long tongGiaiThua = 1;
		int n;
		Scanner sc = new Scanner(System.in);
		System.out.println("Vui long nhap vao so n: ");
		n = Integer.parseInt(sc.nextLine());

		for (int i = 1; i <= n; i++)
			tongGiaiThua *= i;
		System.out.println("Giai thua " + n + "! la: " + tongGiaiThua);
	}
}
