package com.ssafy.ws.snail;

import java.io.File;
import java.io.IOException;
import java.util.Scanner;

public class Solution_repeat {
	static int N;
	static int[][] snail;
	
	static int[] dr = {0, 1, 0, -1};
	static int[] dc = {1, 0, -1, 0};
	
	static boolean check(int r, int c) {				
		return r>=0 && r<N && c>=0 && c<N;
	}
	private static void  godfs(int r, int c, int d, int n) {
		snail[r][c] = n;
		if(n == N*N)return ;
		int nr = r + dr[d];
		int nc = c + dc[d];		
		if (!(check(nr, nc) && snail[nr][nc] == 0)) {
			d = (d+1)%4;
		}
		r = r + dr[d];
		c = c + dc[d];
		godfs(r, c, d, n+1);
	}
	
	public static void main(String[] args) throws IOException{
		Scanner sc = new Scanner(new File("src/com/ssafy/ws/snail/input.txt"));
		
		
		int T = sc.nextInt();
		for (int t = 1; t <= T; t++) {
			N = sc.nextInt();
			snail = new int[N][N];
			godfs(0,0,0,1);
			System.out.println("#" + t);
			for (int i = 0; i < N; i++) {
				for (int j = 0; j < N; j++) {
					System.out.print(snail[i][j] + " ");
				}
				System.out.println();
			}
		}
		
	}
}