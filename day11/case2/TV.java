package day11.case2;

public interface TV {
	public void powerOn();
	public void powerOff();
	public void volumnUp();
	public void volumnDown(); //abstract 메서드임. 알아서 정의됨. 전원을 켜고 끄는 메서드들을 규격화 시킴
}
