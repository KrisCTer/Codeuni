import java.util.Scanner;

public class TinhSoNamDoi {
	public static void main(String[] args) {
		double tienGui;
		double tienMuonCo;
		double laiSuat;
		int soNam = 0;
		Scanner sc = new Scanner(System.in);
		System.out.println("Vui long nhap tien gui (tr): ");
		tienGui = Double.parseDouble(sc.nextLine());
		System.out.println("Vui long nhap so tien mong muon (tr): ");
		tienMuonCo = Double.parseDouble(sc.nextLine());
		System.out.println("Vui long nhap lai suat gui (%) tu 0 - 100 : ");
		laiSuat = Double.parseDouble(sc.nextLine()) / 100;

		do {
			tienGui = tienGui + tienGui * laiSuat;
			soNam++;
		} while (tienGui < tienMuonCo);
		System.out.println("So nam doi la: " + soNam);
	}
}
