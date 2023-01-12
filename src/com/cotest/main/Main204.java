package com.cotest.main;

import java.util.Scanner;

public class Main204 {	
//	public int[] solution(int n){
//		int[] answer = new int[n];
//		answer[0] = 1;
//		answer[1] = answer[0];
//		for(int i=2; i<n; i++) {
//				answer[i]=answer[i-1]+answer[i-2];
//		}
//		return answer;
//	}		
//	public static void main(String[] args){
//		Main204 t = new Main204();
//		Scanner kb = new Scanner(System.in);
//		int n = kb.nextInt();
//		for(int x:t.solution(n)) {
//			System.out.print(x+" ");
//		}
//	}
	
	public void solution(int n){
		int a = 1; 
		int b = 1;
		int c;
		System.out.print(a+" "+b+" ");
		for(int i=2; i<n; i++) {
			c=a+b;
			System.out.print(c+" ");
			a=b;
			b=c;
		}
	}		
	public static void main(String[] args){
		Main204 t = new Main204();
		Scanner kb = new Scanner(System.in);
		int n = kb.nextInt();
		t.solution(n);
	}
}
