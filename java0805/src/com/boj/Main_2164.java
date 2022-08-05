package com.boj;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class Main_2164 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Queue<Integer> deck = new LinkedList<>();
        int n = sc.nextInt();

        for (int i = 1; i <= n; i++) {
            deck.add(i);
        }
        while(deck.size() != 1){
            deck.remove();
            deck.offer(deck.poll());
        }
        System.out.println(deck.poll());
    }
}

