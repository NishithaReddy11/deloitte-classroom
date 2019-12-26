package deloitte;


import java.util.Scanner;
public class Note
{
	public static void main(String args[])
		{
			System.out.println("Enter the String:");
			Scanner sc=new Scanner(System.in);
			String str=sc.nextLine();
          		String reverse="";
          		int count=0;
			int i;
			for(i=str.length()-1;i>=0;i--)
				{
				reverse=reverse+str.charAt(i);
				}
			for(i=0;i<reverse.length();i++)
				{
				
				if(reverse.charAt(i)=='a'||reverse.charAt(i)=='e'||reverse.charAt(i)=='i'||reverse.charAt(i)=='o'||reverse.charAt(i)=='u')
    					count++;
				
				}	
				System.out.println("Reverse:"+reverse);
				System.out.println("vowels:"+count);
		}
}