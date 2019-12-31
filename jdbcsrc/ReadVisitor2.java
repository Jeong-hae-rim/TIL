package jdbcsrc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.Scanner;

public class ReadVisitor2 {

	public static void main(String[] args) throws Exception {
		
		
		
		Class.forName("oracle.jdbc.driver.OracleDriver"); //예외처리 꼭 해줘야 함
		
		Connection conn = DriverManager.getConnection(    //ctrl + shift + O
				                "jdbc:oracle:thin:@localhost:1521:XE", "jdbctest", "jdbctest");
		
		System.out.println(conn);
		
		Statement stmt = conn.createStatement();
		
		Scanner scan = new Scanner(System.in);
		System.out.println("검색할 이름을 입력하세요 : ");
		String searchName = scan.nextLine();
		scan.close();
		
		String sql = "Select name, writedate, memo from Visitor " + "where name = '"+searchName+"'";
		ResultSet rs = stmt.executeQuery(sql);
		
	    if(rs.next()) {
			System.out.println(rs.getString("name") + ":" +
		                       rs.getString("writedate") + ":" +
					           rs.getString("memo"));
		} else {
			System.out.println(searchName + "님이 작성한 글이 없습니다.");
		}
		
		System.out.println("-----------------끝----------");
		rs.close();
		stmt.close();
		conn.close();

	}

}
