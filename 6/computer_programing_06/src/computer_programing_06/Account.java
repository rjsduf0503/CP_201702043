package computer_programing_06;
import java.util.Scanner;
public class Account {
	Scanner input = new Scanner(System.in);
	String id, pw, ID, PW;
	
	public void account(){
		System.out.println("<���� ����>");
		System.out.print("���̵� �Է��Ͻÿ�: ");
		id = input.next();
		System.out.print("��й�ȣ�� �Է��Ͻÿ�: ");
		pw = input.next();
	}
	public void login(){
		System.out.println("<�α���>");
		System.out.print("ID: ");
		ID = input.next();
		System.out.print("PW: ");
		PW = input.next();

		if (ID.equals(id) && PW.equals(pw))
				System.out.println("�α��� ����");
			else
				System.out.println("�α��� ����");
	}
}