package algorithm02;

/**
 * 링크 https://school.programmers.co.kr/learn/courses/30/lessons/120585
 */
public class Ex08 {
	
	/**
	 * 문제 설명
	 * 1. 정수 배열 arr이 주어질 대
	 * 2. 정수 n 보다 큰 수의 개수를 return
	 */
	
	// 풀이 
	// 시간 0.01ms ~ 0.02ms
	public int solution(int[] arr, int n) {
		
		int count = 0;
		
		for(int hei : arr) {
			if(hei > n) {
				count++;
			}
		}
		
		return count;
	}
	
	public static void main(String[] args) {
		Ex08 ex03 = new Ex08();
		
		int[] arr = {149, 180, 192, 170};
		
		System.out.println(ex03.solution(arr, 168));
		
	}

}
