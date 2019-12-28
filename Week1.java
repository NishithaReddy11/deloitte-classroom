package project1;
import java.util.*;
public class Week1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the number:");
		int num=sc.nextInt();
		int sum=0,n;
			while(num>0)
			{
				n=num%10;
				if(n%2!=0)
				{
					sum=sum+n;
				}
				num=num/10;
			}
			System.out.println("Addition of odd digits is:"+sum);

	}

}
