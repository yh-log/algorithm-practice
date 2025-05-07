package algorithm06;

import java.math.BigInteger;

/**
 * 링크 https://school.programmers.co.kr/learn/courses/30/lessons/181846
 */

public class Ex08 {
	
	/**
	 * 문제 설명
	 * 1. 문자열 a, b가 주어질 때
	 * 2. a + b 의 값을 return
	 */
	
	// 풀이
	// 시간 0.70ms ~ 436.78ms
	public String solution(String a, String b) {
		
		BigInteger bigA = new BigInteger(a);
		BigInteger bigB = new BigInteger(b);
		
		return bigA.add(bigB).toString();
	}
	
	
	public static void main(String[] args) {
		Ex08 ex03 = new Ex08();
		System.out.println(ex03.solution("18446744073709551615"	, "287346502836570928366"));
	}

}
