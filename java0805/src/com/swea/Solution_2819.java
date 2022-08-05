package com.swea;

import java.util.HashSet;
import java.util.Scanner;

public class Solution_2819 {
    static int T;
    static int SIZE = 4;
    static int[] dr = {-1, 0, 1, 0};
    static int[] dc = {0, 1, 0, -1};

    static HashSet<String> hashSet;

    static int[][] board;
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        T = sc.nextInt();
        for (int t = 1; t <= T; t++) {
            hashSet = new HashSet<>();
            board = new int[SIZE][SIZE];

            for (int i = 0; i < SIZE; i++) {
                for (int j = 0; j < SIZE; j++) {
                    board[i][j] = sc.nextInt();
                }
            }
            for (int i = 0; i < SIZE; i++) {
                for (int j = 0; j < SIZE; j++) {
                    dfs(1, i, j, "");
                }
            }
            System.out.printf("#%d %d\n",t , hashSet.size());
        }
    }

    static void dfs(int cnt, int x, int y, String val){
        if(val.length()==7) {
            hashSet.add(val);
            return;
        }

        val += board[y][x];

        for (int i = 0; i < SIZE; i++) {
            int nx = x + dr[i];
            int ny = y + dc[i];
            if(nx >= 0 && nx < SIZE && ny >= 0 && ny < SIZE){
                cnt+=1;
                dfs(cnt, nx, ny, val);
            }
        }
  }
}
