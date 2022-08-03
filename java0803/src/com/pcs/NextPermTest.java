package com.pcs;

import java.util.Arrays;

public class NextPermTest {
	// n!!
	//nPn
	//처음부터 끝까지 알 수 있고 중간에서 중간도 알 수 있다.
	static int p[] = {3,4,1,2,5};
	static int n = p.length;
	static int cnt;
	
	public static void main(String[] args) {
		do {
			cnt++;
			System.out.println(Arrays.toString(p));
		}while(np(n-1));
		System.out.println(cnt);
	}
	
	private static boolean np(int size) {
		int i = size;
		while(n >0 && p[i-1] > p[i]) i--;
		if(i==0) return false;
		int j = size;
		while(p[i-1]>p[j]) j--;
		int tmp = p[i-1];
		p[i-1] = p[j];
		p[j] = tmp;
		int k = size;
		
		while(i<k) {
			tmp = p[i-1];
			p[i-1] = p[k];
			p[k] = tmp;
			
			i++;
			k--;			
		}
		
		return true;
	}
}
