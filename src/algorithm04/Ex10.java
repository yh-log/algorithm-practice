package algorithm04;

/**
 * 링크 https://school.programmers.co.kr/learn/courses/30/lessons/181854
 */
public class Ex10 {
	
	/**
	 * 문제 설명
	 * 1. 정수 배열 arr과 정수 n이 줘질 때
	 * 2. arr의 길이가 홀수일 경우 
	 * 3. arr의 짝수 인덱스의 값에 n을 더한 배열을 return
	 * 4. arr의 길이가 짝수일 경우
	 * 5. arr의 홀수 인덱스에 값에 n을 더한 배열을 return
	 */
	
	
	// 풀이 1. 작은 인덱스 -> 큰 인덱스
	// 시간 0.01ms ~ 0.02ms
	public int[] solution(int[] arr, int n) {
		
		int j = 0;
		if(arr.length % 2 == 0) {
			j = 1;
		}
		
		
		for(int i = j; i < arr.length; i += 2) {
			arr[i] = arr[i] + n;
		}
		
		return arr;
	}
	
	
	// 풀이 2. 큰 인덱스 -> 작은 인덱스
	// 시간 0.01ms ~ 0.03ms
	public int[] solution1(int[] arr, int n) {
		
		for(int i = arr.length -1; i >= 0; i -= 2) {
			arr[i] += n;
		}
		
		return arr;
	}

}
