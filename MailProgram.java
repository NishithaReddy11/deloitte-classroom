package project1;

public class MailProgram {

	public static void main(String[] args)throws Exception {
		// TODO Auto-generated method stub
		String []emails= {"nishitha.gopu@gmail.com","teju@gmail.com","nishi@gmail.com","xyz@yahoo.com","abc@yahoo.com","sravani@hotmail.com","varshith@hotmail.com","rest@shortmail.com","pqr@yandex.com"};
		System.out.println("GMAIL:\t");
		for(int i=0;i<emails.length;i++)
		{	
			if(emails[i].contains("@gmail.com")==true)
			{
				
				System.out.println(emails[i]);
			}
		}
		System.out.println("HOTMAIL:");
		for(int i=0;i<emails.length;i++)
		{	
			if(emails[i].contains("@hotmail.com")==true)
			{
				
				System.out.println(emails[i]);
			}
		}
		System.out.println("YAHOO:");
		for(int i=0;i<emails.length;i++)
		{	
			if(emails[i].contains("@yahoo.com")==true)
			{
				
				System.out.println(emails[i]);
			}
		}
		System.out.println("OTHERS:");
		for(int i=0;i<emails.length;i++)
		{	
			if((emails[i].contains("@gmail.com")!=true)&&(emails[i].contains("@yahoo.com")!=true)&&(emails[i].contains("@hotmail.com")!=true))
			{
				
				System.out.println(emails[i]);
			}
		}
	}

}
