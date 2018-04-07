import java.util.Scanner;

public class HexToDi{
	public static void main(String[] args)
	{
		Scanner input = new Scanner(System.in);
		//����һ��������2������ 
		int[] buf = new int[4];
		System.out.print("Enter a hex digit");
		String hexString = input.nextLine();
		if(hexString.length() != 1){
			System.out.println("please enter just one digit");
		}
		//Сдת��д��ĸ 
		char ch = Character.toUpperCase(hexString.charAt(0));
		
		if(ch <= 'F'&&ch >= 'A'){
			int value = ch - 'A' + 10;
			
			int i;//�������
			int sum = 0;	//��ź� 
			int k = 1;	//λ�� 
			
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
			
			int i;//�������
			int sum = 0;	//��ź� 
			int k = 1;	//λ��
			
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
