package algorithm07;

/**
 * 링크 https://school.programmers.co.kr/learn/courses/30/lessons/12931
 */

public class Ex07 {
	
	/**
	 * 문제 설명
	 * 1. 자연수의 각 자리수 합을 return
	 */
	
	// 1. 수학적으로 2. String 으로
	
	// 풀이 1. 수학적 접근
	// 시간 0.01ms ~ 0.02ms
	public int solution(int n) {
		
		int answer = 0;
		
		while(n > 0) {
			answer += (n % 10);
			n /= 10;
		}
		
		return answer;
	}
	
	// 풀이 2. String로 변환
	public int solution1(int n) {
		
		String str = String.valueOf(n);
		int answer = 0;
		for(int i = 0; i < str.length(); i++) {
			answer += Integer.parseInt(String.valueOf(str.charAt(i)));
		}
		
		return answer;
	}
	
	
	
	public static void main(String[] args) {
		Ex07 ex02 = new Ex07();
		
		System.out.println(ex02.solution1(123));
	}

}
