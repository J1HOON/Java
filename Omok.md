## 10x10 오목 만들기
## 중요 코드
![image](https://user-images.githubusercontent.com/102014376/180173080-6aa2282f-a3a7-44aa-b63f-ebda62508d2a.png)
### public class 안에 기본 오목판 틀을 2차원 배열을 이용해 만듦.
### --
![image](https://user-images.githubusercontent.com/102014376/180173502-87a8509b-a910-4bf3-902a-701c496a15f2.png)
### 메인 메서드에 흑돌과 백돌의 차례를 분할한 다음 번갈아 가며 돌을 놓는 코드를 Scanner를 이용해 값을 받고 printMap 메서드를 이용해 바뀐 오목판을 출력함.

#### //만약 솨표지정을 한 오목판위가 다른 돌이나 자신의 돌로 채워져 있을 경우 if문을 이용해 분별한다.
### --

![image](https://user-images.githubusercontent.com/102014376/180174798-61ce21fa-86d2-4333-ab73-b859654b7fb2.png)
### 끝 메서드를 이용해 자신이 좌표를 지정한 돌을 기준으로 가로, 세로, 대각선을 스캔해 만약 돌이 있을경우 cnt변수를 이용해서 5개이상인지 아닌지 구분함.
![image](https://user-images.githubusercontent.com/102014376/180178572-3412dded-a68e-47b6-8376-a359d64dff27.png)
### 세로 스캔



#### //만약 스캔하는 범위가 2차원배열을 넘어갔을 경우 try catch를 이용해 배열 바깥으로 나가는 오류를 막아둔다.
### --
![image](https://user-images.githubusercontent.com/102014376/180178307-ea703c9e-4341-4514-9616-150e4a9250ba.png)
### 코드를 끝내기 위해 boolean의 값을 조정.
### --
![image](https://user-images.githubusercontent.com/102014376/180175474-af4f04eb-612b-4c2e-8b6f-c2b63816dd3c.png)
### 위에서 설명한 오목판을 출력하는 메서드.


## 출력
![image](https://user-images.githubusercontent.com/102014376/180465273-da43409d-0b73-4ec1-9eab-7ee44234fecb.png)
### //5줄이 됐을 경우 cnt를 통해 승 패를 결정함.

![image](https://user-images.githubusercontent.com/102014376/180465832-4666aa1e-d7e8-4777-bfe9-96d7702a18c7.png)
### //같은 좌표에 돌이 놓아질 경우 다시 입력하라는 출력이 나오면섬 다시 되돌아감.
