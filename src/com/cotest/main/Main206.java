package com.cotest.main;

import java.util.ArrayList;
import java.util.Scanner;

public class Main206 {	
	
	public boolean isPrime(int num) {
		if(num==1) {
			return false;
		}
		for(int i=2; i<num; i++) {
			if(num%i==0) {
				return false;
			}
		}
		return true;
	}
	
	public ArrayList<Integer> solution(int n, ArrayList<Integer> numArr){
		ArrayList<Integer> answer = new ArrayList<>();
		for(int i=0; i<numArr.size(); i++) {
			if(isPrime(numArr.get(i))) {
				answer.add(numArr.get(i));
			}
		}
		return answer;
	}		
	public static void main(String[] args){
		Main206 t = new Main206();
		Scanner kb = new Scanner(System.in);
		int n = kb.nextInt();
		ArrayList<Integer> numArr = new ArrayList<>();
		String str = "";
		String arr = "";
		for(int i=0; i<n; i++) {
			str = kb.next();
			arr = new StringBuilder(str).reverse().toString();
			numArr.add(Integer.parseInt(arr));
		}
		for(int x: t.solution(n, numArr)) {
			System.out.print(x+" ");
		}
	}
}
