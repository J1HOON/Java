package StarCraft;
import java.util.*;


public class map {
	static String[][] map = {
			{"┌","─","┬","┬","┬","─","┬","┬","┬","─","┐"}, // map[0][0-9]
			{"│","╉","│","┼","│","╊","│","┼","│","╊","│"}, // map[1][0-9]
			{"├","─","┘","┼","└","─","┘","┼","└","─","┤"}, // map[2][0-9]
			{"│","┼","┼","┼","┼","┼","┼","┼","┼","┼","│"}, // map[3][0-9]
			{"├","─","┐","┼","┼","┼","┼","┼","┌","─","┤"}, // map[4][0-9]
			{"│","╊","│","┼","┼","※","┼","┼","│","╊","│"}, // map[5][0-9]
			{"├","─","┘","┼","┼","┼","┼","┼","└","─","┤"}, // map[6][0-9]
			{"│","┼","┼","┼","┼","┼","┼","┼","┼","┼","│"}, // map[7][0-9]
			{"├","─","┐","┼","┌","─","┐","┼","┌","─","┤"}, // map[8][0-9]
			{"│","╊","│","┼","│","╊","│","┼","│","╊","│"}, // map[8][0-9]
			{"└","─","┴","┴","┴","─","┴","┼","┴","─","┘"}  // map[9][0-9]
	};
	
	
	
	public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
	
	for(int i=0; i<map.length; i++) {
		for(int j=0; j<map[i].length; j++) {
			System.out.print(map[i][j]);
		}
		System.out.println();
	}
	
	
	System.out.print("플레이어1의 이름 : ");
	String player1 = sc.next();
	
	System.out.println("┌───────────────────────┐");
	System.out.println("  ☆ 1. Protoss ＠ 2. Zerg ♨ 3. Terran ");
	System.out.println("└───────────────────────┘");
	System.out.print("종족 선택 : ");
	int sel1 = sc.nextInt();
	String title = null;
	switch(sel1) {
		case 1 :
			title = "프로토스";
			break;
		case 2 : 
			title = "저그";
			break;
		case 3 :
			title = "테란";
			break;
	}
	
	
	System.out.println("(하이브, 넥서스, 커멘드 센터) 위치설정 ex) 시계방향 기준");
	int loc = sc.nextInt();
	
	switch(loc) {
	case 1 :
		map_loc(sel1, 1, 9);
		break;
	case 3 :

		map_loc(sel1, 5, 9);
		break;
	case 4 :		
		map_loc(sel1, 9, 9);
		break;
	case 6 :
		map_loc(sel1, 9, 5);
		break;
	case 7 :
		map_loc(sel1, 9, 1);
		break;
	case 9 :
		map_loc(sel1, 5, 1);
		break;
	case 10 :
		map_loc(sel1, 1, 1);
		break;
	case 12 :	
		map_loc(sel1, 1, 5);
		break;
	default : 
		System.err.println("없는 자리");
		
	}
	player s1 = new player(player1, title, loc);
	
	map_print();
	System.out.printf("%s님은 %s 종족, %d시에 군락지 \n",s1.getPlayer(),s1.getTitle(),s1.getLoc());
	
	
	
	
	System.out.print("플레이어2의 이름 : ");
	String player2 = sc.next();
	
	System.out.println("┌───────────────────────┐");
	System.out.println("  ☆ 1. Protoss ＠ 2. Zerg ♨ 3. Terran ");
	System.out.println("└───────────────────────┘");
	System.out.print("종족 선택 : ");
	int sel2 = sc.nextInt();
	
	System.out.println("┌───────────────────────┐");
	System.out.println("                GAME START            ");
	System.out.println("└───────────────────────┘");
	
	
	
	
	
	
	
	}
	
	public static void map_loc(int sel, int y, int x) {
		if(sel == 1) {
			map[y][x] = "☆";
		} else if(sel == 2) {
			map[y][x] = "＠";
		} else if(sel == 3) {
			map[y][x] = "♨";
		}
	}
	
	public static void map_print() {
		for(int i=0; i<map.length; i++) {
			for(int j=0; j<map[i].length; j++) {
				System.out.print(map[i][j]);
			}
			System.out.println();
		}
	}
		
	
	
}
