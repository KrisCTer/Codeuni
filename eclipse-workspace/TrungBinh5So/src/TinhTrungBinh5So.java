import java.util.Scanner;

public class TinhTrungBinh5So {
	public static void main(String[] args) {
		int so1;
		int so2;
		int so3;
		int so4;
		int so5;
		int tong;
		final float soPhanTu = 5;
		float trungBinh;

		Scanner sc = new Scanner(System.in);
		System.out.print("Nhap so thu 1: ");
		so1 = Integer.parseInt(sc.nextLine());
		System.out.print("Nhap so thu 2: ");
		so2 = Integer.parseInt(sc.nextLine());
		System.out.print("Nhap so thu 3: ");
		so3 = Integer.parseInt(sc.nextLine());
		System.out.print("Nhap so thu 4: ");
		so4 = Integer.parseInt(sc.nextLine());
		System.out.print("Nhap so thu 5: ");
		so5 = Integer.parseInt(sc.nextLine());

		tong = so1 + so2 + so3 + so4 + so5;

		trungBinh = (1.0f) * tong / soPhanTu;
		System.out.println("Gia tri trung binh cua " + soPhanTu + " so: " + trungBinh);
	}
}
