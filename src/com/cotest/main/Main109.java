package com.cotest.main;

import java.util.Scanner;

public class Main109 {

//	public int solution(String s){
//		int answer = 0;		
//		for(char x : s.toCharArray()) {
//			if(x>=48 && x<=57) {
//				answer = answer*10+(x-48);
//			}			
//		}
//		return answer;
//	}
	
	public int solution(String s){
		String answer = "";
		for(char x : s.toCharArray()) {
			if(Character.isDigit(x)) {
				answer+=x;
			}
		}		
		return Integer.parseInt(answer);
	}
		
	public static void main(String[] args){
		Main109 t = new Main109();
		Scanner kb = new Scanner(System.in);
		String str = kb.nextLine();
		System.out.println(t.solution(str));
	}

}
