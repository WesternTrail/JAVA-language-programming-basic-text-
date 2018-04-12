import java.util.Scanner;

public class meisen{
	public static void main(String[] args)
	{
		Scanner input = new Scanner(System.in);
    	System.out.println("p\t\t2^p-1");
    	System.out.println("-------------------");
    	for(int i = 1;i <= 31;i++)
    	{
    		double ans = Math.pow(2,i) - 1;
    		if(isPrime(ans)){
    			System.out.println(i+"\t\t"+ans);
			}
		}
	}
	
	public static boolean isPrime(double ans){
		for(double i = 2;i <= ans/2;i++){
			if(ans%i==0)
				return false;
		}
		return true;
	}
}
