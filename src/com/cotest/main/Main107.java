package com.cotest.main;

import java.util.Scanner;

public class Main107 {

//	public String solution(String str){
//		String answer = "YES";
//		str = str.toUpperCase();
//		int len = str.length();
//		for(int i=0; i<len/2; i++) {
//			if(str.charAt(i)!=str.charAt(len-i-1)) {
//				return "NO";
//			}
//		}
//		return answer;
//	}

	public String solution(String str){
		String answer = "YES";
		String tmp=new StringBuilder(str).reverse().toString();
		if(!str.equalsIgnoreCase(tmp)) {
			return "NO";
		}
		return answer;
	}
	
	
	public static void main(String[] args){
		Main107 t = new Main107();
		Scanner kb = new Scanner(System.in);
		String str = kb.next();
		System.out.println(t.solution(str));
	}

}
