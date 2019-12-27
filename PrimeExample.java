package project1;
import java.util.*;
public class PrimeExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the size of array");
		int n=sc.nextInt();
		int nums[]=new int[n];
		System.out.println("Enter the array");
		for(int i=0;i<n;i++)
		{
			nums[i]=sc.nextInt();
		}
		System.out.println("Prime numbers in the given array are:");
		for(int i=0;i<n;i++)
		{
			int c=0,k=nums[i];
			for(int j=1;j<=k;j++)
			{
				if((k%j)==0)
				{
					c++;
				}
			}
			if(c==2)
			{
				System.out.println(nums[i]);
			}
		}
		
	}

}
