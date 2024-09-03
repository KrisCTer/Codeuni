import java.util.Scanner;

public class OanTuXi {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int luaChon = -1;
		int scoreHuman = 0;
		int scoreAI = 0;
		randomKeoBuaBao(sc, luaChon, scoreHuman, scoreAI);
	}

	public static String hienLuaChon(int luaChon) {
		if (luaChon == 1)
			return "Keo";
		if (luaChon == 2)
			return "Bua";
		if (luaChon == 3)
			return "Bao";
		return "";
	}

	public static void randomKeoBuaBao(Scanner sc, int luaChon, int count, int countBot) {
		// 1: Nguoi choi thang
		// 2: Nguoi choi hoa
		// 3: Nguoi choi thua

		// 1: Keo
		// 2: Bua
		// 3: Bao

		do {
			System.out.println("1. Keo");
			System.out.println("2. Bua");
			System.out.println("3. Bao");
			System.out.println("0. Thoat tro choi");
			luaChon = Integer.parseInt(sc.nextLine());
			int luaChonAI = (int) (Math.random() * 3 + 1);
			if (luaChon != 0) {
				System.out.println("Nguoi choi chon: " + hienLuaChon(luaChon));
				System.out.println("AI chon: " + hienLuaChon(luaChonAI));
				switch (luaChon) {
				case 1: {
					if (luaChonAI == 2)
						countBot++;
					if (luaChonAI == 3)
						count++;
					break;
				}
				case 2: {
					if (luaChonAI == 1)
						count++;
					if (luaChonAI == 3)
						countBot++;
					break;
				}
				case 3: {
					if (luaChonAI == 1)
						countBot++;
					if (luaChonAI == 2)
						count++;
					break;
				}
				default:
					System.out.println("Ban da nhap sai vui long nhap lai");
				}
			}
			System.out.println("================================");
		} while (luaChon != 0);
		System.out.println(
				(count == countBot) ? "Nguoi choi hoa AI" : (count > countBot) ? "Nguoi choi thang" : "AI thang");
		System.out.println("Ti so la: Nguoi choi " + count + " - " + countBot + " AI");
	}
}
