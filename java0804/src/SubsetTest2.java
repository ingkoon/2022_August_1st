import java.util.Arrays;
import java.util.Scanner;

public class SubsetTest2 {
    static int n, totalCnt;
    static int[] input;
    static boolean[] isSelected;

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        n = sc.nextInt();
        totalCnt = 0;
        input = new int[n];
        isSelected = new boolean[n];

        for (int i = 0; i < n; i++) {
            input[i] = sc.nextInt();
        }
        subset(0);
        System.out.println("총 경우의 수: " + totalCnt);
    }

    private static void subset(int index){ //cnt일 경우 직전까지 고려한 원소의 수
        if(index == n){
            totalCnt ++;
            for (int i = 0; i < n; i++) {
                System.out.print(isSelected[i]?input[i]:"X");
                System.out.print("\t");
            }
            System.out.println();
            return;
        }
        // 원소 선택
        isSelected[index] = true;
        subset(index + 1);
        // 원소 미선택
        isSelected[index] = false;
        subset(index + 1);
    }
}
