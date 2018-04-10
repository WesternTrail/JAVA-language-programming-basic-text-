import java.util.Scanner;

public class leapyear{
	public static void main(String[] args)
	{
		for(int year = 2000;year <= 2020;year++)
		{
			if(isleapyear(year))
				System.out.println("365");
			else
				System.out.println("366");	
		}
	}
	
	public static boolean isleapyear(int year)
	{
		return (year%400==0)||(year%4==0&&year%100!=0);
	}
}
