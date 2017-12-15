package computer_programing_06;
import java.util.Scanner;
public class Account {
	Scanner input = new Scanner(System.in);
	String id, pw, ID, PW;
	
	public void account(){
		System.out.println("<계정 생성>");
		System.out.print("아이디를 입력하시오: ");
		id = input.next();
		System.out.print("비밀번호를 입력하시오: ");
		pw = input.next();
	}
	public void login(){
		System.out.println("<로그인>");
		System.out.print("ID: ");
		ID = input.next();
		System.out.print("PW: ");
		PW = input.next();

		if (ID.equals(id) && PW.equals(pw))
				System.out.println("로그인 성공");
			else
				System.out.println("로그인 실패");
	}
}