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
      
       System.out.print("플레이어2의 이름을 입력하세요~ ");
       String player2 = sc.next();
      
       boolean Loop = true;
      
       while(Loop) {
           int x, y;
          
           while(true) {
               System.out.printf("%s님의 턴입니다!", player1);
               System.out.printf("%s님, 어따 놓을래? ", player1);
               System.out.print("Y축 : ");
               x = sc.nextInt();
               System.out.print("X축 : ");
               y = sc.nextInt();
              
               if(map[x][y]=="●" || map[x][y]=="○") { // ● ○가 존재할때!
                   System.out.println("돌이 이미 존재합니다. 다시 입력하세요!");
                   continue;
               } else {
                   map[x][y] = "●";
                   break;
               }
           }
           printMap();
          
           if(끝났니(x, y, "●")==false) {
               System.out.println(player1 + "님이 승리!!");
               break;
           }
          
           while(true) {
               System.out.printf("%s님의 턴입니다!", player2);
               System.out.printf("%s님, 어따 놓을래? x y", player2);
               System.out.print("Y축 : ");
               x = sc.nextInt();
               System.out.print("X축 : ");
               y = sc.nextInt();
              
               if(map[x][y]=="●" || map[x][y]=="○") { // ● ○가 존재할때!
                   System.out.println("돌이 이미 존재합니다. 다시 입력하세요!");
                   continue;
               } else {
                   map[x][y] = "○";
                   break;
               }
           }
           printMap();
          
           if(끝났니(x, y, "○")==false) {
               System.out.println(player2 + "님이 승리!!");
               break;
           }
       }
   }
  
   private static boolean 끝났니(int x, int y, String 돌) {
      
       // 가로가로가로가로가로가로가로가로가로가로가로가로가로가로가로 확인!!!!
       int cnt = 1;
      
       for(int i=1; i<5; i++) {
           try { // 시도 할 문장
               if(map[x][y+i]!=돌){
                   break;
               } else    {
                   if(map[x][y+i]==돌) {
                       cnt++;
                   }                    
               }
           } catch (ArrayIndexOutOfBoundsException e) {
               // 배열 밖이네?
               i=5;
           }
       }        
      
       for(int i=1; i<5; i++) {
           try {
               if(map[x][y-i]!=돌){
                   break;
               } else    {
                   if(map[x][y-i]==돌) {
                       cnt++;
                   }                    
               }
           } catch (ArrayIndexOutOfBoundsException e) {
               i=5;                
           }
       }
      
       if(cnt>=5) {
           return false;
       }
      
       // 세로세로세로세로세로세로세로세로세로세로세로세로세로세로세로세로 확인!!!!
       cnt = 1;
      
       for(int i=1; i<5; i++) {
           try { // 시도 할 문장
               if(map[x+i][y]!=돌){
                   break;
               } else    {
                   if(map[x+i][y]==돌) {
                       cnt++;
                   }                    
               }
           } catch (ArrayIndexOutOfBoundsException e) {
               // 배열 밖이네?
               i=5;
           }
       }        
      
       for(int i=1; i<5; i++) {
           try {
               if(map[x-i][y]!=돌){
                   break;
               } else    {
                   if(map[x-i][y]==돌) {
                       cnt++;
                   }                    
               }
           } catch (ArrayIndexOutOfBoundsException e) {
               i=5;                
           }
       }
      
       if(cnt>=5) {
           return false;
       }
      
       // ＼＼＼＼＼＼＼＼＼＼＼＼＼＼＼＼＼＼＼＼＼＼＼＼＼＼＼ 확인!!!!
       cnt = 1;
      
       for(int i=1; i<5; i++) {
           try { // 시도 할 문장
               if(map[x+i][y+i]!=돌){
                   break;
               } else    {
                   if(map[x+i][y+i]==돌) {
                       cnt++;
                   }                    
               }
           } catch (ArrayIndexOutOfBoundsException e) {
               // 배열 밖이네?
               i=5;
           }
       }        
      
       for(int i=1; i<5; i++) {
           try {
               if(map[x-i][y-i]!=돌){
                   break;
               } else    {
                   if(map[x-i][y-i]==돌) {
                       cnt++;
                   }                    
               }
           } catch (ArrayIndexOutOfBoundsException e) {
               i=5;                
           }
       }
      
       if(cnt>=5) {
           return false;
       }
      
       // ／／／／／／／／／／／／／／／／／／／／／／／／／／ 확인!!!!
       cnt = 1;
      
       for(int i=1; i<5; i++) {
           try { // 시도 할 문장
               if(map[x+i][y-i]!=돌){
                   break;
               } else    {
                   if(map[x+i][y-i]==돌) {
                       cnt++;
                   }                    
               }
           } catch (ArrayIndexOutOfBoundsException e) {
               // 배열 밖이네?
               i=5;
           }
       }        
      
       for(int i=1; i<5; i++) {
           try {
               if(map[x-i][y+i]!=돌){
                   break;
               } else    {
                   if(map[x-i][y+i]==돌) {
                       cnt++;
                   }                    
               }
           } catch (ArrayIndexOutOfBoundsException e) {
               i=5;                
           }
       }
      
       if(cnt>=5) {
           return false;
       }
  
       return true;
   }
  
   public static void printMap(){
       for(int i=0; i<map.length; i++) {
           for(int j=0; j<map[i].length; j++) {
               System.out.print(map[i][j]);
           }
           System.out.println();
       }
   }    
}
