package algo0802;

import java.util.Arrays;

public class PermTest {
	static int[] p = {1,2,3,4,5};
	static int n= p.length;
	static int r;	//npr
	static int count;
	static boolean[] visited; // 선택 여부 확인
	static int[] nums;	//선택된 r개의 배열 나열
	
	public static void main(String[] args) {
		r = 3;
		nums = new int[r];
		visited = new boolean[n];
		npr(0);
		System.out.println(count);
	}

	private static void npr(int cnt) {
		// TODO Auto-generated method stub
		if(cnt == r) {
			count ++;
			System.out.println(Arrays.toString(nums));
			return;
		}
		for (int i = 0; i < n; i++) {
			if(visited[i]) continue;
			visited[i] = true;
			nums[cnt] = p[i];
			npr(cnt + 1);
			nums[cnt] = 0;
			visited[i] = false;
		}
	}
}
