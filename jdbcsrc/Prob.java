package jdbcsrc;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class Prob {
	public static void main(String[] args) throws ClassNotFoundException {
		Class.forName("oracle.jdbc.driver.OracleDriver");
		kaja("E");
	}

	public static void kaja(String fn) {
		
		
		String sql = "Select first_name, last_name, to_char(salary, '999,999')||'��' salary  from employees where first_name like '"+fn+"%'";
		try (	Connection conn = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:XE", "hr", "hr");
				Statement stmt = conn.createStatement();			
				ResultSet rs = stmt.executeQuery(sql);) {	//close �ϴ� �ֵ鸸 ���� �� ����. ���� �߿� closable ������ ����.	
			while (rs.next()) {
				System.out.print(rs.getString("first_name")+"(");
				System.out.print(rs.getString("last_name")+")");
				System.out.println(rs.getString("salary"));
			}
			
			
		}catch (SQLException e) {
			System.err.println("DB���� ���� �߻� : " + e);
		
		} catch (Exception e) {
			System.err.println("DB���� ���� �߻� : " + e);
		
		}
	}
		
}
