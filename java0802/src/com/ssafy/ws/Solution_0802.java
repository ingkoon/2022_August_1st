package com.ssafy.ws;

import java.io.File;
import java.io.IOException;
import java.util.Scanner;



public class Solution_0802 {
	public static void main(String[] args) throws IOException{
		Scanner sc = new Scanner(new File("src/com/ssafy/ws/input.txt"));
		int T = sc.nextInt();
		for(int t = 1; t<T; t++) {
			
			int size = sc.nextInt();
			
			//배열 선언
			int[][] map = new int[size][size];
			
			//입력
			for (int i = 0; i < size; i++) {
				String s = sc.next();
				char[] c = s.toCharArray();
				for (int j = 0; j < size; j++) {
					map[i][j] = c[j] - '0';
				}
			}
				
				int result = 0;
				
				for (int i = 0; i <size; i++) {
					int st = Math.abs(i-size/2);
					for (int j = st; j < size - st; j++) {
						result += map[i][j];
					}									
				}
			System.out.printf("#%d %d\n", t, result);
			
		}
	}

}
