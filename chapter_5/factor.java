import java.util.Scanner;

public class factor{
	public static void main(String[] args)
	{
		Scanner input = new Scanner(System.in);
        int a = input.nextInt();
        System.out.println(a+"的所有因子是:");
        for(int i = 1;i <= a;i++){
        	if(a%i==0){
        		System.out.prinln(i+" ");
			}
		}
	}
}
