package algorithm06;

/**
 * 링크 https://school.programmers.co.kr/learn/courses/30/lessons/181941
 */

public class Ex04 {
	
	/**
	 * 문제 설명
	 * 1. 문자 배열 arr이 주어질 때
	 * 2. 원소를 이어 붙인 문자열을 return
	 */
	
	
	// 풀이 1. String 사용 (메모리 문제로 Builder 사용 필요)
	// 시간 1.10ms ~ 4.86ms
	public String solution(String[] arr) {
		
		String sb = new String();
		
		for(int i = 0; i < arr.length; i++) {
			sb += arr[i];
		}
		
		return sb;
	}
	
	// 풀이 2. StringBuilder 사용
	// 시간 0.03ms ~ 0.05ms
	public String solution1(String[] arr) {
		
		StringBuilder sb = new StringBuilder();
		
		for(int i = 0; i < arr.length; i++) {
			sb.append(arr[i]);
		}
		
		return sb.toString();
	}

	
	
	public static void main(String[] args) {
		Ex04 ex05 = new Ex04();
		
		String[] str = {"a","b","c"};
		
		System.out.println(ex05.solution1(str));
	}
	
}
