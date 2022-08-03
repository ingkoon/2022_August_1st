package com.pcs;

import java.util.Scanner;

public class CombiTest {
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
		
		nCr(0, 0);
	}
	
	private static void nCr(int start, int cnt){
		if(cnt == p) {
			for(int r : result) {
				System.out.print(r + " ");			
			}
			System.out.println();
			return;			
		}
		
		
		for (int i = start; i < n; i++) {			
			visited[i] = true;
			result[cnt] = nums[i];
			nCr(i+1, cnt+1);
			result[cnt] = 0;
			visited[i] = false;
			
		}
	}
}
