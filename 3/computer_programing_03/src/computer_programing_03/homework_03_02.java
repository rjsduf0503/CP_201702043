package computer_programing_03;
import java.util.Scanner;
public class homework_03_02 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		double height;
		double weight;
		double SW;
		System.out.print("Ű�� �Է��Ͻÿ�: ");
		height = input.nextDouble();
		SW = (height-100)*0.9;
		System.out.print("ü���� �Է��Ͻÿ�: ");
		weight = input.nextDouble();
		
		if ( weight>SW*1.10 )
			System.out.println("��ü���Դϴ�.");
		else if ( weight<SW*0.90 )
			System.out.println("��ü���Դϴ�.");
		else
			System.out.println("����ü�� �Դϴ�.");
	}

}
