		package computer_programing_01;
		
		import java.util.Scanner;

public class homework_004 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		final double PI = 3.141592;		
		int radius;
		int height;
		double volume;
				
		System.out.print("����� �ظ��� �������� �Է��Ͻÿ�: ");
		radius = input.nextInt();
		System.out.print("������� ���̸� �Է��Ͻÿ�: ");
		height = input.nextInt();
		volume = radius * radius * PI * height ;
		System.out.print("������� ���Ǵ� " + volume + "�Դϴ�.");
				
	}
	
}
