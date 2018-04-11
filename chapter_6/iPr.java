import java.util.Scanner;

public class iPr{
	public static void main(String[] args)
	{
		int flag = 0;
		int count = 0;
		int i = 1;
		while(count<=100)
		{
			if(isprimepalindromes(i))
			{
				
				if(count%10==0)
					System.out.printf("%-10d\n",i);
				else
					System.out.printf("%-10d",i);
				count++;	
			}
			i++;
		}
	}
	
	public static boolean isprimepalindromes(int i){
		if(isprime(i)&&isPalindromes(i))
			return true;
		else
			return false;
	}
	
	
	public static boolean isprime(int i){
		for(int j = 2;j <= i/2;j++)
		{
			if(i%j==0)
				return false;
		}
		return true;
	}
	
	public static boolean isPalindromes(int number){
		//»ñÈ¡numberµÄ×Ö·û´® 
		String s = "";
		int DigitValue;
		while(number!=0)
		{
			DigitValue = number%10;
			s = DigitValue + s;
			number/=10;
		}
		
		int low = 0;
		int high = s.length() - 1;
		while(low < high)
		{
			if(s.charAt(low) != s.charAt(high))
				return false;
				
			low++;
			high--;
		}
		return true;
	}
}
