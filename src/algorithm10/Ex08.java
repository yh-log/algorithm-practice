package algorithm10;

import java.util.Arrays;

//https://school.programmers.co.kr/learn/courses/30/lessons/12906

public class Ex08 {
	
	/*
	 * 문제 설명 (Lv.1 - 같은 숫자는 싫어)
	 * 1. 배열에 연속해서 나타나는 숫자를 제거하고 남은 수를 return
	 */
	
	/*
	 * 방법 고민
	 * - 반복문으로 앞에 n 과 n-1 번째 값을 비교하며 같으면 제외
	 * - 다른 배열을 선언하지 않으려면 같은 값이 나온 인덱스를 저장해줘야 함
	 * - 그게 아니면 다른 배열을 선언해줘야 함 ✔✔
	 */
	
	
	
	// 풀이 1. 다른 배열 선언
	// 시간 0.02ms ~ 0.03ms
	public int[] solution(int[] arr) {
		
		int[] arr2 = new int[arr.length];
		int j = 1;
		arr2[0] = arr[0];
		
		for(int i = 1; i < arr.length; i++) {
			
			if(arr[i] != arr[i-1]) {
				arr2[j] = arr[i];
				j++;
			}
			
		}
		
		return Arrays.copyOf(arr2, j);
	}

	
	public static void main(String[] args) {
		Ex08 ex08 = new Ex08();
		int[] arr = {1,1,3,3,0,1,};
		System.out.println(Arrays.toString(ex08.solution(arr)));
	}

}