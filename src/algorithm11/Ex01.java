package algorithm11;

/**
 * 링크 https://school.programmers.co.kr/learn/courses/30/lessons/82612
 */

public class Ex01 {
	
	/**
	 * 문제 설명
	 * 1. 놀이기구 이용료는 price
	 * 2. 놀이기구를 n 번째 이용할 경우 price * n
	 * 3. 놀이기구를 count번 타게 될 경우 가지고 있는 금액에서 얼마가 모자라는지
	 * 4. 금액이 부족하지 않을 경우 0을 return
	 */
	
	// 풀이
	// 시간 0.02ms ~ 1.12ms
	public long solution(int price, int money, int count) {
		
		long answer = 0;
		
		for(int i = 1; i <= count; i++) {
			answer += i * price;
		}
		
		if(answer < money) {
			return 0;
		}else {
			return answer - money;
		}
		
	}
	
	
	
	public static void main(String[] args) {
		Ex01 ex01 = new Ex01();
		System.out.println(ex01.solution(3, 20, 4));
	}

}
