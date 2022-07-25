package 방학;
import java.util.*;


public class O_mok {
	static String[][] map = {
			{"┌","┬","┬","┬","┬","┬","┬","┬","┬","┐"}, // map[0][0-9]
			{"├","┼","┼","┼","┼","┼","┼","┼","┼","┤"}, // map[1][0-9]
			{"├","┼","┼","┼","┼","┼","┼","┼","┼","┤"}, // map[2][0-9]
			{"├","┼","┼","┼","┼","┼","┼","┼","┼","┤"}, // map[3][0-9]
			{"├","┼","┼","┼","┼","┼","┼","┼","┼","┤"}, // map[4][0-9]
			{"├","┼","┼","┼","┼","┼","┼","┼","┼","┤"}, // map[5][0-9]
			{"├","┼","┼","┼","┼","┼","┼","┼","┼","┤"}, // map[6][0-9]
			{"├","┼","┼","┼","┼","┼","┼","┼","┼","┤"}, // map[7][0-9]
			{"├","┼","┼","┼","┼","┼","┼","┼","┼","┤"}, // map[8][0-9]
			{"└","┴","┴","┴","┴","┴","┴","┴","┴","┘"}  // map[9][0-9]
	};

public static void main(String[] args) {
	
	// 플레이어2 만들고 돌 놓는 작업
	
	Scanner sc = new Scanner(System.in);

	System.out.print("플레이어1의 이름을 입력하세요~ ");
	String player1 = sc.next();
	
	Player p1 = new Player(player1);

	// System.out.println(p1.getName());
	// System.out.println(p1.getWin());
	// System.out.println(p1.getLose());
	
	 System.out.print("플레이어2의 이름을 입력하세요~ ");
	 String player2 = sc.next();
	 
	 Player p2 = new Player(player2);
	
	OmokGame og = new OmokGame();
	
	
	while(true) {
		System.out.printf("%s님과 %s님의 오목 대결이 시작됩니다.\n", p1.getName(), p2.getName());
		System.out.println("play(1)  op.gg(2)  end(3)");
		int menu = sc.nextInt();
	
		switch(menu) {
		case 1 : 
			og.play(p1, p2);
			break;
		case 2 :
			System.out.printf("%s님은 %d승, %d패\n", p1.getName(), p1.getWin(), p1.getLose());
			System.out.printf("%s님은 %d승, %d패\n", p2.getName(), p2.getWin(), p2.getLose());
			break;
		case 3 :
			System.exit(0);
			System.err.println("끝");
		default :	
			System.out.println("h");
		}
	}
	
	


	}	
}


