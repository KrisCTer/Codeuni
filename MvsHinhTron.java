import java.util.Scanner;

public class MvsHinhTron {
	public static void main(String[] args) {
		float tamX;
		float tamY;
		float banKinh;
		float mX;
		float mY;
		double khoangCach;

		Scanner sc = new Scanner(System.in);
		System.out.print("Vui long nhap toa do x cua tam duong tron: ");
		tamX = Float.parseFloat(sc.nextLine());
		System.out.print("Vui long nhap toa do y cua tam duong tron: ");
		tamY = Float.parseFloat(sc.nextLine());
		System.out.print("Vui long nhap ban kinh duong tron: ");
		banKinh = Float.parseFloat(sc.nextLine());
		System.out.print("Vui long nhap toa do x cua diem M: ");
		mX = Float.parseFloat(sc.nextLine());
		System.out.print("Vui long nhap toa do y cua diem M: ");
		mY = Float.parseFloat(sc.nextLine());

		khoangCach = Math.sqrt(Math.pow((mX - tamX), 2) + Math.pow((mY - tamY), 2));
		System.out.println((khoangCach <= banKinh) ? "Diem M nam trong duong tron" : "Diem M khong nam trong duong tron");
	}
}
