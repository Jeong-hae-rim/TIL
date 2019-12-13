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
		super (x, y) ; // 숫자 상관 없이 숫자 2개만, 문자열을 2개 들어가면 된다. super 메서드 사용이 필수적.
		//this.x = x;
		//this.y = y; <-- 자기 멤버 변수만 세팅하면 된다. 이건 생략해도 된다.
		this.z = z;
	}
	String getLocation() {	// 오버라이딩 - 리턴값의 유형까지 동일하게 , 오버로딩 - 매배견수 , 
		return super.getLocation() + ", z :" + z; // 겟로케이션 - 현재 로케이션 정보 리턴. *return getLocation () - 자기 자신 로케이트. 에러. 가까이 있는 게 우선.
	}	
}













