package computer_programing_03;
import java.util.Scanner;
public class homework_03_01 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int a,b,c;
		
		System.out.println("3개의 숫자를 입력하시오: ");
		a = input.nextInt();
		System.out.print("");
		b = input.nextInt();
		System.out.print("");
		c = input.nextInt();
		
		if ( a>b&&b>c )
			System.out.print("정렬된 숫자: " + c + "," + b + "," + a);
		else if ( a>c&&c>b )
			System.out.print("정렬된 숫자: " + b + "," + c + "," + a);
		else if ( b>a&&a>c )
			System.out.print("정렬된 숫자: " + c + "," + a + "," + b);
		else if ( b>c&&c>a )
			System.out.print("정렬된 숫자: " + a + "," + c + "," + b);
		else if ( c>a&&a>b )
			System.out.print("정렬된 숫자: " + b + "," + a + "," + c);
		else if ( c>b&&b>a )
			System.out.print("정렬된 숫자: " + a + "," + b + "," + c);
	}
}