package com.cotest.main;

import java.util.ArrayList;
import java.util.Scanner;

public class Main207 {	
	
	public int solution(int n, ArrayList<Integer> numArr){
		int answer = 0;
		int answer2 = 0;
		for(int i=0; i<numArr.size(); i++) {
			if(numArr.get(i)==1) {
				answer++;
				answer2 = answer2+answer;
				System.out.println(answer);
			} else {
				answer = 0;
			}
		}
		return answer2;
	}		
	public static void main(String[] args){
		Main207 t = new Main207();
		Scanner kb = new Scanner(System.in);
		int n = kb.nextInt();
		ArrayList<Integer> numArr = new ArrayList<>();
		String str = "";
		for(int i=0; i<n; i++) {
			str = kb.next();
			if(str!=" ") {
				numArr.add(Integer.parseInt(str));			
			}
		}
			System.out.print(t.solution(n, numArr));
	}
}
