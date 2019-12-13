package day9;

class Multiplication {
	private int dan;
	private int number;
	Multiplication() {}
	Multiplication(int dan) {
		this.dan = dan;
	}
	Multiplication(int dan, int number){
		this.dan = dan;
		this.number = number;
	}
	public void printPart() {
		if (number == 0) {	       
			for(int n=1; n <= 9; n++)
				System.out.print("\t"+dan + "*" + n+ "="+dan*n);
			System.out.println();
		} else {
			System.out.println(dan * number);
		}
	}
}

class GuGuDanExpr extends Multiplication {	
		GuGuDanExpr () {
		//super ();
	}
		
		GuGuDanExpr (int dan) {
			super (dan);
		}
		
		GuGuDanExpr (int dan, int number) {
			super (dan, number);
		}
		
		
		
	public static void printAll() {
		 for (int n=1;n<=9;++n) {
			 System.out.println();
	       for (int i=1;i<=9;++i)
	    	   System.out.print("\t"+n + "*" + i+ "="+n*i+" ");
		 }
			 
	}
	
}


public class GuGuDan {
	public static void main(String[] args) {

		//day.MethodLab3.getRandom();
		int dan = day6.MethodLab3.getRandom(20);
		int number = day6.MethodLab3.getRandom(20);
		
		if (dan<=9&&number<=9) {
			Multiplication gugudan = new GuGuDanExpr(dan, number);
			System.out.print(dan + "*" + number + " = ");
			gugudan.printPart();

		}
		
		
		else if (dan<=9&&number>=10) {
			Multiplication gugudan = new GuGuDanExpr(dan);
			System.out.print(dan + "단 :");
			gugudan.printPart();
		}
		
		
		else {
			GuGuDanExpr.printAll(); // 객체생성을 하지 않아도 호출 됨.
		}
		
		
		}
		
	}


