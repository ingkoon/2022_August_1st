package com.boj;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;

public class Main_11659 {
    static int n, m;
    static int[] sum;
    static int tmp;

    public static void main(String[] args) throws IOException {
        Scanner sc = new Scanner(System.in);
        StringBuilder sb = new StringBuilder();

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        n = Integer.parseInt( br.readLine());
        m = Integer.parseInt( br.readLine());

         sum = new int[n+1];
         tmp = 0;

        for (int i = 1; i < n+1; i++) {
            tmp += Integer.parseInt( br.readLine());
            sum[i] = tmp;
        }

        for (int t = 0; t < m; t++) {
            int i = Integer.parseInt( br.readLine());
            int j = Integer.parseInt( br.readLine());

            sb.append(sum[j] - sum[i - 1]).append("\n");
        }
        System.out.println(sb.toString());
    }
}
