package algorithm06;

import java.util.Stack;

/**
 * 링크 https://school.programmers.co.kr/learn/courses/30/lessons/12909
 */

public class Ex05 {
	
	/**
	 * 문제 설명 (Lv.2)
	 * 1. () 올바른 괄호일 경우 true
	 * 2. )( 올바르지 않은 괄호일 경우 false
	 */
	
	
	// 풀이
	// 시간 0.43ms ~ 2.49ms (효율성 - 시간초과)
	
	// \\s+ : 하나 이상의 공백 문자
	// \\s : 공백 문자 , + : 하나 이상
	public boolean solution(String s) {
		
		s = s.replaceAll("\\(", " 1 ");
		s = s.replaceAll("\\)", " -1 ");

		String[] arr = s.trim().split("\\s+");
		
		// 반복문을 수행하지 않고 틀릴 경우 바로 return
		if(arr[0].equals(")") || arr[arr.length -1].equals("(")) {
			return false;
		}
		
		int sum = 0;
		

		// ( 에는 1을 ) 에는 -1을 줘서 
		// -1이 되는 순간 false
		// 0이면 true 이고, 1 이상이어도 일단은 ok
		for(int i = 0; i < arr.length; i++) {
			sum += Integer.parseInt(arr[i]);
			if(sum <= -1) {
				return false;
			}
		}
		
		return sum == 0? true : false;
	}
	
	
	// 풀이 2. 스택 사용
	// 시간 0.12ms ~ 0.24ms
	public boolean solution1(String s) {
		
		Stack<Character> st = new Stack<>();
		
		for(char c : s.toCharArray()) {
			if(c == '(') {
				st.push(c);
			}else if(c == ')') {
				if(st.isEmpty()) {
					return false;
				}
				st.pop();
			}
		}
		
		return st.isEmpty();
	}
	
	
	
	public static void main(String[] args) {
		Ex05 ex05 = new Ex05();
		System.out.println(ex05.solution1("()()"));
		System.out.println(ex05.solution1(")()("));
		System.out.println(ex05.solution1("(()("));
	}

}
