package algorithm09;

/**
 * 링크 https://school.programmers.co.kr/learn/courses/30/lessons/77884
 */

public class Ex03 {
	
	/**
	 * 문제 설명
	 * 1. 정수 left와 right가 주어질 때
	 * 2. left ~ right 에서 약수의 개수가 짝수인 수는 더하고
	 * 3. 약수의 개수가 홀수인 수는 뺀 수를 return
	 */
	
	// 풀이
	// 1. 약수는 1과 자기 자신을 포함한다.
	// 2. 짝을 이루는 구조이다
	// 3. 제곱근 까지만 검사하면 시간복잡도를 줄일 수 있다.
	// 시간 ms ~ ms
	public int solution(int left, int right) {
		
		int result = 0;
	
		for(int i = left; i <= right; i++) {
			
			int num = 2;
			
			for(int j = 2; j <= i / 2; j++) {
				
				if(i % j == 0) {
					num++;
				}
			}
			if(num % 2 == 0) {
				result += i;
			}else {
				result -= i;
			}
			
		}
		
		return result;
	}
	
	// 문제 발생 : left와 right가 동일한 숫자일 경우 문제가 발생
	// 만약 13, 13인 경우 13 + 13 = 26이 되어야 하는데 13이 나옴
	// 이유는 2번 실행되어야 하는데 같은 수일 경우 1회만 실행됨!
	
	// 만약 같은 수일경우에도 반복문을 2번 돌 수 있게 처리가 필요 
	
	
	// 다시
	// Math.sqrt() 제곱근 구하기!
	public int solution1(int left, int right) {

		
		int result = 0;
		
		for(int i = left; i <= right; i++) {
			if(Math.sqrt(i) % 1 == 0) { // 홀수인 경우 (제곱근이 정수로 딱 떨어짐)
				result -= i;
				System.out.println();
			}else { // 짝수인 경우
				System.out.println();
				result += i;
			}
			
			
		}
		
		if(left == right) {
			result = left;
			result += right;
		}
		
		return result;
	}

	
	public static void main(String[] args) {
		Ex03 ex03 = new Ex03();
		System.out.println(ex03.solution1(16, 16));
	}
	
}
