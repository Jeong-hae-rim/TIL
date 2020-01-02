package jdbcsrc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.Random;

public class SelectEmpLab {

	public static void main(String[] args) {
		
		try {
			Class.forName("oracle.jdbc.OracleDriver");
		} catch(ClassNotFoundException e) {
			e.printStackTrace();
		}
		String sql = "select ename, sal, to_char(hiredate, 'yyyy\"년\" mm\"월\" dd\"일\"')hiredate from"+
		                                 " emp"; 
	
		Random ran = new Random ();
		boolean torf = ran.nextBoolean();
		
		try (	Connection conn = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:XE", "scott", "tiger");
				Statement stmt = conn.createStatement();			
				ResultSet rs = stmt.executeQuery(sql);) {	
			if (rs.next()) {
				if (torf) {
					do {
						System.out.print(rs.getString("ename") + " 직원의 월급은 ");
						System.out.println(rs.getString("sal") + "입니다.");
					} while (rs.next());
				} else {
					do {
					System.out.print(rs.getString("ename") + " 직원은 ");
					System.out.println(rs.getString("hiredate") + "에 입사했습니다.");
					} while (rs.next());
				}
			}
		} catch (Exception e) {
			System.err.println("오류 발생 : " + e);
		} 
	}

}

