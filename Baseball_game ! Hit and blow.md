# Java 야구게임 and Hit and blow 게임 


int num[] = new int[3];
        int answer[] = new int[3];
        Random r = new Random();

        while(true) {
            while(true){
                num[0] = r.nextInt(9)+1;
                num[1] = r.nextInt(9)+1;
                num[2] = r.nextInt(9)+1;
                if(!(num[0]==num[1]||num[1]==num[2]||num[0]==num[2])) {
                    break;
                }
            }
            System.out.println("");

            Scanner sc = new Scanner(System.in);

            while(true) {
                int strike = 0;
                int ball = 0;

                System.out.print("숫자 3개를 입력해주세요(띄어쓰기로 구분)");
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
            // 한겜더?
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
