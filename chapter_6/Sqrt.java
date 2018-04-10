import java.util.Scanner;

public class Sqrt{
	public static void main(String[] args)
	{
		Scanner input = new Scanner(System.in);
		System.out.print("please enter a nnumber");
		long number = input.nextLong();
		System.out.println(number+"'s sqrt is "+sqrt(number));
	}
	
	public static double sqrt(long n)
	{
		double lastGuess = 1;
		double nextGuess;
		while(true)
		{
			nextGuess = (lastGuess + n/lastGuess) / 2;
			if(Math.abs(nextGuess-lastGuess) <= 0.0001)
				return nextGuess;
			else
				lastGuess = nextGuess;
		}
	}
}
