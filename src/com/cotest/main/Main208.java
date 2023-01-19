package com.cotest.main;

import java.util.ArrayList;
import java.util.Scanner;

public class Main208 {	
	
	public ArrayList<Integer> solution(int n, ArrayList<Integer> numArr){
		int answer = 0;
		int lank = 1;
		ArrayList<Integer> ansArr = new ArrayList<>();
		for(int i=0; i<numArr.size(); i++) {
			for(int j=0; j<numArr.size(); j++) {
				if(numArr.get(j)>numArr.get(i)) {
					lank++;
				} 				
			}
			ansArr.add(lank);
			lank = 1;
		}
		return ansArr;
	}		
	public static void main(String[] args){
		Main208 t = new Main208();
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
		
		for(Integer x : t.solution(n, numArr)) {
			System.out.print(x+" ");			
		}
	}
}
