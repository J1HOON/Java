# Java 야구게임 and Hit and blow 게임 




        while(true) {
            while(true){
                num[0] = r.nextInt(9)+1; //숫자 3개 랜덤으로 일의자리수 지정.
                num[1] = r.nextInt(9)+1;
                num[2] = r.nextInt(9)+1;
                if(!(num[0]==num[1]||num[1]==num[2]||num[0]==num[2])) { //중복제거
                    break; while(true) 써서 break를 걸어주어야 함.
                }
            }
            System.out.println(""); //줄 바꿈

            Scanner sc = new Scanner(System.in);

            while(true) {
                int strike = 0;
                int ball = 0;

                System.out.print("숫자 3개를 입력해주세요(띄어쓰기로 구분)"); //숫자 3개 입력
                answer[0] = sc.nextInt();
                answer[1] = sc.nextInt();
                answer[2] = sc.nextInt();

                // strike를 판단하는 조건문
                for(int i=0; i<answer.length; i++) {
                    if(num[i]==answer[i]) {
                        strike++;
                    }
                }
                // ball을 판단하는 조건문
                if(num[0]==answer[1]||num[0]==answer[2]) ball++;
                if(num[1]==answer[0]||num[1]==answer[2]) ball++;
                if(num[2]==answer[0]||num[2]==answer[1]) ball++;

                System.out.println(strike+" 스트라이크! "+ball+" 볼!");

                if(strike==3) {
                    System.out.println("정답");
                    break;
                }
            }
            //계속 반복할건지 게임을 마무리 할건지 선택.
            System.out.println("계속 ->아무숫자, 종료->2");
            int restart = sc.nextInt();
            if(restart==2) {
                System.out.println("게임을 종료합니다~~");
                System.exit(0);
                break;
            } else {
                System.out.println("게임을 다시 시작합니다!!");
            }
        }
    }


# 핵심 코드
![image](https://user-images.githubusercontent.com/102014376/173288637-32d9df36-d7d8-42bd-80a7-fa47a4559d68.png)

#출력
![image](https://user-images.githubusercontent.com/102014376/173288755-4893ebc7-c212-481e-ac63-f63aade6cc22.png)
### 숫자 3개를 입력 후 몇 스트라이크 몇 볼을 맞췄는지 출력한 후 다시 숫자 3개를 입력

![image](https://user-images.githubusercontent.com/102014376/173289033-19c2ebdb-d824-4841-8dc4-0d0a83f03d99.png)
### 게임을 완료하면 이 게임을 더 할것인지 아니면 종료할것인지의 대한 선택이 출력된다.

![image](https://user-images.githubusercontent.com/102014376/173289198-3d1b12d5-4ebe-4dae-a8a3-e74b83514ca8.png)
### 종료 후 출력된 텍스트



