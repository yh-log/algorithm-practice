package algorithm04;

/**
 * 링크 https://school.programmers.co.kr/learn/courses/30/lessons/120836
 */

public class Ex02 {
	
	/**
	 * 문제 설명
	 * 1. 자연수 n이 주어질 때 순서쌍의 개수를 return
	 * ※ 순서쌍 : n을 만들기 위해 곱할 수 있는 2개의 숫자 쌍
	 */
	
	
	// 풀이1. 나머지 연산자 활용
	// 시간 0.01ms ~ 8.17ms
	//  ※ 수가 작으면 짧게 걸리지만 수가 커지면 너무 많은 시간이 소요됨
	public int solution(int n) {
		int count = 0;
		for(int i = 1; i <= n; i++) {
			if(n % i == 0) {
				count++;
			}
		}
		return count;
	}
	
	// 풀이 2. 시간 복답도를 줄이기 위해 반복문 횟수를 줄임
	// 시간 0.02ms ~ 0.04ms
	// 약수들은 쌍을 이룬다.
	// i가 n의 약수이면 n / i 도 약수이기 때문에 1 ~ 절반 까지만 계산해도 된다.
	public int solution1(int n) {
		
		int count = 0;
		
		for(int i = 1; i * i <= n; i++) {
			if(n % i == 0) {
				count += 2;
				
				// 동일한 숫자일 경우에는 쌍을 이루지 않기 때문에 -1 을 해준다.
				if(i * i == n) {
					count--;
				}
			}
		}
		
		return count;
	}
	
	public static void main(String[] args) {
		Ex02 ex02 = new Ex02();
		System.out.println(ex02.solution(36));
		System.out.println(ex02.solution(100));
	}

}
