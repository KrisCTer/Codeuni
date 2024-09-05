
public class TimSoNhoNhat {
	static int MAX = 10000;

	public static void main(String[] args) {
		int tong = 0;
		int dem = 0;
		while (tong < MAX) {
			dem++;
			tong += dem;
		}

		System.out.println("So nho nhat thoa dieu kien la: " + dem);
	}
}
