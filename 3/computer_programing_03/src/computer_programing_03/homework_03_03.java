package computer_programing_03;

public class homework_03_03 {

	public static void main(String[] args) {
		int i,j,k;
			
			
		for(i=0; i<5; i++)
		{
			for(j=0; j<=5-i; j++)
			{
				System.out.print(" ");
			}
			for(k=0; k<i*2+1; k++)
			{
				System.out.print("*");
			}
			System.out.println();
		}

		for(i=3; i>=0; i--)
		{
			for(j=i; j<=5; j++)
			{
				System.out.print(" ");
			}
			for(k=0; k<i*2+1; k++)
			{
				System.out.print("*");
			}
			System.out.println();
		}
	}
}