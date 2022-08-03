package com.boj;

import java.util.Scanner;

public class Main_2798_2 {
	
	static int n, m;
	static int[] cards;
	
	public static void main(String[] args){
		
		Scanner sc = new Scanner(System.in);
		n = sc.nextInt();
		m = sc.nextInt();
		cards = new int[n];
		for (int i = 0; i < n; i++) cards[i] = sc.nextInt();
		
		
		int result = 0;
		
		for (int i = 0; i < n; i++) {		
			for (int j = i+1; j < n; j++) {
				for (int k = j+1; k <n; k++) {
					int tmp = cards[i] + cards[j] + cards[k];
					if(result< tmp && tmp <= m)
						result = tmp;
				}
			}			
		}
		System.out.println(result);	
	}
}
