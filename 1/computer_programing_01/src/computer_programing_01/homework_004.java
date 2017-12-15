		package computer_programing_01;
		
		import java.util.Scanner;

public class homework_004 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		final double PI = 3.141592;		
		int radius;
		int height;
		double volume;
				
		System.out.print("원기둥 밑면의 반지름을 입력하시오: ");
		radius = input.nextInt();
		System.out.print("원기둥의 높이를 입력하시오: ");
		height = input.nextInt();
		volume = radius * radius * PI * height ;
		System.out.print("원기둥의 부피는 " + volume + "입니다.");
				
	}
	
}
