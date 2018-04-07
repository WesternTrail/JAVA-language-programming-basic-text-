import java.util.Scanner;

public class HexToDi{
	public static void main(String[] args)
	{
		Scanner input = new Scanner(System.in);
		//定义一个数组存放2进制数 
		int[] buf = new int[4];
		System.out.print("Enter a hex digit");
		String hexString = input.nextLine();
		if(hexString.length() != 1){
			System.out.println("please enter just one digit");
		}
		//小写转大写字母 
		char ch = Character.toUpperCase(hexString.charAt(0));
		
		if(ch <= 'F'&&ch >= 'A'){
			int value = ch - 'A' + 10;
			
			int i;//存放余数
			int sum = 0;	//存放和 
			int k = 1;	//位数 
			
			while(value != 0)
			{
				i = value % 2;
				value /= 2;
				sum = sum + i*k;
				k *= 10;
			}
			System.out.print("The binary value is "+sum);
		}
		
		else if(Character.isDigit(ch)){
			int value = ch - '0';
			
			int i;//存放余数
			int sum = 0;	//存放和 
			int k = 1;	//位数
			
			while(value!=0)
			{
				i = value%2;
				value /= 2;
				sum = sum + i*k;
				k *= 10;
			}
			System.out.print("The binary value is "+sum);
		}
		
		else
			System.out.println(ch + " is an invalid input");

	}
}
