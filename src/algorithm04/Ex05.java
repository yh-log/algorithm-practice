package algorithm04;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * 링크 https://school.programmers.co.kr/learn/courses/30/lessons/120850
 */

public class Ex05 {
	
	/**
	 * 문제 설명
	 * 1. 문자열에 숫자만 골라
	 * 2. 오름차순으로 정렬한 배열을 return
	 */
	
	// 풀이 1. Arrays.copyOf 사용
	// 시간 0.61ms ~ 1.67ms
	public int[] solution(String my_string) {
		
		int[] arr = new int[my_string.length()];
		int j = 0;
		
		for(int i = 0; i < my_string.length(); i++) {
			
			char ch = my_string.charAt(i);
			
			if(Character.isDigit(ch)) {
				System.out.println(j);
				arr[j] = Integer.parseInt(String.valueOf(ch));
				j++;
				
			}
		}
		
		// copyOf 는 새로운 배열을 주기 때문에 그걸 받아주는 것이 필수!!
		arr = Arrays.copyOf(arr, j);
		Arrays.sort(arr);
		
		return arr;
	}
	
	// 풀이 2. list 및 stream 사용
	// 시간 2.45ms ~ 5.81ms
	public int[] solution1(String my_string) {
		
		List<Integer> list = new ArrayList<>();		
		
		for(int i = 0; i < my_string.length(); i++) {
			if(Character.isDigit(my_string.charAt(i))) {
				list.add(Integer.parseInt(String.valueOf(my_string.charAt(i))));
			}
		}
		
		// Integer::parseInt : String 을 숫자로 바꿀 때 사용
		// i -> i : 숫자 그대로를 바꿀 때 (Integer 를 int로 언박싱)
		return list.stream().sorted().mapToInt(i -> i).toArray();
	}
	
	
	
	public static void main(String[] args) {
		Ex05 ex05 = new Ex05();
		
		System.out.println(Arrays.toString(ex05.solution("ass")));
	}

}
