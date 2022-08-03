package com.pcs;

import java.util.Scanner;

public class SubsetTest { //-> 경우의 수를 테스트한다.
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
		
		subSet(0, 0);
	}
	
	private static void subSet(int cnt,int tot){
		if(cnt == n) {
			for (int i = 0; i < n; i++) {
				if(visited[i]) {
					System.out.print(nums[i] + " ");
				}
			}
			System.out.println();
			System.out.println("------------------");
			for (int i = 0; i < n; i++) {
				if(!visited[i]) {
					System.out.print(nums[i] + " ");
				}
			}
			
			
			System.out.println();
			System.out.println("----->" + tot);
			return;			
		}
					
			visited[cnt] = true;
			subSet(cnt+1, tot + nums[cnt]);	
			visited[cnt] = false;
			subSet(cnt+1, tot);
			
		}
	
}
