		package computer_programing_01;

		import java.util.Scanner;

public class homework_003 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
			
		double cm;
		double feet;
		double inch;
		double cm2;

		System.out.print("Ű�� �Է��Ͻÿ�: ");
		cm = input.nextDouble();
		feet = cm / 2.54 / 12 ;
		cm2 = cm - (int)feet * 12 * 2.54 ;
		inch = cm2 / 2.54 ; 
			
		System.out.println(cm + "cm�� " + (int)feet + "��Ʈ " + inch + "��ġ�Դϴ�.");
			
	}

}
