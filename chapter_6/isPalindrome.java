import java.util.Scanner;

public class isPalindrome{
	public static void main(String[] args)
	{
		Scanner input = new Scanner(System.in);
		System.out.print("please enter a nnumber");
		int number = input.nextInt();
		if(isPalindrome(number))
			System.out.print("Yes");
		else
			System.out.print("NO");
	}
	
	public static boolean isPalindrome(int i)
	{
		if(i == reverse(i))
			return true;
		else
			return false;
	}
	
	public static int reverse(int number)
	{
		int sum = 0;
		int i = 0;
		while(number!=0)
		{
			sum += (number%10)*Math.pow(10,i);
			number /= 10;
			i++;
		}
		return sum;
	}
}
