package computer_programing_02;

import java.util.Scanner;

public class homework_02_02 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		float A; //평
		float B; //평방미터
	
		System.out.println("평을 평방미터로 바꾸는 프로그램");
		System.out.print("평을 입력하시오 : ");
		A = input.nextFloat();
		
		B = A * 3.3058f ;

		System.out.println(A + "평은 " + B + "평방미터 입니다.");

	}

}
