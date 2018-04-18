import java.util.Scanner;
import java.util.*;

public class random{
	public static void main(String[] args){
		Scanner input = new Scanner(System.in);
		System.out.println(getRandom(2,3,4,5,7));	
	}
	public static int getRandom(int... numbers){
		int a = (int)(1+Math.random()*54);
		while(Arrays.binarySearch(numbers,a) >= 0){
			a = (int)(1+Math.random()*54);
		}
		return a;
	}
}
