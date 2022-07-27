package StarCraft;
import java.util.concurrent.TimeUnit;
public class location {
	

		public static void main(String[] args) {

			try {
				for (int i = 1; i <= 5; i++) {
					TimeUnit.SECONDS.sleep(1);
					System.out.print(" " + i + "...");
				}
				TimeUnit.SECONDS.sleep(1);
				System.out.println("생성!");
			}catch(Exception e) {
				System.out.println(e);
			}
			
			
			
			
		}
}
