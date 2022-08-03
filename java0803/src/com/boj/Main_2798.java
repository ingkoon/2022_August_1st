package com.boj;

import java.util.Scanner;

public class Main_2798 {
	
	static int n, m;
	
	static int[] cards;
	
	static int max;
	
	public static void main(String[] args){
		
		Scanner sc = new Scanner(System.in);
		n = sc.nextInt();
		m = sc.nextInt();
		cards = new int[n];
		for (int i = 0; i < n; i++) cards[i] = sc.nextInt();
		
		
		max = -1;
		ncr(0,0,0);
		System.out.println(max);	
	}
	private static void ncr(int start, int cnt, int tot) {
		if(cnt == 3) {
			if(tot<=m) {
				max = Math.max(tot, max);
			}
			return;			
		}
		for (int i = start; i < n; i++) {
			ncr(i+1, cnt + 1, tot+cards[i]);
		} 
		
	}
}
