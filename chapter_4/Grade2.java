import java.util.Scanner;

public class Grade2{
	public static void main(String[] args)
	{
		Scanner input = new Scanner(System.in);
		String s = input.next();
		
		if(s.contains("M"))
		{
			System.out.print("Mathematics ");
		}
		
		else if(s.contains("C"))
		{
			System.out.print("Computer Science junior ");
		}
		else if(s.contains("T"))
		{
			System.out.print("information technology ");
		}
		
		else
			System.out.print("Invalid input");
			
		if(s.contains("1"))
		{
			System.out.print("Freshman");
		}
		else if(s.contains("2"))
		{
			System.out.print("Junior");
		}
		else if(s.contains("3"))
		{
			System.out.print("Senior");
		}
		
	}
}
