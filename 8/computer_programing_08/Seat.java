package computer_programing_08;
import java.util.Scanner;
public class Seat{
	public static void main(String args[]){
		Scanner scan = new Scanner(System.in);
		int[] seat = new int[10];
		System.out.print("좌석을 예약하겠습니까? Yes(1) No(else)");
	
		int Start = scan.nextInt();
		int booked = 0;
		
		while(Start == 1){
			System.out.println("현재의 예약 상태는 다음과 같습니다.");
			System.out.println("------------------------");
			System.out.println("1 2 3 4 5 6 7 8 9 10");
			for(int i=0; i<10; i++){
				System.out.print(seat[i] + " ");
			}
			System.out.println();
			if (booked==10){
				break;
			}
			System.out.print("몇번째 좌석을 예약하시겠습니까? (n=-1이면 종료)");
			int n = scan.nextInt();
			if (n == -1)
				break;
			else{
				seat[n-1] = 1;
				booked++;
			}
			System.out.println();
		}
		System.out.println("이용해주셔서 감사합니다.");
	}
}