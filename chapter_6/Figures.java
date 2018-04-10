import java.util.Scanner;

public class Figures{
	public static void main(String[] args)
	{
		Scanner input = new Scanner(System.in);
		System.out.print("please enter a nnumber");
		int number = input.nextInt();
		System.out.println(sumDigits(number));
	}
	
	public static int sumDigits(int i)
	{
		int sum = 0;
		while(i!=0)
		{
			sum += i%10;
			i/=10;
		}
		return sum;
	}
}
