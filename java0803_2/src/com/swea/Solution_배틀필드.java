package com.swea;

import java.io.*;
import java.util.StringTokenizer;

public class Solution_배틀필드 {
    static int h, w;
    static int n;
    static char[] input;
    static char[][] field;

    static char[] direction = {'<', '^', '>', 'v'};
    static int[] dx = {-1, 0, 1, 0};
    static int[] dy = { 0, -1, 0, 1};

    static int x, y;
    static int d;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int T = Integer.parseInt(br.readLine());

        for (int t = 1; t <=T; t++) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            h = Integer.parseInt(st.nextToken());
            w = Integer.parseInt(st.nextToken());

            field = new char[h][w];

            for (int i = 0; i < h; i++) {
                char[] tmp = br.readLine().toCharArray();
                for (int j = 0; j < w; j++) {
                    field[i][j] = tmp[j];
                    switch (field[i][j]){
                        case '<':
                            x = j;
                            y = i;
                            d = 0;
                            break;

                        case '^':
                            x = j;
                            y = i;
                            d = 1;
                            break;

                        case '>':
                            x = j;
                            y = i;
                            d = 2;
                            break;

                        case 'v':
                            x = j;
                            y = i;
                            d = 3;
                            break;

                        default:
                            break;
                        }
                    }
                }

            n = Integer.parseInt(br.readLine());
            input = br.readLine().toCharArray();

            for (int i = 0; i <n; i++) {
                   if(input[i] == 'S') shoot();
                   else move(input[i]);
                }
            System.out.printf("#%d ", t);
            for (int i = 0; i < h; i++) {
                for (int j = 0; j < w; j++) {
                    System.out.print(field[i][j]);
                }
                System.out.println();
                }
            }
        }

    private static void shoot(){
        switch (d){
            case 0:
                for (int i = x; i >= 0; i--) {
                    if(field[y][i] == '*') {
                        field[y][i] = '.';
                        break;
                    }
                    else if(field[y][i] == '#') break;
                }
                break;
            case 1:
                for (int i = y; i >= 0; i--) {
                    if(field[i][x] == '*') {
                        field[i][x] = '.';
                        break;
                    }else if(field[i][x] == '#') break;
                }
                break;
            case 2:
                for (int i = x; i < w; i++) {
                    if(field[y][i] == '*') {
                        field[y][i] = '.';
                        break;
                    }
                    else if(field[y][i] == '#') break;
                }
                break;
            case 3:
                for (int i = y; i < h; i++) {
                    if(field[i][x] == '*') {
                        field[i][x] = '.';
                        break;
                    }
                    else if(field[i][x] == '#')
                        break;
                }
                break;
            default:
                break;
        }
    }

    private static void move(char command){
        if(command == 'L') d= 0;
        else if(command == 'U') d = 1;
        else if(command == 'R') d = 2;
        else d = 3;

        int nx = x + dx[d];
        int ny = y + dy[d];
        if(0>nx || w <= nx || 0>ny || h <= ny){
            field[y][x] = direction[d];
            return;
        }

        if(field[ny][nx]=='.'){
            field[ny][nx] = direction[d];
            field[y][x] = '.';
            y = ny;
            x = nx;
        } else{
            field[y][x] = direction[d];
        }
    }
}

