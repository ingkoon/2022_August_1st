package com.ssafy.ws.ladder;

import java.io.File;
import java.io.IOException;
import java.util.Scanner;

public class Solution {	
	static int[][] ladder;
	static int result;	
	static boolean[][] visited;
	static int[] dr = {0, 0, -1};
	static int[] dc = {1, -1, 0};
	
	
	public static void main(String[] args) throws IOException{
		Scanner sc = new Scanner(new File("src/com/ssafy/ws/ladder/input.txt"));
		int T = 10;
		
		for (int t = 1; t <= T; t++) {
			int n = sc.nextInt();
			result = 0;
			
			ladder = new int[100][100];
			visited = new boolean[100][100];
			
			for(int i=0; i<100; i++) {
				for (int j = 0; j < 100; j++) {
					ladder[i][j] = sc.nextInt();					
				}
			}
			
			int r = 99;
			int c = 0;
			
			for (int i = 0; i < 100; i++) {
				if(ladder[r][i] == 2) {
					c= i;
					break;
				}				
			}
			
			dfs(r, c);
			System.out.printf("#%d %d\n", n, result);
		}
		
	}

	
	private static void dfs(int r, int c) {
		if(r == 0) { 
			result = c;
			return;
		}
		
		visited[r][c] = true;
		for (int i = 0; i < 3; i++) {
			int nr = r + dr[i];
			int nc = c + dc[i];
			
			if(0>nr || nr>=100 || 0>nc || nc>= 100)
				continue;
		
			if(visited[nr][nc] == false && ladder[nr][nc] ==1) {
				dfs(nr, nc);
				break;
			}
		}
	}
}
