import java.util.Scanner;
import java.util.*;

public class Reveal{
	public static void main(String[] args){
		Scanner input = new Scanner(System.in);
		int[] buf = new int[10];
		int x;
		int k;
		int number = 0;
	 	for(int i = 0;i < 10;i++){
	 		int flag = 1;
			x = input.nextInt();
			if(i==0){
				buf[number++] = x;
			}
			else{
				for(k = 0;k < number;k++){
					if(buf[k]==x){
						flag = 0;
						break;
					}
				}
				if(flag == 1){
					buf[number++] = x;
				}
			}
		}
		System.out.println(Arrays.toString(buf));	
	}
}
