package com.ssafy.corona.virus;

import java.util.Comparator;

public class ByNameComp implements Comparator<Virus> {
/*
	@Override
	public int compare(Virus v1, Virus v2) { //객체 클래스에 정의할 경우comparable로 정의한다.
		String n1 = v1.getName();
		String n2 = v2.getName();
		
		int result = n1.compareTo(n2); //Lexico
		
		if(result != 0) {
			int lv1 = v1.getLevel();
			int lv2 = v2.getLevel();
			return Integer.compare(lv1, lv2); //레벨 순으로 ASC
		}else return result; //이름으로 ASC 수행			
	}*/
	

	@Override
	public int compare(Virus v1, Virus v2) {
		return v1.compareTo(v2);
	}
}
