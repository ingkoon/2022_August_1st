package com.boj;

import java.util.Scanner;

public class Main_2023 {
    static int n;
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);

        n = sc.nextInt();
        int min = (int)Math.pow(10, n-1);
        int max = (int)Math.pow(10,n);


        for (int i = min; i < max; i++) {
            if(isTrue(i)) System.out.println(i);
        }
    }

    public static boolean isTrue(int val){
        if(val == 0) return true;
        if(val == 1) return false;
        for (int i = 2 ; i <= (int)(Math.sqrt(val)); i++) {
            if(val%i==0) return false;
        }
        return isTrue(val/10);
    }
}
