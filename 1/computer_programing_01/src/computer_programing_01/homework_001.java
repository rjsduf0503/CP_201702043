		package computer_programing_01;

		import java.util.Scanner;

public class homework_001 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		double mile;
		double kilo;

		System.out.print("������ �Է��Ͻÿ�: ");
		mile = input.nextDouble();
		kilo = mile * 1.609;
		

		System.out.println(mile + "������ " + kilo + "ų�ι��� �Դϴ�.");
	}

}
