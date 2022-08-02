package com.ssafy.ws;

import java.io.File;
import java.io.IOException;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;



public class Solution_0802_2 {
	static int size;
	static int result;
	static int[][] map;
	static boolean[][] visited;
	public static void main(String[] args) throws IOException{
		Scanner sc = new Scanner(new File("src/com/ssafy/ws/input.txt"));
		int T = sc.nextInt();
		for(int t = 1; t<=T; t++) {
			
			size = sc.nextInt();
			
			//배열 선언
			map = new int[size][size];
			visited = new boolean[size][size];
			
			//입력
			for (int i = 0; i < size; i++) {
				String s = sc.next();
				char[] c = s.toCharArray();
				for (int j = 0; j < size; j++) {
					map[i][j] = c[j] - '0';
				}
			}
				
			bfs();
			System.out.printf("#%d %d\n", t, result);
			
		}
	}
	static int[] dr = {-1, 0, 1, 0};
	static int[] dc = {0, 1, 0, -1}; //CW
	
	private static void bfs() {
		Queue<int[]> que = new LinkedList<>();
		que.offer(new int[] {size/2, size/2} );//넣는다
		result += map[size/2][size/2];
		visited[size/2][size/2] = true;
		for (int i = 0; i < size/2; i++) { //자신뺴고 n/2겹
			int[] cur = que.poll(); // 값을 다시 뺸다.
			int r = cur[0];
			int c = cur[1];
			for (int j = 0; j < 4; j++) {
				int nr = r+ dr[j];
				int nc = c+ dc[j];
				if(visited[nr][nc]) continue;
				
				result += map[nr][nc];
				que.offer(new int[] {nr, nc});//넣는다
				result += map[nr][nc];
				visited[nr][nc] = true;
			}
		}
	}

}
