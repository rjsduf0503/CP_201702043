package computer_programing_06;
import java.util.Scanner;
public class E01 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.print("���ڿ��� �Է��Ͻÿ�: ");
		String str = input.next();
		System.out.println(reverse(str));
	}
	public static String reverse(String s){
		String r = "";
		for (int i=s.length()-1; i>=0; i--)
			r += s.charAt(i);
		return r;
	}
}