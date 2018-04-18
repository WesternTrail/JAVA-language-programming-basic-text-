import java.util.Scanner;
import java.util.*;

public class GCD{
	
	public static void main(String[] args){
		Scanner input = new Scanner(System.in);
		System.out.println(gcd(16,48,57,28));	
	}
	
	public static int gcd(int... numbers){
		int minN = getMin(numbers);
		int j;
		//找出最小的值
		for(j = minN;j >= 2;j--){
			int count = 0;
			for(int i = 0;i < numbers.length;i++){
				if(numbers[i]%j == 0){
					count++;
				}
			}
			
			if(count==numbers.length){
				return j;
			}	
		}
		return -1; 
	}
	
	public static int getMin(int... numbers){
		int min = numbers[0];
		for(int i = 0;i < numbers.length;i++){
			if(min > numbers[i]){
				min = numbers[i];
			}
		}
		return min;
	}
}
