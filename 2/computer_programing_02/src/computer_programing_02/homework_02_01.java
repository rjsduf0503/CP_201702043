package computer_programing_02;

import java.util.Scanner;

public class homework_02_01 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		int x; //500�� ¥�� ������ ����
		int y; //100�� ¥�� ������ ����
		int z; //50�� ¥�� ������ ����
		int k; //10�� ¥�� ������ ����
		int M; //�� �ݾ�
		
		System.out.println("�����뿡 ����ִ� ���� �׼��� ����ϴ� ���α׷�");
		System.out.print("500���� ���� : ");
		x = input.nextInt();
		System.out.print("100���� ���� : ");
		y = input.nextInt();
		System.out.print("50���� ���� : ");
		z = input.nextInt();
		System.out.print("10���� ���� : ");
		k = input.nextInt();
		
		M = 500*x + 100*y + 50*z + 10*k;
		System.out.println("���� �׼��� �� " + M + "�� �Դϴ�.");
	}

}
