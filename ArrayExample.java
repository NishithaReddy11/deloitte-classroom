package project1;
import java.util.*;
public class ArrayExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.out.println("Enter the size of array:");
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int nums[]=new int[n];
		
		System.out.println("Enter the array:");
		for(int i=0;i<n;i++)
		{
			nums[i]=sc.nextInt();
		}
		int max=nums[0],min=nums[0];
		System.out.println("Max number is:");
		for(int i=0;i<n;i++)
		{
			if(nums[i]>max)
			{
				max=nums[i];
			}
			if(nums[i]<min)
			{
				min=nums[i];
			}
		}
		System.out.println(max);
		System.out.println("Min number is:");
		System.out.println(min);
	}

}
