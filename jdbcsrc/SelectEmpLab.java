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
		String sql = "select ename, sal, to_char(hiredate, 'yyyy\"��\" mm\"��\" dd\"��\"')hiredate from"+
		                                 " emp"; 
	
		Random ran = new Random ();
		boolean torf = ran.nextBoolean();
		
		try (	Connection conn = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:XE", "scott", "tiger");
				Statement stmt = conn.createStatement();			
				ResultSet rs = stmt.executeQuery(sql);) {	
			if (rs.next()) {
				if (torf) {
					do {
						System.out.print(rs.getString("ename") + " ������ ������ ");
						System.out.println(rs.getString("sal") + "�Դϴ�.");
					} while (rs.next());
				} else {
					do {
					System.out.print(rs.getString("ename") + " ������ ");
					System.out.println(rs.getString("hiredate") + "�� �Ի��߽��ϴ�.");
					} while (rs.next());
				}
			}
		} catch (Exception e) {
			System.err.println("���� �߻� : " + e);
		} 
	}

}

