import java.util.Scanner;

public class TinhTong {
	public static void main(String[] args) {
		int n;
		double x;
		long sum = 0;
		Scanner sc = new Scanner(System.in);
		System.out.println("Vui long nhap so n vao: ");
		n = Integer.parseInt(sc.nextLine());
		System.out.println("Vui long nhap so x vao: ");
		x = Double.parseDouble(sc.nextLine());

		for (int i = 1; i <= n; i++)
			sum += Math.pow(x, i);
		System.out.println("Tong cua n = " + n + " va x = " + x + " la: " + sum);
	}
}
