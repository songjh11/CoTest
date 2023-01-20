package com.cotest.main;

import java.util.Scanner;

public class Main210 {	
	int[] dx = {-1, 0, 1, 0};
	int[] dy = {0, 1, 0, -1};
	
	public int solution(int n, int[][] numArr){
		int answer = 0;
		for(int i=0; i<n; i++) {
				for(int j=0; j<n; j++) {
					boolean flag = true;
					for(int k=0; k<4; k++) {
						int nx=i+dx[k];
						int ny=j+dy[k]; 
						if(nx>=0 && nx<n && ny>=0 && ny<n && numArr[nx][ny]>=numArr[i][j]) {
							flag=false;
							break;
						}
					}
					if(flag) {
						answer++;
					}
				}
			}
		return answer;
	}		
	
	public static void main(String[] args){
		Main210 t = new Main210();
		Scanner kb = new Scanner(System.in);
		int n = kb.nextInt();
		int[][] numArr = new int[n][n];
		for(int i=0; i<n; i++) {
			for(int j=0; j<n; j++) {
				numArr[i][j] = kb.nextInt();		
			}
		}
			System.out.print(t.solution(n, numArr));			
		}
}
