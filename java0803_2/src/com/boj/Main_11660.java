package com.boj;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main_11660 {
    static int[][] sum;
    static int n;
    static int m;
    static StringTokenizer st;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        n = Integer.parseInt(br.readLine());
        m = Integer.parseInt(br.readLine());

        sum = new int[n][n];
        int tmp = 0;

        for (int i = 1; i <= n; i++) {
            tmp = Integer.parseInt(br.readLine());
            sum[1][i] += tmp;
            int sum = 0;
            st = new StringTokenizer(br.readLine());
        }
        for(int i = 0; i < m; i++){
            int result = 0;
            st = new StringTokenizer(br.readLine());
            int Ix = Integer.parseInt(st.nextToken());
            int Iy = Integer.parseInt(st.nextToken());
            int Jx = Integer.parseInt(st.nextToken());
            int Jy = Integer.parseInt(st.nextToken());
            for (int j = Ix; j < Jx+1; j++) {
                result += (sum[j][Jy] - sum[j][Iy-1]);

            }
        }


    }
}
