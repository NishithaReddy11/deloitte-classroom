package project1;
import java.util.*;

public class Looping {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 int x;
		 Scanner sc=new Scanner(System.in);
		 System.out.println("Enter the number");
		 x=sc.nextInt();
		 for(int i=1;i<=x;i++)
		 {
			 for(int j=i;j>=1;j--)
			 {
				 if((j)%2==0)
				 {
					 System.out.print("0 ");
				 }
				 else
					 System.out.print("1 ");
			 }
			 System.out.println();
		 }
	}

}
