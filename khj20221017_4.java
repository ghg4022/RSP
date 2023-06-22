package task;

import java.util.Scanner;	//scanner 클래스 호출

public class khj20221017_4 {
	public static void main(String[] args) {
		int[] user_scores = {0, 0};	// win, lose
		int[] com_scores = {0, 0};
		System.out.println("※주의 : 1, 2, 3을 제외한 숫자를 입력하면 그 판 무효");
		while(true) {
			System.out.println("------------------------");
			System.out.println("묵찌빠 게임 시작!\n하나를 선택해주세요.");
			System.out.println("1. 묵 / 2. 찌 / 3. 빠");
			Scanner sc = new Scanner(System.in);	// Scanner 객체 생성
			int userrsp = sc.nextInt();		// 유저가 내는거 값 넣기
			int comrsp = comrsp();			// 컴퓨터가 내는거 값 넣기
			
			user(userrsp);
			if(userrsp != 1 && userrsp != 2 && userrsp != 3) {
				continue;
			}
			com(comrsp);
			
			if(userrsp == comrsp) {
				System.out.println("다시!");
				continue;
			}
			
			while(userrsp != comrsp) { 
				if((userrsp == 1 && comrsp == 2)||(userrsp == 2 && comrsp == 3)||(userrsp == 3 && comrsp == 1)) {		//이겼을때
					System.out.printf("공격 : %s에서 뭐로 바꿀까?\n", userrsp);
					System.out.println("1. 묵 / 2. 찌 / 3. 빠");
					userrsp = sc.nextInt();		//뭐로 바꿀지 선택
					user(userrsp);
					if(userrsp != 1 && userrsp != 2 && userrsp != 3) {	//이걸 써야 컴퓨터가 뭐냇는지 말하는게 안보임
						continue;
					}
					comrsp = comrsp();
					com(comrsp);
					
					if(userrsp == comrsp) {
						System.out.println("이겼다!");
						user_scores[0]++;
						com_scores[1]++;
						System.out.println("You-승:"+user_scores[0]+" 패:"+user_scores[1]);
						System.out.println("com-승:"+com_scores[0]+" 패:"+com_scores[1]);
						break;
					}
					else {
						continue;
					}
				}
				
				if((userrsp == 1 && comrsp == 3)||(userrsp == 2 && comrsp == 1)||(userrsp == 3 && comrsp == 2)){		//공격 졌을때
					System.out.printf("수비 : %s에서 뭐로 바꿀까?\n", userrsp);
					System.out.println("1. 묵 / 2. 찌 / 3. 빠");
					userrsp = sc.nextInt();		//뭐로 바꿀지 선택
					user(userrsp);
					if(userrsp != 1 && userrsp != 2 && userrsp != 3) {
						continue;
					}
					comrsp = comrsp();
					com(comrsp);
					
					if(userrsp == comrsp) {
						System.out.println("졌다...");
						user_scores[1]++;
						com_scores[0]++;
						System.out.println("You-승:"+user_scores[0]+" 패:"+user_scores[1]);
						System.out.println("com-승:"+com_scores[0]+" 패:"+com_scores[1]);
						break;
					}
					else {
						continue;
					}
				}
				
				else {
					break;
				}
				
			}
		}
	}
	
	public static void user(int userrsp) {		//내가 낸거 뭐냈는지 말로 알려주는거
		switch(userrsp) {
		case 1:
			System.out.println("나 : 묵");
			break;
		case 2:
			System.out.println("나 : 찌");
			break;
		case 3:
			System.out.println("나 : 빠");
			break;
		default:
			System.out.println("1, 2, 3 중에 골라주십시오.");
		}
	}
	
	public static void com(int comrsp) {		//컴퓨터가 낸거 뭐냈는지 말로 알려주는거
		switch(comrsp) {
		case 1:
			System.out.println("컴 : 묵");
			break;
		case 2:
			System.out.println("컴 : 찌");
			break;
		case 3:
			System.out.println("컴 : 빠");
			break;
		}
	}
	
	public static int comrsp() {	//컴퓨터가 내는 랜덤 1,2,3
		double x = 3 * Math.random();
		int temp = (int) x;
		return temp + 1;
	}
}
