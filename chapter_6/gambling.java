import java.util.Scanner;

public class gambling{
	public static void main(String[] args)
	{
		while(true){
			int one = 1+(int)(Math.random()*6);
			int two = 1+(int)(Math.random()*6);
			int z = one + two;
			System.out.printf("you rolled %d + %d = %d\n",one,two,one+two);
			if(craps(one,two)){
				System.out.println("You lose");
				break;
			}
			
			else if(natural(one,two)){
				System.out.println("You Win");
				break;
			}
			
			else{
				one = 1+(int)(Math.random()*6);
				two = 1+(int)(Math.random()*6);
				System.out.printf("you rolled %d + %d = %d\n",one,two,one+two);
				if(z == one+two){
					System.out.println("You Win");
					break;
				}
				else if(one + two == 7){
					System.out.println("You Lose");
					break;
				}
				else continue;
			}
		}
	}
	
	public static boolean craps(int i,int j){
		if(i+j == 2||i+j==3||i+j==12)
			return true;
		else
			return false;
	}
	
	public static boolean natural(int i,int j){
		if(i+j == 7||i+j==11)
			return true;
		else
			return false;
	}
}
