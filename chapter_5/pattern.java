import java.util.Scanner;

public class pattern{
	public static void main(String[] args)
	{
		//ͼ��1: 
		for(int i = 0;i < 7;i++)
		{
			for(int j = 1;j <= i+1;j++)
			{
				System.out.print(j+" ");
			}
			System.out.println("\n");
		}
		
			System.out.println("\n\n");
		//ͼ��2:
		for(int i = 7;i > 0;i--)
		{
			for(int j = 1;j < i;j++)
			{
				System.out.print(j+" ");
			}
			System.out.println("\n");
		}
		
			System.out.println("\n\n");
		//ͼ��3��
		for(int i = 1;i <= 6;i++)
		{
			for(int j = 1;j <= (6-i);j++)
			{
				System.out.print("  ");
			}
			for(int j = i;j >= 1;j--)
				System.out.print(j+" ");
			System.out.println("\n");
		} 
		
			System.out.println("\n\n");
		//ͼ��4�� 
		for(int i = 1;i <= 6;i++)
		{
			for(int j = 1;j <= (i-1);j++)
				System.out.print("  ");
			for(int j = 1;j <= (7-i);j++)
				System.out.print(j+" ");
			System.out.println("\n");
		}
	}
}
