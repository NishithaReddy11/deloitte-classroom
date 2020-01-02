package project1;
interface inter1{
	int sum(int i,int j);
}
//class MyClass implements inter1{
	//@override
	//public void show()
	//{
	//	System.out.println("Hello");
	//}
//}

public class TestInnerClass1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//inter1 i1=new inter1() {
		//	public void show() {
			//	System.out.println("Hello");
			//}
		//};
		inter1 i1=(i,j)->{System.out.println("sum");//this is lamdax statement`
							return i+j;};
							System.out.println(i1.sum(5, 6));
		
	}

}
