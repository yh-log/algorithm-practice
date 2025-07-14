package algorithm10;


//https://school.programmers.co.kr/learn/courses/30/lessons/181915

public class Ex09 {
	
	/*
	 * 문제 설명
	 * 1. 문자열과 정수 배열이 주어질 때
	 * 2. 배열의 값에 해당하는 수를 문자열의 인덱스로
	 * 3. 새로운 문자열을 만들어 return
	 */
	
	// 풀이
	// 시간 0.16ms ~ 1.53ms
	public String solution(String my_string, int[] index_list) {
		
		StringBuilder sb = new StringBuilder();

		
		for(int num : index_list) {
			sb.append(my_string.charAt(num));
		}
		
		return sb.toString();
	}

}
