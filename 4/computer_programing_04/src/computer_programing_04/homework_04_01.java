package computer_programing_04;
import java.util.*;
public class homework_04_01 {

	public static void main(String[] args) {
		Random rand = new Random(System.currentTimeMillis());
		int num1 = 0;
		int num2 = 0;
		int num3 = 0;
		int num4 = 0;
		int num5 = 0;
		int num6 = 0;
		
		for(int i=0;i<6;i++)
			switch (i){
			case 0:
				num1 = rand.nextInt(45) + 1;
				break;
			case 1:
				num2 = rand.nextInt(45) + 1;
				while (num2 == num1)
					num2 = rand.nextInt(45) + 1;
					break;
			case 2:
				num3 = rand.nextInt(45) + 1;
				while (num3 == num2 || num3 == num1)
					num3 = rand.nextInt(45) + 1;
					break;
			case 3:
				num4 = rand.nextInt(45) + 1;
				while (num4 == num3 || num4 == num2 || num4 == num1 )
					num4 = rand.nextInt(45) + 1;
					break;
			case 4:
				num5 = rand.nextInt(45) + 1;
				while (num5 == num4 || num5 == num3 || num5 == num2 || num5 == num1)
					num5 = rand.nextInt(45) + 1;
					break;
			case 5:
				num6 = rand.nextInt(45) + 1;
				while (num6 == num5 || num6 == num4 || num6 == num3 || num6 == num2 || num6 == num1)
					num6 = rand.nextInt(45) + 1;
					break;
			}	
		System.out.println("<로또 생성 프로그램>");
		System.out.print(num1+" "+num2+" "+num3+" "+num4+" "+num5+" "+num6);	
	}
}