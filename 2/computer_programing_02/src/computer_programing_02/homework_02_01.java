package computer_programing_02;

import java.util.Scanner;

public class homework_02_01 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		int x; //500원 짜리 동전의 개수
		int y; //100원 짜리 동전의 개수
		int z; //50원 짜리 동전의 개수
		int k; //10원 짜리 동전의 개수
		int M; //총 금액
		
		System.out.println("저금통에 들어있는 돈의 액수를 계산하는 프로그램");
		System.out.print("500원의 개수 : ");
		x = input.nextInt();
		System.out.print("100원의 개수 : ");
		y = input.nextInt();
		System.out.print("50원의 개수 : ");
		z = input.nextInt();
		System.out.print("10원의 개수 : ");
		k = input.nextInt();
		
		M = 500*x + 100*y + 50*z + 10*k;
		System.out.println("돈의 액수는 총 " + M + "원 입니다.");
	}

}
