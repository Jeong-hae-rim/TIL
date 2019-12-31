package jdbcsrc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

public class ReadVisitor {

	public static void main(String[] args) throws Exception {
		
		
		
		Class.forName("oracle.jdbc.driver.OracleDriver"); //����ó�� �� ����� ��
		
		Connection conn = DriverManager.getConnection(    //ctrl + shift + O
				                "jdbc:oracle:thin:@localhost:1521:XE", "jdbctest", "jdbctest");
		
		System.out.println(conn);
		
		Statement stmt = conn.createStatement();
		
		String sql = "Select name, writedate, memo from Visitor";
		ResultSet rs = stmt.executeQuery(sql);
		
		while(rs.next()) {
			System.out.println(rs.getString("name") + ":" +
		                       rs.getString("writedate") + ":" +
					           rs.getString("memo"));
		}
		
		System.out.println("-----------------��----------");
		rs.close();
		stmt.close();
		conn.close();
	
	}

}
