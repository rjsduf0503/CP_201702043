		package computer_programing_01;

		import java.util.Scanner;

public class homework_002 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		double fahrenheit;
		double celsius;
		
		System.out.print("ȭ�� �µ��� �Է��Ͻÿ�: ");
		fahrenheit = input.nextDouble();
		celsius = (5.0/9.0)*(fahrenheit-32);
		
		System.out.println(fahrenheit + "F�� ���� �µ��� " + celsius + "C�Դϴ�.");

	}

}
