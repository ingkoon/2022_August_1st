package com.ssafy.corona.virus;

import java.io.Serializable;

public class Virus implements Serializable, Comparable<Virus>{ //내부에서 비교하기 위한 comparable
	private String name;
	private int level;

	public Virus() {}
	public Virus(String name, int level) {
		setName(name);
		setLevel(level);
	}
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getLevel() {
		return level;
	}
	public void setLevel(int level) {
		this.level = level;
	}	
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((name == null) ? 0 : name.hashCode());
		return result;
	}
	@Override
	public boolean equals(Object obj) {
//		return this.name.equals(((Virus)obj).getName());
		Virus other = (Virus) obj;
		return this.name.equals(other.getName());
	}
	public String toString() {
		StringBuilder sb=new StringBuilder();
		sb.append(getName()).append("\t")
		  .append(getLevel());
		return sb.toString();
	}
	@Override
	public int compareTo(Virus v) {
		String n1 = this.getName();
		String n2 = v.getName();
		
		int result = n1.compareTo(n2); //Lexico
		
		if(result != 0) { //이름이 동일할 경우 level까지 가며 비교를 수행한다. 
			int lv1 = this.getLevel();
			int lv2 = v.getLevel();
			return Integer.compare(lv1, lv2); //레벨 순으로 ASC
		}else return result; //이름으로 ASC 수행			
	}
}
