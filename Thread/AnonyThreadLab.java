package innerexam;

import java.util.Calendar;


public class AnonyThreadLab {
	
	
	
	public static void main(String[] args) {
		Thread mainThread = Thread.currentThread();
		
		Thread C = new Thread(new Runnable() {
			 public void run() {
					
					for(int i=0; i<4; i++) {
						System.out.println("오늘은" + Calendar.getInstance().get(Calendar.MONTH)+1 + "월" 
					                       +  Calendar.getInstance().get(Calendar.DATE) + "일입니다.");
						try {
							Thread.sleep(10000);
						} catch(Exception e ) { }
					}
				}		
		 });
		
		C.start();
	
		 Thread D = new Thread(new Runnable() {
			 public void run() {
					for(int i=0; i<6; i++) {
						System.out.println(Calendar.getInstance().get(Calendar.HOUR) + "시" + Calendar.getInstance().get(Calendar.MINUTE) 
								           + "분" + Calendar.getInstance().get(Calendar.SECOND) + "초");
						try {
							Thread.sleep(5000);
						} catch(Exception e ) { }
					}
				}
		 });
		 
		D.start();
		
		for(int i=10; i > 0; i--) {
			System.out.println("number of milliseconds since January 1, 1970, 00:00:00 GMT");
			try {
				Thread.sleep(3000);
			} catch(Exception e ) { }
		}
	
	}

}