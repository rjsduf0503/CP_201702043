package computer_programing_03;
import java.util.Scanner;
public class homework_03_01 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int a,b,c;
		
		System.out.println("3���� ���ڸ� �Է��Ͻÿ�: ");
		a = input.nextInt();
		System.out.print("");
		b = input.nextInt();
		System.out.print("");
		c = input.nextInt();
		
		if ( a>b&&b>c )
			System.out.print("���ĵ� ����: " + c + "," + b + "," + a);
		else if ( a>c&&c>b )
			System.out.print("���ĵ� ����: " + b + "," + c + "," + a);
		else if ( b>a&&a>c )
			System.out.print("���ĵ� ����: " + c + "," + a + "," + b);
		else if ( b>c&&c>a )
			System.out.print("���ĵ� ����: " + a + "," + c + "," + b);
		else if ( c>a&&a>b )
			System.out.print("���ĵ� ����: " + b + "," + a + "," + c);
		else if ( c>b&&b>a )
			System.out.print("���ĵ� ����: " + a + "," + b + "," + c);
	}
}