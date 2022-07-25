package 방학;

public class Player {

		String name;
		int win;
		int lose;
		
		
		public Player() {
			name = "건전한소환사명";
			win = 0;
			lose = 0;
		}
		
		public Player(String name) {
			this.name = name; 
			win = 0;
			lose = 0;
		}
		
		public String getName() {
			return name;
		}
		public void setName(String name) {
			this.name = name;
		}
		public int getWin() {
			return win;
		}
		public void setWin() {
			win++;
		}
		public int getLose() {
			return lose;
		}
		public void setLose() {
			lose++;
		}

		
		
		

}
