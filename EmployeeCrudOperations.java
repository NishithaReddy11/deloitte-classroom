package Project1;
import java.sql.*;
import java.sql.DriverManager;
import java.io.*;
public class EmployeeCrudOperations {

	public static void main(String[] args)throws Exception {
		// TODO Auto-generated method stub
	//	Scanner sc=new Scanner(System.in);
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		Connection conn=DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe","system","admin");
//		if(conn!=null)
//		{
//			System.out.println("connection sucessful");
//		}
		//String job;
	//	System.out.println("Enter job role:");
		//job=br.readLine();
//		System.out.println("Enter values:");
//		System.out.println("Enter dept no:");
//		int deptno=Integer.parseInt(br.readLine());
//		System.out.println("Enter dept name:");
//		String deptname=br.readLine();
//		System.out.println("Enter Loaction:");
//		String loc=br.readLine();
		System.out.println("Enter new location:");
		String s1=br.readLine();
		System.out.println("Enter location u want to update:");
		String s2=br.readLine();
		//Statement smt=conn.createStatement();
		//PreparedStatement stmt=conn.prepareStatement("insert into dept values(?,?,?)");
		PreparedStatement stmt1=conn.prepareStatement("update dept set location=? where location=?");
		stmt1.setString(1, s1);
		stmt1.setString(2,s2);
//		stmt.setString(3, loc);
//		int r=stmt.executeUpdate();
			int r=stmt1.executeUpdate();
		//		int r=smt.executeUpdate("insert into dept values("+sc.nextInt()+",'"+sc.next()+"','"+sc.next()+"')");
		if(r>0)
		{
			System.out.println(r+" Data updated");
		}
//		ResultSet rs=smt.executeQuery("select * from employee where empno=7839 or job='"+job+"'");
//		System.out.println("EmpIds  EmpNames");
//		while(rs.next())
//		{
//			System.out.println(rs.getInt(1)+"    "+rs.getString(2));
//		}
	}

}
