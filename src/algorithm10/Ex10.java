package algorithm10;


//https://school.programmers.co.kr/learn/courses/30/lessons/120904

public class Ex10 {
	
	/*
	 * 문제 설명
	 * 1. 정수 num과 k가 있을 때
	 * 2. num에 k가 있으면 그 위치를 (1부터 시작)
	 * 3. 없으면 -1을 return
	 */

	
	
	// 풀이
	// 시간 0.02ms ~ 0.03ms
	public int solution(int num, int k) {
		
		int result = String.valueOf(num).indexOf(String.valueOf(k));
		
		return result == -1? -1 : result+1;
	}

	
	// 풀이 2
	public int solution1(int num, int k) {
		
		return ("-" + num).indexOf(String.valueOf(k));
	}
	
	
	public static void main(String[] args) {
		Ex10 ex10 = new Ex10();
		System.out.println(ex10.solution1(29183, 1));
	}
}
