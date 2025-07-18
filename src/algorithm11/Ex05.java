
package algorithm11;

// https://school.programmers.co.kr/learn/courses/30/lessons/181925

public class Ex05 {
	
	/*
	 * 문제 설명 (수 조작하기 2) 
	 * 1. 배열의 0번 인덱스부터 시작해 문자열을 받아 수를 조작했음
	 * 2. w : + 1 , s : - 1 , d : + 10 , a : - 10
	 * 3. 배열에는 조작된 숫자가 들어있고 그걸 통해 어떤 조작이 있었는지 문자열을 return
	 *  - 0번 인덱스에 기존 값이 들어있음 
	 */

	// 방법 : 반복문 수가 늘었는지 줄었는지, 얼마나 들었는지에 따라 분기 처리
	
	// 풀이
	// 시간 1.16ms ~ 10.02ms
	public String solution(int[] numLog) {
		
		StringBuilder sb = new StringBuilder();
		
		for(int i = 1; i < numLog.length; i++) {
			if(numLog[i-1] + 1 == numLog[i]) {
				sb.append("w");
			}else if(numLog[i-1] - 1 == numLog[i]) {
				sb.append("s");
			}else if(numLog[i-1] + 10 == numLog[i]) {
				sb.append("d");
			}else {
				sb.append("a");
			}
		}
		
		return sb.toString();
	}
	
	
	public static void main(String[] args) {
		Ex05 ex05 = new Ex05();
		int[] numLog = {0, 1, 0, 10, 0, 1, 0, 10, 0, -1, -2, -1};
		System.out.println(ex05.solution(numLog));
	}
	
	
	
}
