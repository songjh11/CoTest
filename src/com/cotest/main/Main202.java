package com.cotest.main;

import java.util.Scanner;

public class Main202 {	
	public int solution(int n, int[] arr){
		int answer = 1;		
		int max = arr[0];
		for(int i=1; i<n; i++) {
			if(max<arr[i]){
				max = arr[i];
				answer++;
			}
		}
		return answer;
	}		
	public static void main(String[] args){
		Main202 t = new Main202();
		Scanner kb = new Scanner(System.in);
		int n = kb.nextInt();
		int[] arr = new int[n];
		for(int i=0; i<n; i++) {
			arr[i]=kb.nextInt();
		}
			System.out.println(t.solution(n, arr));
	}
}
