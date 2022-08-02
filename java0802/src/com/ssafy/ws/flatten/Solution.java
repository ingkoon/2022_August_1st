package com.ssafy.ws.flatten;

import java.io.File;
import java.io.IOException;
import java.util.Scanner;

public class Solution {

	public static void main(String[] args) throws IOException{
		Scanner sc = new Scanner(new File("src/com/ssafy/ws/flatten/input.txt"));
	
		int T = 10;
		for (int t = 1; t <= T; t++) {
			
			
			int n = sc.nextInt();
			int[] arr = new int[100];
			
			for (int i = 0; i < 100; i++) arr[i] = sc.nextInt();
			
			for (int i = 0; i < n; i++) {
				int maxIdx = 0;
				int minIdx = 0;
				
				for (int j = 1; j < arr.length; j++) {
					if(arr[maxIdx] < arr[j]) maxIdx = j;
					if(arr[minIdx] > arr[j]) minIdx = j;								
				}				
				arr[maxIdx]--;
				arr[minIdx]++;				
			}
			
			int maxIdx = 0;
			int minIdx = 0;
			for (int j = 1; j < arr.length; j++) {
				if(arr[maxIdx] < arr[j]) maxIdx = j;
				if(arr[minIdx] > arr[j]) minIdx = j;								
			}				
			
			int result = arr[maxIdx] -arr[minIdx];
			
			System.out.printf("#%d %d\n", t, result);
			
		}
	}
}
