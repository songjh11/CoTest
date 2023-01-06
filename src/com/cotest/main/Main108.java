package com.cotest.main;

import java.util.Scanner;

public class Main108 {

	public String solution(String s){
		String answer = "NO";
		s = s.toUpperCase().replaceAll("[^A-Z]","");
		String tmp = new StringBuilder(s).reverse().toString();
		if(s.equals(tmp)) {
			answer = "YES";
		}
		return answer;
	}
	
	
	public static void main(String[] args){
		Main108 t = new Main108();
		Scanner kb = new Scanner(System.in);
		String str = kb.nextLine();
		System.out.println(t.solution(str));
	}

}
