package day11;

import java.util.Random;

class LottoMachine{
	private int nums[] ; 
	
	public LottoMachine() {
		//6개의 원소를 갖는 int 타입의 배열을 생성하여 nums 변수에 저장한다.
		nums = new int[6];
		
	}
	
	public void createLottoNums() {
		//1-20 사이의 6 개 숫자를 추출하여 배열에 저장한다 (랜덬클래스를 사용)
		for (int n=1; n <= 6; n++) {
			nums[n]=day6.MethodLab3.getRandom(6);
		}
		
		
	}
	public void checkLottoNums() throws DuplicateException{
		//6개의 모든 숫자들이 유니크한지 채크하고 중복숫자가 발견되면 DuplicateException을 발생시킨다.(throw, throws)
		for (int i=1; i <= 6; i++) {
			for (int j=1; j <= 6; j++) {
				if (i == j)
					continue;
				else if (nums[i] == nums[j])
					throw new DuplicateException();
			}
		}
		
	}
	 
	public int[] getNums() {
	    return nums;
     }
}

public class LottoGame {

	public static void main(String[] args) {
		LottoMachine lotto = new LottoMachine ();
		
		lotto.createLottoNums();
		
		try {
			lotto.checkLottoNums();
			int[] temp =lotto.getNums();
			for (System.out.println(
		} catch (DuplicateException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		

	}

}
