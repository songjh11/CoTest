package com.cotest.main;

import java.util.Scanner;

public class Main211 {	
	
	public int solution(int n, int[][] numArr){
		int answer = 0;
		int max=Integer.MIN_VALUE;
		for(int i=1; i<=n; i++) {
				int cnt=0;
				for(int j=1; j<=n; j++) {
					for(int k=1; k<=5; k++) {
						if(numArr[i][k]==numArr[j][k]) {
							cnt++;
							break;
						}
					}
				}
				if(cnt>max) {
					max=cnt;
					answer=i;
				}
		}
		return answer;
	}		
		
	public static void main(String[] args){
		Main211 t = new Main211();
		Scanner kb = new Scanner(System.in);
		int n = kb.nextInt();
		int[][] numArr = new int[n+1][6];
		for(int i=1; i<=n; i++) {
			for(int j=1; j<=5; j++) {
				numArr[i][j] = kb.nextInt();		
			}
		}
			System.out.print(t.solution(n, numArr));			
		}
}
