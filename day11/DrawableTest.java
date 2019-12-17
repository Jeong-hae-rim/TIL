package day11;
import java.util.Random;
interface Drawable {
	 public abstract void draw(); //interface 클래스 내에서는 abstract가 저절로 붙음. 자동으로 public 형태.
}
class Rect implements Drawable {
	public void draw() {
		System.out.println("사각형을 그립니다.");
	}
}
class Circle implements Drawable {
	public void draw() {
		System.out.println("원을 그립니다.");
	}
}
class Diamond implements Drawable  {
	public void draw() {
		System.out.println("마름모를 그립니다.");
	}
}
public class DrawableTest {
	public static void main(String[] args) {
		Random rand = new Random();
		int num = rand.nextInt(3);
		Drawable d = null;
		if(num == 0)
			d = new Rect();
		else if(num == 1)
			d = new Circle();		
		else if(num == 2)
			d = new Diamond();		
		output(d);
	}
	public static void output(Drawable d){
		System.out.println("전달된 객체의 클래스명 : "+
	                        d.getClass().getName());
		d.draw();
	}
}



