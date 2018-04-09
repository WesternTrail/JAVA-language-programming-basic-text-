import java.util.Scanner;

public class ISBN{
	public static void main(String[] args)
	{
		Scanner input = new Scanner(System.in);
		String number = input.next();
		int i = 1;
		int sum = 0;
		while(i < 9){
			sum += (number.charAt(i) - '0') * (i+1);
			i++;
		}
		
			sum %= 11;
			
		if(sum == 10)
			System.out.println(number+"X");
		else if(sum == 11)
			System.out.println(number+"O");
		else
			System.out.println(number+sum);
	}
}
