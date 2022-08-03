package com.boj;

import java.util.Scanner;

public class Main_15650 {
	static int[] nums;
	static boolean[] visited;
	static int[] result;
	
	static int n;
	static int p;
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		n = sc.nextInt();
		p = sc.nextInt();
		
		nums = new int[n];
		result = new int[p];
		
		visited = new boolean[n];
		
		for (int i = 1; i <= n; i++) {
			nums[i-1] = i;
		}
		
		calc(0);
	}
	
	private static void calc(int cnt){
		if(cnt == p) {
			for(int r : result) {
				System.out.print(r + " ");			
			}
			System.out.println();
			return;			
		}
		
		for (int i = 0; i < n; i++) {
			if(visited[i] == true) continue;
			visited[i] = true;
			result[cnt] = nums[i];
			calc(cnt+1);
			result[cnt] = 0;
//			visited[i] = false;
		}
	}
}
