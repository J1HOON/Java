import java.util.*;
public class O_mok {
	   static String[][] map = {
               {"��","��","��","��","��","��","��","��","��","��"}, // map[0][0-9]
               {"��","��","��","��","��","��","��","��","��","��"}, // map[1][0-9]
               {"��","��","��","��","��","��","��","��","��","��"}, // map[2][0-9]
               {"��","��","��","��","��","��","��","��","��","��"}, // map[3][0-9]
               {"��","��","��","��","��","��","��","��","��","��"}, // map[4][0-9]
               {"��","��","��","��","��","��","��","��","��","��"}, // map[5][0-9]
               {"��","��","��","��","��","��","��","��","��","��"}, // map[6][0-9]
               {"��","��","��","��","��","��","��","��","��","��"}, // map[7][0-9]
               {"��","��","��","��","��","��","��","��","��","��"}, // map[8][0-9]
               {"��","��","��","��","��","��","��","��","��","��"}  // map[9][0-9]
       };
  
   public static void main(String[] args) {
      
       // �÷��̾�2 ����� �� ���� �۾�
      
       Scanner sc = new Scanner(System.in);

       System.out.print("�÷��̾�1�� �̸��� �Է��ϼ���~ ");
       String player1 = sc.next();
      
       System.out.print("�÷��̾�2�� �̸��� �Է��ϼ���~ ");
       String player2 = sc.next();
      
       boolean Loop = true;
      
       while(Loop) {
           int x, y;
          
           while(true) {
               System.out.printf("%s���� ���Դϴ�!", player1);
               System.out.printf("%s��, ��� ������? ", player1);
               System.out.print("Y�� : ");
               x = sc.nextInt();
               System.out.print("X�� : ");
               y = sc.nextInt();
              
               if(map[x][y]=="��" || map[x][y]=="��") { // �� �۰� �����Ҷ�!
                   System.out.println("���� �̹� �����մϴ�. �ٽ� �Է��ϼ���!");
                   continue;
               } else {
                   map[x][y] = "��";
                   break;
               }
           }
           printMap();
          
           if(������(x, y, "��")==false) {
               System.out.println(player1 + "���� �¸�!!");
               break;
           }
          
           while(true) {
               System.out.printf("%s���� ���Դϴ�!", player2);
               System.out.printf("%s��, ��� ������? x y", player2);
               System.out.print("Y�� : ");
               x = sc.nextInt();
               System.out.print("X�� : ");
               y = sc.nextInt();
              
               if(map[x][y]=="��" || map[x][y]=="��") { // �� �۰� �����Ҷ�!
                   System.out.println("���� �̹� �����մϴ�. �ٽ� �Է��ϼ���!");
                   continue;
               } else {
                   map[x][y] = "��";
                   break;
               }
           }
           printMap();
          
           if(������(x, y, "��")==false) {
               System.out.println(player2 + "���� �¸�!!");
               break;
           }
       }
   }
  
   private static boolean ������(int x, int y, String ��) {
      
       // ���ΰ��ΰ��ΰ��ΰ��ΰ��ΰ��ΰ��ΰ��ΰ��ΰ��ΰ��ΰ��ΰ��ΰ��� Ȯ��!!!!
       int cnt = 1;
      
       for(int i=1; i<5; i++) {
           try { // �õ� �� ����
               if(map[x][y+i]!=��){
                   break;
               } else    {
                   if(map[x][y+i]==��) {
                       cnt++;
                   }                    
               }
           } catch (ArrayIndexOutOfBoundsException e) {
               // �迭 ���̳�?
               i=5;
           }
       }        
      
       for(int i=1; i<5; i++) {
           try {
               if(map[x][y-i]!=��){
                   break;
               } else    {
                   if(map[x][y-i]==��) {
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
      
       // ���μ��μ��μ��μ��μ��μ��μ��μ��μ��μ��μ��μ��μ��μ��μ��� Ȯ��!!!!
       cnt = 1;
      
       for(int i=1; i<5; i++) {
           try { // �õ� �� ����
               if(map[x+i][y]!=��){
                   break;
               } else    {
                   if(map[x+i][y]==��) {
                       cnt++;
                   }                    
               }
           } catch (ArrayIndexOutOfBoundsException e) {
               // �迭 ���̳�?
               i=5;
           }
       }        
      
       for(int i=1; i<5; i++) {
           try {
               if(map[x-i][y]!=��){
                   break;
               } else    {
                   if(map[x-i][y]==��) {
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
      
       // ������������������������������������������������������ Ȯ��!!!!
       cnt = 1;
      
       for(int i=1; i<5; i++) {
           try { // �õ� �� ����
               if(map[x+i][y+i]!=��){
                   break;
               } else    {
                   if(map[x+i][y+i]==��) {
                       cnt++;
                   }                    
               }
           } catch (ArrayIndexOutOfBoundsException e) {
               // �迭 ���̳�?
               i=5;
           }
       }        
      
       for(int i=1; i<5; i++) {
           try {
               if(map[x-i][y-i]!=��){
                   break;
               } else    {
                   if(map[x-i][y-i]==��) {
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
      
       // ���������������������������������������������������� Ȯ��!!!!
       cnt = 1;
      
       for(int i=1; i<5; i++) {
           try { // �õ� �� ����
               if(map[x+i][y-i]!=��){
                   break;
               } else    {
                   if(map[x+i][y-i]==��) {
                       cnt++;
                   }                    
               }
           } catch (ArrayIndexOutOfBoundsException e) {
               // �迭 ���̳�?
               i=5;
           }
       }        
      
       for(int i=1; i<5; i++) {
           try {
               if(map[x-i][y+i]!=��){
                   break;
               } else    {
                   if(map[x-i][y+i]==��) {
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
