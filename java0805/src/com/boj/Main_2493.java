package com.boj;

import java.util.Arrays;
import java.util.Scanner;
import java.util.Stack;

public class Main_2493 {

    static int n;
    static Stack<Integer> s = new Stack<>();

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        n = sc.nextInt();
        for (int i = 0; i < n; i++) {
            s.push(sc.nextInt());
        }

        System.out.println(Arrays.toString(s.toArray()));
    }
}
