package algorithm09;

import java.util.Arrays;

/**
 * https://school.programmers.co.kr/learn/courses/30/lessons/181886
 */

public class Ex03 {
	
	/**
	 * 문제 설명
	 * 1. 각 배열의 문자열이 주어질 때
	 * 2. 5개씩 묶어 가장 앞에 있는 문자열을 모은 배열을 return
	 */
	
	// 풀이
	// 시간 0.02ms ~ 0.03ms
	public String[] solution(String[] names) {
		
		String[] answer = new String[6];
		
		int i = 0;
		int j = 0;
		
		while(names.length > i) {
			answer[j] = names[i];
			j++;
			i += 5;
		}
		
		return Arrays.copyOf(answer, j);
	}

	
	public static void main(String[] args) {
		Ex03 ex03 = new Ex03();
		String[] names = {"nami", "ahri", "jayce", "garen", "ivern", "vex", "jinx", "a", "b", "c", "d"};
		System.out.println(Arrays.toString(ex03.solution(names)));
	}
}
