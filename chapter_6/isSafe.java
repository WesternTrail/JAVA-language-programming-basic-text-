import java.util.Scanner;

public class isSafe{
	public static void main(String[] args)
	{
		Scanner input = new Scanner(System.in);
		System.out.print("please enter your password");
		String s = input.nextLine();
		s.toUpperCase();
		if(testChar(s)&&charandNum(s)&&number(s))
			System.out.print("valid word");
		else
			System.out.print("invalid word");
	}
	
	public static boolean testChar(String s)
	{
		int flag = 0;
		int Length = s.length();
		for(int i = 0;i < Length;i++)
		{
			if('A'<=s.charAt(i)&&s.charAt(i) <= 'Z')
				flag++;
		}
		
		if(flag >= 8)
			return true;
		else
			return false;
	}
	
	public static boolean charandNum(String s)
	{
		int Length = s.length();
		for(int i = 0;i < Length;i++)
		{
			if('A'>s.charAt(i)||s.charAt(i) > 'Z')
				return false;
		}
		
			return true;
	}
	
	public static boolean number(String s)
	{
		int flag = 0;
		int Length = s.length();
		for(int i = 0;i < Length;i++)
		{
			if('0'<=s.charAt(i)&&s.charAt(i) <= '9')
				flag++;
		}
		
		if(flag >= 2)
			return true;
		else
			return false;
	}
}
