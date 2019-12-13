package day9;
public class PointTest {
	public static void main(String args[]) {
		Point3D p3 = new Point3D(1,2,3);	
		System.out.println(p3.getLocation());
	}
}
class Point {
	int x;	
	int y;
	Point(int x, int y) {		
		this.x = x;
		this.y = y;
	}
	String getLocation() {
		return "x :" + x + ", y :"+ y;
	}
}
class Point3D extends Point {
	int z;
	Point3D(int x, int y, int z) {
		super (x, y) ; // ���� ��� ���� ���� 2����, ���ڿ��� 2�� ���� �ȴ�. super �޼��� ����� �ʼ���.
		//this.x = x;
		//this.y = y; <-- �ڱ� ��� ������ �����ϸ� �ȴ�. �̰� �����ص� �ȴ�.
		this.z = z;
	}
	String getLocation() {	// �������̵� - ���ϰ��� �������� �����ϰ� , �����ε� - �Ź�߼� , 
		return super.getLocation() + ", z :" + z; // �ٷ����̼� - ���� �����̼� ���� ����. *return getLocation () - �ڱ� �ڽ� ������Ʈ. ����. ������ �ִ� �� �켱.
	}	
}













