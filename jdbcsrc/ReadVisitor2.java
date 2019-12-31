package jdbcsrc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.Scanner;

public class ReadVisitor2 {

	public static void main(String[] args) throws Exception {
		
		
		
		Class.forName("oracle.jdbc.driver.OracleDriver"); //����ó�� �� ����� ��
		
		Connection conn = DriverManager.getConnection(    //ctrl + shift + O
				                "jdbc:oracle:thin:@localhost:1521:XE", "jdbctest", "jdbctest");
		
		System.out.println(conn);
		
		Statement stmt = conn.createStatement();
		
		Scanner scan = new Scanner(System.in);
		System.out.println("�˻��� �̸��� �Է��ϼ��� : ");
		String searchName = scan.nextLine();
		scan.close();
		
		String sql = "Select name, writedate, memo from Visitor " + "where name = '"+searchName+"'";
		ResultSet rs = stmt.executeQuery(sql);
		
	    if(rs.next()) {
			System.out.println(rs.getString("name") + ":" +
		                       rs.getString("writedate") + ":" +
					           rs.getString("memo"));
		} else {
			System.out.println(searchName + "���� �ۼ��� ���� �����ϴ�.");
		}
		
		System.out.println("-----------------��----------");
		rs.close();
		stmt.close();
		conn.close();

	}

}
