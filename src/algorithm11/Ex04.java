package algorithm11;

// https://school.programmers.co.kr/learn/courses/30/lessons/181926

public class Ex04 {
	
	/*
	 * 문제 설명 (수 조작하기1)
	 * 1. w : 1 커짐
	 * 2. s : 1 작아짐
	 * 3. d : 10 커짐
	 * 4. a : 10 작아짐
	 * 5. 마지막 값 return
	 */
	
	// 풀이
	// 시간 0.67ms ~ 5.75ms
	public int solution(int n, String control) {
		
		for(int i = 0; i < control.length(); i++) {
			switch (control.charAt(i)) {
			case 'w':
				n += 1;
				break;
			case 's':
				n -= 1;
				break;
			case 'd':
				n += 10;
				break;
			case 'a':
				n -= 10;
				break;
			}
		}
		
		return n;
	}

}
