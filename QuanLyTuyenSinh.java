import java.util.Scanner;

public class QuanLyTuyenSinh {
	static final float khuVucA = 2.0f;
	static final float khuVucB = 1.0f;
	static final float khuVucC = 0.5f;
	static final float khongCoKhuVuc = 0.0f;

	static final float doiTuong1 = 2.5f;
	static final float doiTuong2 = 1.5f;
	static final float doiTuong3 = 1.0f;
	static final float khongCoDoiTuong = 0.0f;

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		float diemMon1 = nhapDiemMon1(sc);
		float diemMon2 = nhapDiemMon2(sc);
		float diemMon3 = nhapDiemMon3(sc);
		String khuVuc = nhapKhuVuc(sc);
		int doiTuong = nhapDoiTuong(sc);
		float tongDiem = tongDiem(diemMon1, diemMon2, diemMon3, khuVuc, doiTuong);
		float diemChuan = nhapDiemChuan(sc);
		xetTotNghep(tongDiem, diemChuan);
	}

	public static float nhapDiemMon1(Scanner sc) {
		System.out.println("Nhap diem mon thu nhat:");
		return Float.parseFloat(sc.nextLine());
	}

	public static float nhapDiemMon2(Scanner sc) {
		System.out.println("Nhap diem mon thu hai:");
		return Float.parseFloat(sc.nextLine());
	}

	public static float nhapDiemMon3(Scanner sc) {
		System.out.println("Nhap diem mon thu ba:");
		return Float.parseFloat(sc.nextLine());
	}

	public static String nhapKhuVuc(Scanner sc) {
		System.out.println("Nhap khu vuc cua thi sinh:");
		System.out.println("A.\tKhu vuc A");
		System.out.println("B.\tKhu vuc B");
		System.out.println("C.\tKhu vuc C");
		System.out.println("X.\tKhong co khu vuc");
		return sc.nextLine();
	}

	public static int nhapDoiTuong(Scanner sc) {
		System.out.println("Nhap doi tuong cua thi sinh:");
		System.out.println("1.\tDoi tuong 1");
		System.out.println("2.\tDoi tuong 2");
		System.out.println("3.\tDoi tuong 3");
		System.out.println("0.\tKhong co khu vuc");
		return Integer.parseInt(sc.nextLine());
	}

	public static float nhapDiemChuan(Scanner sc) {
		System.out.println("Moi ban nhap diem chuan:");
		return Float.parseFloat(sc.nextLine());
	}

	public static float chonKhuVuc(String khuVuc) {
		if (khuVuc.equals("A")) {
			return khuVucA;
		} else if (khuVuc.equals("B")) {
			return khuVucB;
		} else if (khuVuc.equals("C")) {
			return khuVucC;
		} else {
			return khongCoKhuVuc;
		}
	}

	public static float chonDoiTuong(int doiTuong) {
		if (doiTuong == 1) {
			return doiTuong1;
		} else if (doiTuong == 2) {
			return doiTuong2;
		} else if (doiTuong == 3) {
			return doiTuong3;
		} else {
			return khongCoDoiTuong;
		}
	}

	public static float tongDiem(float diemMon1, float diemMon2, float diemMon3, String khuVuc, int doiTuong) {
		return diemMon1 + diemMon2 + diemMon3 + chonKhuVuc(khuVuc) + chonDoiTuong(doiTuong);
	}

	public static void xetTotNghep(float tongDiem, float diemChuan) {
		if (tongDiem >= diemChuan)
			System.out.println("Ban da dau voi so diem: " + tongDiem);
		else
			System.out.println("Ban da khong dau voi so diem: " + tongDiem);
	}
}
