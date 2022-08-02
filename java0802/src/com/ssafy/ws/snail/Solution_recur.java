package com.ssafy.ws.snail;

import java.util.Scanner;
import java.io.File;
import java.io.FileInputStream;


public class Solution_recur
{
	static int n;
	
	static int[][] snail;
	static boolean[][] visited;
	
	static int[] dr = {0, 1, 0, -1};
	static int[] dc = {1, 0, -1, 0};
	
	public static void main(String args[]) throws Exception
	{
		
		Scanner sc = new Scanner(new File("src/com/ssafy/ws/snail/input.txt"));
		
		int T;
		T=sc.nextInt();

		for(int test_case = 1; test_case <= T; test_case++){
			n = sc.nextInt();
			snail = new int[n][n];
			visited = new boolean[n][n];
			
			dfs(0, 0, 1);
			
			System.out.printf("#%d\n", test_case);
			
			for(int[] s: snail) {
				for(int ss: s) {
					System.out.print(ss + " ");
				}
				System.out.println();
			}
			
		}
	}
	
	private static void dfs(int r, int c, int val) {
		visited[r][c] = true;
		snail[r][c] = val;
		for (int i = 0; i<4; i++) {
			int nr = r + dr[i];
			int nc = c + dc[i];
			
			if(0> nr || nr>= n || 0>nc || nc>=n)
				continue;
			if(visited[nr][nc] == false && snail[nr][nc] == 0) {
				dfs(nr, nc, val+1);
				break;
			}			
		}		
	}
}