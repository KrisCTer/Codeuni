import java.util.Scanner;

public class USDtoVND {
	public static void main(String[] args) {
		float USD;
		final float tyGiaVND = 23.500f;
		float VND;
		Scanner sc = new Scanner(System.in);
		System.out.print("Vui long nhap so USD can doi: ");
		USD = Float.parseFloat(sc.nextLine());
		VND = USD * tyGiaVND / 1.0f;
		System.out.print(String.format("So VND sau khi doi la: %.3f vnd", VND).replace(",", "."));
	}
}
