package day11.case3;

public class TVUser {
	public static void main(String[] args) {		
		TV tv = TVFactory.getTV(args[0]); //���θ޼����� �Ű�����. ���α׷� �ƱԸ�Ʈ�� �����ϴ� ����. 
		if(tv != null) {                  //���α׷� �ƱԸ�Ʈ : ���α׷��� �������ִ� ����Ÿ.
			tv.powerOn();                 // Run - Run configuration - argument�� �Է�.
			tv.volumnUp();
			tv.volumnDown();
			tv.powerOff();
		} else {
			System.out.println("���α׷� �ƱԸ�Ʈ�� samsung �Ǵ� lg �� �Է��� �ּ���..");
		}
	}
}

//case1 -> case 2 -> case3 ������ ������������ ������. ��ĥ��  �������� �԰�ȭ ��.