import java.util.*;
import java.util.Scanner;

public class Bean{
	public static void main(String[] args){
		Scanner input = new Scanner(System.in);
		System.out.print("Enter the number of balls to drop:");
		int n = input.nextInt();
		System.out.print("Enter the number of slots int the bean meachine:");
		int slot = input.nextInt();
	
		int[] slots = new int[slot];	//slots�洢���е���ĸ��� 
		for(int i = 0;i < n;i++){
			int countRight = 0;
			for(int j = 0;j < slot;j++){
				double select = Math.random();
				if(select >= 0.5){
					countRight++;
					System.out.print('R');
				}else
					System.out.print('L');
			}
			slots[countRight]++;
			System.out.println();
		}
		
		//�ҳ����������ĸ��� 
		int numberofslots = max(slots);
		
		//��ӡ���ӵķֲ�:
		for(int i = 0;i < numberofslots;i++){
			for(int j = 0;j < slot;j++){
				if(slots[j] == numberofslots - i){
					System.out.print('0');
					slots[j]--;
				}
				else
					System.out.print(' ');
			}
			System.out.println();
		}
	}
	
	public static int max(int[] num){
		int maxNum = 0;
		for(int i = 0;i < num.length;i++){
			if(num[i] > maxNum)
				maxNum = num[i];
		}
		return maxNum;
	}
}
