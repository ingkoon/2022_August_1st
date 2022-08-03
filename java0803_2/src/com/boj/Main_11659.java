package com.boj;

import java.util.Arrays;
import java.util.Scanner;

public class Main_11659 {
    static int n, m;
    static int[] sum;
    static int tmp;

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        StringBuilder sb = new StringBuilder();

        n = sc.nextInt();
        m = sc.nextInt();

         sum = new int[n+1];
         tmp = 0;

        for (int i = 1; i < n+1; i++) {
            tmp += sc.nextInt();
            sum[i] = tmp;
        }

        for (int t = 0; t < m; t++) {
            int i = sc.nextInt();
            int j = sc.nextInt();

            sb.append(sum[j] - sum[i - 1]).append("\n");
        }
        System.out.println(sb.toString());
    }
}
