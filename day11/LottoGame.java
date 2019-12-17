package day11;

import java.util.Random;

class LottoMachine{
	private int nums[] ; 
	
	public LottoMachine() {
		//6���� ���Ҹ� ���� int Ÿ���� �迭�� �����Ͽ� nums ������ �����Ѵ�.
		nums = new int[6];
		
	}
	
	public void createLottoNums() {
		//1-20 ������ 6 �� ���ڸ� �����Ͽ� �迭�� �����Ѵ� (���DŬ������ ���)
		for (int n=1; n <= 6; n++) {
			nums[n]=day6.MethodLab3.getRandom(6);
		}
		
		
	}
	public void checkLottoNums() throws DuplicateException{
		//6���� ��� ���ڵ��� ����ũ���� äũ�ϰ� �ߺ����ڰ� �߰ߵǸ� DuplicateException�� �߻���Ų��.(throw, throws)
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
