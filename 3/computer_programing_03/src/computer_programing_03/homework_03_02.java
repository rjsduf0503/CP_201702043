package computer_programing_03;
import java.util.Scanner;
public class homework_03_02 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		double height;
		double weight;
		double SW;
		System.out.print("키를 입력하시오: ");
		height = input.nextDouble();
		SW = (height-100)*0.9;
		System.out.print("체중을 입력하시오: ");
		weight = input.nextDouble();
		
		if ( weight>SW*1.10 )
			System.out.println("과체중입니다.");
		else if ( weight<SW*0.90 )
			System.out.println("저체중입니다.");
		else
			System.out.println("정상체중 입니다.");
	}

}
