package project1;

public class InheritanceExample {

	public static void main(String[] args)
	{
		Bowler b1;
		//=new Bowler();
		//b1.bowl();
		b1=new FastBowlers();
		b1.bowl();
		//Spinner s1=new Spinner();
		b1=new Spinner();
		b1.bowl();
	}

}
