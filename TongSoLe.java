import java.util.Scanner;

public class TongSoLe {
	public static void main(String[] args) {
		int sumLe = 0;
		int n;
		Scanner sc = new Scanner(System.in);
		do {
			System.out.println("Nhap vao mot so nguyen lon hon 0: ");
			n = Integer.parseInt(sc.nextLine());
			if (n < 0)
				System.out.println("Vui long nhap lai");
		} while (n < 0);

		for (int i = 1; i <= n; i++)
			if (i % 2 != 0)
				sumLe += i;
		System.out.println("Tong cua so le be hon " + n + " la: " + sumLe);
	}
}
