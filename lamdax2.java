package project1;
interface Operation{
	double operate(double a,double b);
}
class Calculation{
	double calculate(double i,double j,Operation op)
	{
		return op.operate(i, j);
	}
}
public class lamdax2 {
	public static void main(String[] args)
	{
		Calculation cal=new Calculation();
		double a=5.6,b=3.8;
		double sum=cal.calculate(a, b, (x,y)->x+y);
		double mul=cal.calculate(a, b, (x,y)->x*y);
		System.out.println(sum);
		System.out.println(mul);
	}

}
