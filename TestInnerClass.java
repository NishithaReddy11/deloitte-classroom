package project1;

class Outer
{
	void outerMethod()
	{
		System.out.println("from outer");
	}
	 static class Inner
	
	{
		void innerMethod()
		{
			System.out.println("From inner");
		}
	}
}
public class TestInnerClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Outer o=new Outer();
		o.outerMethod();
		//Outer.Inner i=o.new Inner();//For inner class
		Outer.Inner i=new Outer.Inner();//For Static inner class
		i.innerMethod();
	}

}
