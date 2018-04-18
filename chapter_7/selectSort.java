import java.util.*;

public class selectSort{
	public static void main(String[] args){
		int[] a = {2,9,5,4,8,1,6};
		selectSort(a);		
		System.out.println(Arrays.toString(a));
	}
	
	//SelectSort°æ±¾2
	public static void selectSort(int[] a){
		for(int i = a.length-1;i>=0;i--){
			int currentMax = a[i];
			int currentIndex = i;
			for(int j = i-1;j >= 0;j--){
				if(a[j] > currentMax){
					currentMax = a[j];
					currentIndex = j;
				}
			}
			
			if(currentIndex!=i){
				a[currentIndex] = a[i];
				a[i] = currentMax;
			}
		}	
	} 
}
