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
			int decimal = ch - 'A' + 10;
			
			String binary = "";
			
			while(decimal != 0)
			{
				int binaryValue = decimal % 2;
				binary = binaryValue + binary;
				decimal /= 2;
			}

			System.out.print("The binary value is "+binary);
		}
		
		else if(Character.isDigit(ch)){
			int decimal = ch - 'A' + 10;
			
			String binary = "";
			
			while(decimal != 0)
			{
				int binaryValue = decimal % 2;
				binary = binaryValue + binary;
				decimal /= 2;
			}

			System.out.print("The binary value is "+binary);
		}
		
		else
			System.out.println(ch + " is an invalid input");

	}
}
