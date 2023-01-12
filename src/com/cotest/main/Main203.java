package com.cotest.main;

import java.util.ArrayList;
import java.util.Scanner;

public class Main203 {	
	public ArrayList<String> solution(int n, int[] a, int[] b){
		ArrayList<String> answer = new ArrayList<>();
		for(int i=0; i<n; i++) {
			//지는 경우
			if(a[i]==1&&b[i]==2||a[i]==2&&b[i]==3||a[i]==3&&b[i]==1) {
				answer.add("B");
			}
			//비기는 경우
			else if(a[i]==b[i]) {
				answer.add("D");
			}
			//이기는 경우
			else {
				answer.add("A");
			}
		}
		return answer;
	}		
	public static void main(String[] args){
		Main203 t = new Main203();
		Scanner kb = new Scanner(System.in);
		int n = kb.nextInt();
		int[] a = new int[n];
		int[] b = new int[n];
		for(int i=0; i<n; i++) {
			a[i] = kb.nextInt();
		}
		for(int i=0; i<n; i++) {
			b[i] = kb.nextInt();
		}
		for(String x : t.solution(n, a, b)) {
			System.out.println(x);
		}
	}
}
