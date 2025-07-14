package algorithm10;

//https://school.programmers.co.kr/learn/courses/30/lessons/76501

public class Ex06 {
	
	/**
	 * 문제 설명 (Lv.1 음양 더하기)
	 * 1. 정수 배열과 boolean 배열이 있을 때
	 * 2. boolean 배열의 인덱스의 값이 true이면 정수 배열의 값은 양수
	 * 3. boolean 배열의 인덱스의 값이 false이면 정수 배열의 값은 음수이다.
	 * 4. 이럴 때 모든 정수(양수, 음수)의 합을 return 하시오.
	 */
	
	
	/**
	 * 방법 고민
	 * 1. 반복문을 사용해서 true와 false 값에 따라 +/- 한 후 return하기
	 */
	
	
	
	// 풀이
	// 시간 0.04ms ~ 0.07ms
	public int solution(int[] absolutes, boolean[] signs) {
		
		int sum = 0;
		
		for(int i = 0; i < absolutes.length; i++) {
			sum += (signs[i] == true ? absolutes[i] : - absolutes[i]);
		}
		
		return sum;
	}
	
	
	
	public static void main(String[] args) {
		Ex06 ex06 = new Ex06();
		int[] arr = {4,7,12};
		boolean[] isNum = {true,false,true};
		
		System.out.println(ex06.solution(arr, isNum));
	}
	

}

