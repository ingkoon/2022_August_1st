package com.boj;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.Queue;
import java.util.StringTokenizer;

public class Main_1278 {
    static int n, m;
    static int[][] visited;
    static int[][] maze;
    static int[] dr = {-1, 0, 1, 0};
    static int[] dc = {0, 1, 0, -1};

    static class P{
        int r;
        int c;

        public P(int r, int c){
            this.r = r;
            this.c = c;
        }
    }

    static int result;
    public static void main(String[] args) throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));

        StringTokenizer st =  new StringTokenizer(bf.readLine());
        n = Integer.parseInt(st.nextToken());
        m = Integer.parseInt(st.nextToken());

        maze= new int[n][m];
        visited = new int[n][m];

        for (int i = 0; i < n; i++) {
            String s = bf.readLine();
            char[] cs = s.toCharArray();
            st = new StringTokenizer(bf.readLine());
            for (int j = 0; j < m; j++) {
                maze[i][j] = cs[j] - '0';
            }
        }
        bfs();
        //방문 위치가 정해져 있다. -> 거리 출력
        System.out.println(visited[n-1][m-1]);
    }

    static void bfs(){
        Queue<P> queue = new LinkedList<>();
        visited[0][0] = 1;
        queue.offer(new P(0, 0));

        while (!queue.isEmpty()){
            P cur= queue.poll();
            int r = cur.r;
            int c = cur.c;
            for (int d = 0; d< 4; d++){
                int nr = r + dr[d];
                int nc = c + dc[d];
                if(!check(nr, nc)) continue;
                if(maze[nr][nc] == 1 && visited[nr][nc] == 0) {
                    visited[nr][nc] = visited[r][c] + 1;
                    queue.offer(new P(nr, nc));
                }
            }
        }
    }

    private static boolean check(int r, int c) {
        return r >= 0 && r < n && c >= 0 && c < n;
    }
}
