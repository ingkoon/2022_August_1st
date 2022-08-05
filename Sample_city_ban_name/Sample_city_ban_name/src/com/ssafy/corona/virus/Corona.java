package com.ssafy.corona.virus;

public class Corona extends Virus{
	public int spreadSpeed;

	//생성자의 경우에는 return 값이 없어야 한다. 클래스 이름과 같아야 하며 
	// 자식이 생성될 경우 -> 부모가 먼저 초기화 되고 그다음에 자식이 초기화 된다.
	public Corona(String name, int level, int spreadSpeed) {
		super(name, level);
//		setName(name);
//		setLevel(level);
		setSpreadSpeed(spreadSpeed);
	}
	
	public int getSpreadSpeed() {
		return spreadSpeed;
	}
	public void setSpreadSpeed(int spreadSpeed) {
		this.spreadSpeed = spreadSpeed;
	}	
	
	public String toString() { //-> toString에 arg없어야 오버라이딩이 된다. 오버라이딩은 접근제한자를 제외하고는 일치해야 한다.
		StringBuilder sb=new StringBuilder();
		sb.append(super.toString()).append("\t")
		  .append(getSpreadSpeed());
		return sb.toString();
	}
}