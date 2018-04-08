import java.util.Scanner;

public class isPrime{
	public static void main(String[] args)
	{
		Scanner input = new Scanner(System.in);
        int count = 0; //记录素数的个数
		for(int number = 2;number <= 1000;number++)
		{
			boolean isPrime = true;
			for(int i = 2;i <= number/2;i++)
			{
				if(number % i == 0){
					isPrime = false;
					break;
				}	
			}
			
			if(isPrime)
			{
				count++;
				if(count % 8 == 0)	//每行显示8个素数
					System.out.println(number);
				else
					System.out.print(number + " ");
			}
		} 
	}
}
