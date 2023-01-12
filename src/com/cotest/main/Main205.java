package com.cotest.main;

import java.util.Scanner;

public class Main205 {	
	public int solution(int n){
		int answer = 0;
		int[] ch = new int[n+1];
		for(int i=2; i<=n; i++) {
			if(ch[i]==0) {
				answer++;
				for(int j=i; j<=n; j=j+i) {
					ch[j] = 1;
				}
			}
		}
		return answer;
	}		
	public static void main(String[] args){
		Main205 t = new Main205();
		Scanner kb = new Scanner(System.in);
		int n = kb.nextInt();
		System.out.println(t.solution(n));
	}
}
