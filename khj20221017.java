package task;

import java.util.Scanner;	//scanner Ŭ���� ȣ��

public class khj20221017 {
	public static void main(String[] args) {
		int[] user_scores = {0, 0, 0};	// win, lose, ���º�
		int[] com_scores = {0, 0, 0};
		
		while(true) {	//���������� ��� �ݺ��ϱ�
			System.out.println("------------------------");
			System.out.println("���������� ���� ����!\n�ϳ��� �������ּ���.");
			System.out.println("1. ���� / 2. ���� / 3. ��");
			Scanner sc = new Scanner(System.in);	// Scanner ��ü ����
			int userrsp = sc.nextInt();		// ������ ������ ���� ����
			user(userrsp);
			
			if(userrsp != 1 && userrsp != 2 && userrsp != 3) {	//1,2,3�� �ϳ��� ������ ���
				continue;	//�ٽ� ���� �ö�
			}
			int comrsp = comrsp();
			com(comrsp);
			
			if(userrsp == comrsp) {
				System.out.println("��, ����.");
				user_scores[2]++;
				com_scores[2]++;
				System.out.println("You-��:"+user_scores[0]+" ��:"+user_scores[1]+" ��:"+user_scores[2]);
				System.out.println("com-��:"+com_scores[0]+" ��:"+com_scores[1]+" ��:"+com_scores[2]);
			}
			else if((userrsp == 1 && comrsp == 3)||(userrsp == 2 && comrsp == 1)||(userrsp == 3 && comrsp == 2)) {
				System.out.println("��� �̰��!");
				user_scores[0]++;
				com_scores[1]++;
				System.out.println("You-��:"+user_scores[0]+" ��:"+user_scores[1]+" ��:"+user_scores[2]);
				System.out.println("com-��:"+com_scores[0]+" ��:"+com_scores[1]+" ��:"+com_scores[2]);
			}
			else {
				System.out.println("�ȵ�, ����...");
				com_scores[0]++;
				user_scores[1]++;
				System.out.println("You-��:"+user_scores[0]+" ��:"+user_scores[1]+" ��:"+user_scores[2]);
				System.out.println("com-��:"+com_scores[0]+" ��:"+com_scores[1]+" ��:"+com_scores[2]);
			}
		}
	}

	public static int comrsp() {	//��ǻ�Ͱ� ���� ���� 1,2,3
		double x = 3 * Math.random();
		int temp = (int) x;
		return temp + 1;
	}
	
	public static void user(int userrsp) {		//���� ���� ���´��� ���� �˷��ִ°�
		switch(userrsp) {
		case 1:
			System.out.println("�� : ����");
			break;
		case 2:
			System.out.println("�� : ����");
			break;
		case 3:
			System.out.println("�� : ��");
			break;
		default:
			System.out.println("1, 2, 3 �߿� ����ֽʽÿ�.");
		}
	}
	
	public static void com(int comrsp) {		//��ǻ�Ͱ� ���� ���´��� ���� �˷��ִ°�
		switch(comrsp) {
		case 1:
			System.out.println("�� : ����");
			break;
		case 2:
			System.out.println("�� : ����");
			break;
		case 3:
			System.out.println("�� : ��");
			break;
		}
	}
}
