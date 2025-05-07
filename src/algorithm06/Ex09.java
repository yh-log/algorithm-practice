package algorithm06;

import java.util.Arrays;

/**
 * 링크 https://school.programmers.co.kr/learn/courses/30/lessons/181902
 */

public class Ex09 {

	/**
	 * 문제 설명
	 * 1. 문자열이 주어질 때 
	 * 2. A ~ Z , a ~ z 의 개수를 순서대로 담은 배열 return
	 * 3. 배열의 길이 52개 (아스키 코드)
	 */
	
	
	/**
	 * 풀이 방법 고민
	 * a. 반복문과 아스키 코드를 사용해 풀이
	 *  → 비교 횟수가 너무 많아짐..
	 * b. 컬렉션 사용
	 *  → set : 중복 x, 순서 o
	 *  → List : 중복 o, 순서 x
	 *  → Map : key 중복 x , key-value
	 *  → stack : 뒤에서 꺼내는거 의미 x
	 * c. 문자열을 배열에 담아 해당 배열에 아스키코드가 contains 하는지를 체크
	 *  → 반복문 1회로만 할 수 있음 / 시간 복잡도는 고려해봐야 함
	 * 
	 * 아스키 코드 : 대문자 65 ~ 90 / 소문자 97 ~ 122
	 */
	
	
	// 풀이
	// 시간 0.07ms ~ 2.79ms
	public int[] solution(String my_string) {
		
		int[] arr = new int[52];
		
		int num = 65;
		
		
		for(int i = 0; i < 52; i++) {
			
			int count = 1;
			
			if(num == 91) {
				num = 97;
			}
		
			for(int j = 0; j < my_string.length(); j++) {
				if(my_string.charAt(j) == num) {
					arr[i] = count;
					count++;
				}
			}
			num++;
			if(count == 0) {
				arr[i] = 0;
			}
			
		}
		
		return arr;
	}
	
	// 풀이 2
	public int[] solution1(String my_string) {
		int[] arr = new int[52];
		
		for(int i = 0; i < my_string.length(); i++) {
			char ch = my_string.charAt(i);
			
			// 문자가 대문자일 경우
			if('A' <= ch && ch <= 'Z') {
				arr[ch - 'A']++; // 알파벳 순서에 맞춰 값 증가
				// ex. B - A = 1 → arr[1]++;
				
			// 문자가 소문자일 경우 (인덱스 26~51)
			}else if('a' <= ch && ch <= 'z') {
				arr[ch - 'a' + 26]++;
			}
		}
		
		return arr;
	}
	
	
	
	
	
	
	
	
	public static void main(String[] args) {
		Ex09 ex04 = new Ex09();
		
		System.out.println(Arrays.toString(ex04.solution1("Programmers")));
	}
	
	//[0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 1, 0, 0, 0, 1, 0, 1, 0, 0, 0, 0, 0, 2, 0, 1, 0, 0, 3, 1, 0, 0, 0, 0, 0, 0, 0]
	//[0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 1, 0, 0, 0, 1, 0, 1, 0, 0, 0, 0, 0, 2, 0, 1, 0, 0, 3, 1, 0]

	
}
