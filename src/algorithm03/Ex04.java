package algorithm03;

/*
 * 링크  https://school.programmers.co.kr/learn/courses/30/lessons/120906
 */

public class Ex04 {
	
	/**
	 * 문제 설명
	 * 1. 정수가 매개변수로 주어질 때
	 * 2. 각 숫자를 구분시켜 더한 총 합을 return
	 */
	
	// 풀이 1. int를 문자열로 변환한 후 다시 int로 변환
	// 시간 0.11ms ~ 0.18ms
	public int solution(int n) {

		
		// 문자 배열로 받아주기
		String[] str = String.valueOf(n).split("");
		
		int sum = 0;
		
		for(int i = 0; i < str.length; i++) {
			sum += Integer.parseInt(str[i]);
		}
		
		return sum;
	}
	
	
	// 풀이 2. 나머지 연산자 이용
	// 시간 0.01ms ~ 0.02ms
	public int solution1(int n) {
		
		int sum = 0;
		
		while(n > 0) {
			sum += n % 10;
			n /= 10; // 마지막 자리 수를 더해줬으니 마지막 자리 수를 빼주기 위함
					
		}
		
		return sum;
	}
	
	// n 의 길이를 한 다음에 거기에 곱하기 1000, 100 이런식으로 해서 
	// 소숫점을 날리는 방법
	
	
	
	public static void main(String[] args) {
		Ex04 ex04 = new Ex04();
		
		System.out.println(ex04.solution1(12345));
	}

}
