package project1;
class Example
{
	int add(int a ,int b)
	{
		return a+b;
	}
	double add(double a,double b,double c)
	{
		return a+b+c;
	}
	float add(float a,float b)
	{
		return a+b;
	}
	int add(int a)
	{
		return a*a;
	}
}
public class MethodOverloading {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Example e=new Example();
		System.out.println(e.add(7,9));
		System.out.println(e.add(3.2,2.3,3.3));
		System.out.println(e.add(3.2f,2.3f));
		System.out.println(e.add(3));
		
	}

}
