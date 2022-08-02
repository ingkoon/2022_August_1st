package algo0802;

import java.util.Arrays;

public class SubsetTest2 {
	static int[] p = {1,2,3,4,5};
	static int n= p.length;
	static int r;	//npr
	static int count;
	static boolean[] visited; // 선택 여부 확인
	
	public static void main(String[] args) {
		visited = new boolean[n];
		subset(0, 0);
		System.out.println(count);
		System.out.println((1<<n));
	}

	private static void subset(int cnt, int tot) {
		// TODO Auto-generated method stub
		if(cnt == n) {
			count ++;
			//선택된 것 출력
			for (int i = 0; i < n; i++) {
				if(visited[i]) System.out.print(p[i] + " ");
			}
			System.out.println();
			System.out.println("----------------->" + tot);
			return;
		}
		visited[cnt] = true;
		subset(cnt+1, tot + p[cnt]); //모두 선택한다
		visited[cnt] = false; 	// 모두 선택한 것 중 하나씩 선택하지않고 
		subset(cnt+1, tot);
		
	}
}
