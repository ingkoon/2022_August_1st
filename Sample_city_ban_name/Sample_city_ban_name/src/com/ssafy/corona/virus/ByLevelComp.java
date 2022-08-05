package com.ssafy.corona.virus;

import java.util.Comparator;

public class ByLevelComp implements Comparator<Virus> {

	@Override
	public int compare(Virus v1, Virus v2) {
		return Integer.compare(v1.getLevel(), v2.getLevel());		
	}
}
