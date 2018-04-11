import java.util.Scanner;

public class display{
	public static void main(String[] args)
	{
		Scanner input = new Scanner(System.in);
		int n;
		n = input.nextInt();
		pattern(n);
	}
	
	public static void pattern(int n)
	{
		for(int i = 1;i <= n;i++)
		{
			for(int j = 1;j <= (n-i);j++)
			{
				System.out.print("  ");
			}
			
			for(int j = i;j >= 1;j--)
			{
				System.out.print(j+" ");
			}
			
			System.out.println();
		}
		
	}
}
