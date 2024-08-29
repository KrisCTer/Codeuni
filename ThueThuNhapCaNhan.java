import java.util.Scanner;

public class ThueThuNhapCaNhan {
	static final float THUE_SUAT_60 = 0.05f;
	static final float THUE_SUAT_60_120 = 0.1f;
	static final float THUE_SUAT_120_210 = 0.15f;
	static final float THUE_SUAT_210_384 = 0.2f;
	static final float THUE_SUAT_384_624 = 0.25f;
	static final float THUE_SUAT_624_960 = 0.3f;
	static final float THUE_SUAT_TREN_960 = 0.35f;

	static final byte DEN_60 = 60;
	static final byte TREN_60_DEN_120 = 60;
	static final byte TREN_120_DEN_210 = 90;
	static final short TREN_210_DEN_384 = 174;
	static final short TREN_384_DEN_624 = 240;
	static final short TREN_624_DEN_960 = 336;

	public static void main(String[] args) {
		String tenNguoiNopThue;
		float thuNhapChiuThue;
		Scanner sc = new Scanner(System.in);

		System.out.println("Nhap ten nguoi nop thue: ");
		tenNguoiNopThue = sc.nextLine();
		thuNhapChiuThue = tinhSoThuePhaiNop(tinhThuNhapChiuThue(sc));

		System.out.println("So thue " + tenNguoiNopThue + " phai nop la " + thuNhapChiuThue + " trieu dong");
	}

	public static float tinhThuNhapChiuThue(Scanner sc) {
		float tongThuNhap;
		System.out.println("Nhap vao tong thu nhap trong nam don vi trieu dong: ");
		tongThuNhap = Float.parseFloat(sc.nextLine());
		System.out.println("Nhap vao so nguoi phu thuoc: ");
		return (float) (tongThuNhap - 4 - Integer.parseInt(sc.nextLine()) * 1.6);
	}

	public static float tinhThueNop(float thuNhapChiuThue, float mucThueChiu) {
		return thuNhapChiuThue * mucThueChiu;
	}

	public static float tinhSoThuePhaiNop(float thuNhapChiuThue) {
		float soThuePhaiNop;
		if (thuNhapChiuThue - DEN_60 <= 0) {
			return tinhThueNop(thuNhapChiuThue, THUE_SUAT_60);
		} else {
			soThuePhaiNop = tinhThueNop(DEN_60, THUE_SUAT_60);
			thuNhapChiuThue -= DEN_60;
		}
		if (thuNhapChiuThue - TREN_60_DEN_120 <= 0) {
			return soThuePhaiNop + tinhThueNop(thuNhapChiuThue, THUE_SUAT_60_120);
		} else {
			soThuePhaiNop += tinhThueNop(TREN_60_DEN_120, THUE_SUAT_60_120);
			thuNhapChiuThue -= TREN_60_DEN_120;
		}
		if (thuNhapChiuThue - TREN_120_DEN_210 <= 0) {
			return soThuePhaiNop + tinhThueNop(thuNhapChiuThue, THUE_SUAT_120_210);
		} else {
			soThuePhaiNop += tinhThueNop(TREN_120_DEN_210, THUE_SUAT_120_210);
			thuNhapChiuThue -= TREN_120_DEN_210;
		}
		if (thuNhapChiuThue - TREN_210_DEN_384 <= 0) {
			return soThuePhaiNop + tinhThueNop(thuNhapChiuThue, THUE_SUAT_210_384);
		} else {
			soThuePhaiNop += tinhThueNop(TREN_210_DEN_384, THUE_SUAT_210_384);
			thuNhapChiuThue -= TREN_210_DEN_384;
		}
		if (thuNhapChiuThue - TREN_384_DEN_624 <= 0) {
			return soThuePhaiNop + tinhThueNop(thuNhapChiuThue, THUE_SUAT_384_624);
		} else {
			soThuePhaiNop += tinhThueNop(TREN_384_DEN_624, THUE_SUAT_384_624);
			thuNhapChiuThue -= TREN_384_DEN_624;
		}
		if (thuNhapChiuThue - TREN_624_DEN_960 <= 0) {
			return soThuePhaiNop + tinhThueNop(thuNhapChiuThue, THUE_SUAT_624_960);
		} else {
			soThuePhaiNop += tinhThueNop(TREN_624_DEN_960, THUE_SUAT_624_960);
			thuNhapChiuThue -= TREN_624_DEN_960;
		}
		if (thuNhapChiuThue > 0) {
			return soThuePhaiNop + tinhThueNop(thuNhapChiuThue, THUE_SUAT_TREN_960);
		} else {
			return soThuePhaiNop;
		}
	}
}
