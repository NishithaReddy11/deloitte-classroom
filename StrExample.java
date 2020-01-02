package project1;

public class StrExample {

	public static void main(String[] args)throws Exception {
		// TODO Auto-generated method stub
		String []names= {"Chanyeol","Beakhyun","Sehun","Lay","Suho"};
		for(int i=0;i<names.length;i++)
		{
			for(int j=i+1;j<names.length;j++)
			{
				if(names[i].compareTo(names[j])>0)
				{
					String temp=names[i];
					names[i]=names[j];
					names[j]=temp;
				}
			}
		}
		for(String name:names)
		{
			System.out.println(name);
		}
	}

}
