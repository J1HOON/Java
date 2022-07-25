package 방학;
import java.util.*;
public class OmokGame {
	
		String[][] map = {
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
		public void play(Player p1, Player p2) {

			boolean 계속해 = true;
			Scanner sc = new Scanner(System.in);
			while(계속해) {
				int 대영이, 팔지녀;
				// 대영이-row, 팔지녀-col
				
				while(true) {
					System.out.printf("%s님의 턴입니다!", p1.getName());
					System.out.printf("%s님, 어따 놓을래? x y", p1.getName());
					대영이 = sc.nextInt();
					팔지녀 = sc.nextInt();
					
					if(map[대영이][팔지녀]=="●" || map[대영이][팔지녀]=="○") { // ● ○가 존재할때!
						System.out.println("돌이 이미 존재합니다. 다시 입력하세요!");
						continue;
					} else {
						map[대영이][팔지녀] = "●";
						break;
					}
				}
				printMap();
				
				if(끝났니(대영이, 팔지녀, "●")==false) {
					System.out.println(p1.getName() + "님이 승리!!");
					p1.setWin();
					p2.setLose();
					break;
				}
				
				while(true) {
					System.out.printf("%s님의 턴입니다!", p2.getName());
					System.out.printf("%s님, 어따 놓을래? x y", p2.getName());
					대영이 = sc.nextInt();
					팔지녀 = sc.nextInt();
					
					if(map[대영이][팔지녀]=="●" || map[대영이][팔지녀]=="○") { // ● ○가 존재할때!
						System.out.println("돌이 이미 존재합니다. 다시 입력하세요!");
						continue;
					} else {
						map[대영이][팔지녀] = "○";
						break;
					}
				}
				printMap();
				
				if(끝났니(대영이, 팔지녀, "○")==false) {
					System.out.println(p2.getName() + "님이 승리!!");
					p2.setWin();
					p1.setLose();
					break;
				}
			}
		}
			
			
	
	public boolean 끝났니(int 대영이, int 팔지녀, String 돌) {
		// 가로가로가로가로가로가로가로가로가로가로가로가로가로가로가로 확인!!!!
		int cnt = 1;
		cnt += 머영이썸녀(대영이, 팔지녀, 돌, 0, 1);
		cnt += 머영이썸녀(대영이, 팔지녀, 돌, 0, -1);
		if(cnt>=5) {
			return false;
		}
		
		// 세로세로세로세로세로세로세로세로세로세로세로세로세로세로세로세로 확인!!!!
		cnt = 1;
		cnt += 머영이썸녀(대영이, 팔지녀, 돌, 1, 0);
		cnt += 머영이썸녀(대영이, 팔지녀, 돌, -1, 0);		
		if(cnt>=5) {
			return false;
		}
		
		// ＼＼＼＼＼＼＼＼＼＼＼＼＼＼＼＼＼＼＼＼＼＼＼＼＼＼＼ 확인!!!!
		cnt = 1;
		cnt += 머영이썸녀(대영이, 팔지녀, 돌, 1, 1);
		cnt += 머영이썸녀(대영이, 팔지녀, 돌, -1, -1);
		if(cnt>=5) {
			return false;
		}
		
		// ／／／／／／／／／／／／／／／／／／／／／／／／／／ 확인!!!!
		cnt = 1;
		cnt += 머영이썸녀(대영이, 팔지녀, 돌, 1, -1);
		cnt += 머영이썸녀(대영이, 팔지녀, 돌, -1, 1);		
		if(cnt>=5) {
			return false;
		}

		return true;
	}
	
	public int 머영이썸녀(int 대영이, int 팔지녀, String 돌, int moveRow, int moveCol) {
		/*
				map[대영이+moveRow][팔지녀+moveCol]!=돌
				
				map[대영이][팔지녀+i]!=돌  →→→ moveRow: 0   moveCol: +1
				map[대영이][팔지녀-i]!=돌  ←←← moveRow: 0   moveCol: -1
				map[대영이+i][팔지녀]!=돌  ↓↓↓ moveRow: +1  moveCol: 0 
				map[대영이-i][팔지녀]!=돌  ↑↑↑ moveRow: -1  moveCol: 0
				map[대영이+i][팔지녀+i]!=돌 ↓→ moveRow: +1  moveCol: +1  
				map[대영이-i][팔지녀-i]!=돌 ↑← moveRow: -1  moveCol: -1 
				map[대영이+i][팔지녀-i]!=돌 ↓← moveRow: +1  moveCol: -1
				map[대영이-i][팔지녀+i]!=돌 ↑→ moveRow: -1  moveCol: +1 
		 */
		int cnt = 0;
		for(int i=1; i<5; i++) {
			try {
				if(map[대영이+i*moveRow][팔지녀+i*moveCol]!=돌){
					break;
				} else	{
					if(map[대영이+i*moveRow][팔지녀+i*moveCol]==돌) {
						cnt++;
					}
				}
			} catch (ArrayIndexOutOfBoundsException e) {
				i=5;				
			}
		}
		return cnt;
	}
	
	public void printMap(){
		for(int i=0; i<map.length; i++) {
			for(int j=0; j<map[i].length; j++) {
				System.out.print(map[i][j]);
			}
			System.out.println();
		}
	}

	
	
	
	
	
	
	
}
