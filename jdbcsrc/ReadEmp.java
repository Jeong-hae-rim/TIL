package jdbcsrc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.Scanner;

public class ReadEmp {

	public static void main(String[] args) throws Exception {
		
		
		
		Class.forName("oracle.jdbc.driver.OracleDriver"); //예외처리 꼭 해줘야 함
		
		Connection conn = DriverManager.getConnection(    //ctrl + shift + O
				                "jdbc:oracle:thin:@localhost:1521:XE", "SCOTT", "tiger");
		
		System.out.println(conn);
		
		Statement stmt = conn.createStatement();
		
		Scanner scan = new Scanner(System.in);
		System.out.println("검색할 부서 번호를 입력하세요 : ");
		String num = scan.nextLine();
		scan.close();
		
		String sql = "Select ename, sal, deptno from emp " + "where deptno = " + num;
		ResultSet rs = stmt.executeQuery(sql);
		
	    if(rs.next()) {
	    	System.out.println(rs.getString("ename") + ":" +
                               rs.getInt("sal") + ":" +
			                   rs.getInt("deptno"));
	    	while(rs.next()) {
			System.out.println(rs.getString("ename") + ":" +
		                       rs.getInt("sal") + ":" +
					           rs.getInt("deptno"));
	    	}
		} else {
			System.out.println(num + "번 부서에 근무하는 직원이 없습니다.");
		}
		
		System.out.println("-----------------끝----------");
		rs.close();
		stmt.close();
		conn.close();

	}

}
