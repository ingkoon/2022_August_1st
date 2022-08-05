package com.boj;

import java.util.Arrays;
import java.util.Scanner;

public class Main_12891 {
    static int s, p;
    static char[] arr = {'A', 'C', 'G', 'T'};
    static char[] charArr;
    static int[] count;
    static int result;
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        s = sc.nextInt();
        p = sc.nextInt();
        charArr = sc.next().toCharArray();
        count = new int[4];
        for (int i = 0; i < 4; i++) {
            count[i] = sc.nextInt();
        }
        subset("a", Arrays.copyOf(count, count.length));

        System.out.println(Arrays.toString(charArr));
    }
    static void subset(String h, int[] count){
        if(h.length() == p) {
            result += 1;
            return;
        }
        for (int i = 0; i < arr.length; i++) {

        }

    }
}
