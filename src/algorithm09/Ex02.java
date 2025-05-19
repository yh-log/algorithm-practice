package algorithm09;

/**
 * 링크 https://school.programmers.co.kr/learn/courses/30/lessons/181896
 */

public class Ex02 {
	
	/**
	 * 문제 설명
	 * 1. 배열에서 음수가 나오는 인덱스를 return
	 */
	
	// 풀이
	// 시간 0.02ms ~ 0.03ms
	public int solution(int[] num_list) {
		
		int num = -1;
		
		for(int i = 0; i < num_list.length; i++) {
			if(num_list[i] < 0) {
				num = i;
				break;
			}
		}
		
		return num;
	}

}
