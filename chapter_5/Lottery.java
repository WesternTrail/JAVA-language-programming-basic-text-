import java.util.Scanner;

public class Lottery{
	public static void main(String[] args)
	{
		Scanner input = new Scanner(System.in);
		//产生第一个数据 
		int lottery = (int)(Math.random()*10);
		int aottery = (int)(Math.random()*10);
		
		while(lottery==aottery)
		{
			aottery = (int)(Math.random()*10);
		}
		
		int lotteryDigit1 = lottery/10;
		int lotteryDigit2 = lottery%10;
		
		//输入猜测的值
		int guess = input.nextInt();
		int guessDigit1 = guess/10;
		int guessDigit2 = guess%10;
		
		if(guess == lottery)
			System.out.println("You win $10,000");
		else if(lotteryDigit2 == guessDigit1&&lotteryDigit1 == guessDigit2)
			System.out.println("You win $3,000");
		else if(lotteryDigit1 == guessDigit1
		||lotteryDigit1 == guessDigit2
		||lotteryDigit2 == guessDigit1
		||lotteryDigit2 == guessDigit2)
			System.out.println("you win $1,000"); 
	}
}
