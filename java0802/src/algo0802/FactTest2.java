package algo0802;

import java.util.Arrays;

public class FactTest2 {
static int [] fact;
	
	public static void main(String[] args) {
		fact=new int[13];
		fact[0] = 1;
		fact[1] = 1;
		
		for (int i = 2; i <13; i++) {
			fact[i] = i * fact[i-1];
			System.out.println(i+"!= "+fact[i]);
		}

	}

	private static int fact(int n) {
		if(fact[n]!=-1) {
			return fact[n];
		}else {
			fact[n]=n*fact(n-1);
			return fact[n];
		}
	}
}
