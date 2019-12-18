package javalearning;

public class TypeTest {

	private static final char A = 0;

	public static void main(String[] args) {
		
		
		int score;
		score = 100;
		System.out.println(score);
		
		int score1 = 100;
		System.out.println(score1);
		
		String str = new String ();
		str = null;
		System.out.println(str);
		
		int score2 = 100;
		score2 = 200;
		System.out.println(score2); // 200으로 출력된다?
		
		char ch = 'A';
		System.out.println(ch); // A
		
		String str1 = "abc";
		System.out.println(str1); // abc
		
		final int MAX = 100;
		//MAX = 100;
		System.out.println(MAX);
		
		char ch1 ='A';
		System.out.println(ch1);
		
		//char ch2 = 'AB' : 에러
		
		String S1 = "AB" ;
		System.out.println(S1);
		
		String S2 = "A" + "B" ;
		System.out.println(S2); 
		
		
		System.out.println("" + 7 + 7); // 77
		System.out.println(7 + 7 + ""); // 14
		
		
		int e = (int) 1.1; // add cast to int.
		System.out.println(e); //1
		
		int i = (char)65 ;
		System.out.println(i);
		
		char ch3 = (int)'A' ;
		System.out.println(ch3);
		
		
		

	}

}
