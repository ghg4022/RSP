package task;

import java.util.Scanner;	//scanner 클래스 호출

public class khj20221017 {
	public static void main(String[] args) {
		int[] user_scores = {0, 0, 0};	// win, lose, 무승부
		int[] com_scores = {0, 0, 0};
		
		while(true) {	//가위바위보 계속 반복하기
			System.out.println("------------------------");
			System.out.println("가위바위보 게임 시작!\n하나를 선택해주세요.");
			System.out.println("1. 가위 / 2. 바위 / 3. 보");
			Scanner sc = new Scanner(System.in);	// Scanner 객체 생성
			int userrsp = sc.nextInt();		// 유저가 무엇을 낼지 선택
			user(userrsp);
			
			if(userrsp != 1 && userrsp != 2 && userrsp != 3) {	//1,2,3이 하나도 없으면 출력
				continue;	//다시 위로 올라감
			}
			int comrsp = comrsp();
			com(comrsp);
			
			if(userrsp == comrsp) {
				System.out.println("앗, 비겼어.");
				user_scores[2]++;
				com_scores[2]++;
				System.out.println("You-승:"+user_scores[0]+" 패:"+user_scores[1]+" 무:"+user_scores[2]);
				System.out.println("com-승:"+com_scores[0]+" 패:"+com_scores[1]+" 무:"+com_scores[2]);
			}
			else if((userrsp == 1 && comrsp == 3)||(userrsp == 2 && comrsp == 1)||(userrsp == 3 && comrsp == 2)) {
				System.out.println("우와 이겼다!");
				user_scores[0]++;
				com_scores[1]++;
				System.out.println("You-승:"+user_scores[0]+" 패:"+user_scores[1]+" 무:"+user_scores[2]);
				System.out.println("com-승:"+com_scores[0]+" 패:"+com_scores[1]+" 무:"+com_scores[2]);
			}
			else {
				System.out.println("안돼, 졌다...");
				com_scores[0]++;
				user_scores[1]++;
				System.out.println("You-승:"+user_scores[0]+" 패:"+user_scores[1]+" 무:"+user_scores[2]);
				System.out.println("com-승:"+com_scores[0]+" 패:"+com_scores[1]+" 무:"+com_scores[2]);
			}
		}
	}

	public static int comrsp() {	//컴퓨터가 내는 랜덤 1,2,3
		double x = 3 * Math.random();
		int temp = (int) x;
		return temp + 1;
	}
	
	public static void user(int userrsp) {		//내가 낸거 뭐냈는지 말로 알려주는거
		switch(userrsp) {
		case 1:
			System.out.println("나 : 가위");
			break;
		case 2:
			System.out.println("나 : 바위");
			break;
		case 3:
			System.out.println("나 : 보");
			break;
		default:
			System.out.println("1, 2, 3 중에 골라주십시오.");
		}
	}
	
	public static void com(int comrsp) {		//컴퓨터가 낸거 뭐냈는지 말로 알려주는거
		switch(comrsp) {
		case 1:
			System.out.println("컴 : 가위");
			break;
		case 2:
			System.out.println("컴 : 바위");
			break;
		case 3:
			System.out.println("컴 : 보");
			break;
		}
	}
}
