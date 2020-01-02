package project1;
import java.util.Scanner;

public class SwitchCase {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int amount,choice,total=0;
		System.out.println("Enter option:1->INR-USD 2->USD-INR");
		Scanner sc=new Scanner(System.in);
		choice=sc.nextInt();
		switch(choice)
		{
		case 1:System.out.println("Enter amount:");
			   amount=sc.nextInt();
			   total=amount*71;	
				System.out.println("Total:"+total);
				break;
		case 2:System.out.println("Enter amount:");
		       amount=sc.nextInt();
			   total=amount/71;
				System.out.println("Total:"+total);
		default:System.out.println("Invalid option");
		}
	}

}
