		package computer_programing_01;

		import java.util.Scanner;

public class homework_001 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		double mile;
		double kilo;

		System.out.print("마일을 입력하시오: ");
		mile = input.nextDouble();
		kilo = mile * 1.609;
		

		System.out.println(mile + "마일은 " + kilo + "킬로미터 입니다.");
	}

}
