package computer_programing_08;
import java.util.Scanner;
public class Seat{
	public static void main(String args[]){
		Scanner scan = new Scanner(System.in);
		int[] seat = new int[10];
		System.out.print("�¼��� �����ϰڽ��ϱ�? Yes(1) No(else)");
	
		int Start = scan.nextInt();
		int booked = 0;
		
		while(Start == 1){
			System.out.println("������ ���� ���´� ������ �����ϴ�.");
			System.out.println("------------------------");
			System.out.println("1 2 3 4 5 6 7 8 9 10");
			for(int i=0; i<10; i++){
				System.out.print(seat[i] + " ");
			}
			System.out.println();
			if (booked==10){
				break;
			}
			System.out.print("���° �¼��� �����Ͻðڽ��ϱ�? (n=-1�̸� ����)");
			int n = scan.nextInt();
			if (n == -1)
				break;
			else{
				seat[n-1] = 1;
				booked++;
			}
			System.out.println();
		}
		System.out.println("�̿����ּż� �����մϴ�.");
	}
}