import java.util.Scanner;

public class rock{
	public static void main(String[] args)
	{
		Scanner input = new Scanner(System.in);
		int count = 0;	//记录电脑获胜的次数
		
		while(count != 3)
		{
			while(true){
				int rock = (int)(Math.random()*3);
				System.out.print("scissor(0),rock(1),paer(2):");
				int guess = input.nextInt();
				
				switch(rock){
					case 0:System.out.print("the computter is scissor. ");
							break;
					case 1:System.out.print("the computter is rock. ");
							break;
					case 2:System.out.print("the computter is paer. ");
							break;
				}
				
				switch(guess){
					case 0:System.out.print("you are scissor. ");
							break;
					case 1:System.out.print("you are rock. ");
							break;
					case 2:System.out.print("you are paer. ");
							break;
				}
				
				if(guess == rock)
					System.out.println("It is a draw. ");
				else if(guess == (rock+1)%3)
					System.out.println("You won. ");
				else{
					System.out.println("you lose. ");
					count++;
					break;			
				}
			}	
		} 
	}
}
