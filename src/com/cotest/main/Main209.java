package com.cotest.main;

import java.util.Scanner;

public class Main209 {	
	
	public int solution(int n, int[][] numArr){
		int answer = Integer.MIN_VALUE;
		int sum1, sum2;
		for(int i=0; i<n; i++) {
				sum1=sum2=0;
				for(int j=0; j<n; j++) {
					sum1+=numArr[i][j];
					sum2+=numArr[j][i];
				}
				answer=Math.max(answer, sum1);
				answer=Math.max(answer, sum2);
			}
			sum1=sum2=0;
			for(int i=0; i<n; i++) {
				sum1+=numArr[i][i];
				sum2+=numArr[i][n-i-1];
			}
			answer=Math.max(answer, sum1);
			answer=Math.max(answer, sum2);
		return answer;
	}		
	public static void main(String[] args){
		Main209 t = new Main209();
		Scanner kb = new Scanner(System.in);
		int n = kb.nextInt();
		int[][] numArr = new int[n][n];
		String str = "";
		for(int i=0; i<n; i++) {
			for(int j=0; j<n; j++) {
				numArr[i][j] = kb.nextInt();		
			}
		}
			System.out.print(t.solution(n, numArr));			
		}
}
