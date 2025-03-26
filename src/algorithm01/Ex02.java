package algorithm01;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;

/**
 * 링크 https://school.programmers.co.kr/learn/courses/30/lessons/120821
 */
public class Ex02 {
	
    /**
     * 문제 설명
     * 1. 정수 배열의 원소 순서를 뒤집은 배열을 return
     */
	
	// 풀이 1. for 문으로 꺼내서 다시 넣기
	// 시간 0.01ms ~ 0.02ms
	public int[] solution(int[] num_list) {
		
		int[] num = new int[num_list.length];

		for(int i = 0; i < num_list.length; i++) {
			num[i] = num_list[num_list.length  - i - 1];
		}
	
		return num;
	}
	
	// 풀이 1-1. 반복문 설정 시 ; 이전에 , 로 구분하면 1개 이상의 조건 설정 가능
	// 시간 0.01ms ~ 0.02ms
	public int[] solution1_1(int[] num_list) {
		
		int[] num = new int[num_list.length];
		
		for(int i = num_list.length -1, j = 0; i >= 0; i--, j++) {
			num[j] = num_list[i];
		}
		
		return num;
	}
	
	// 풀이 2. Collections.reverse 함수를 사용
	// 시간 2.97ms ~ 4.42ms
	public int[] solution2(int[] num_list) {
		
		// Collections.reverse 는 List에서만 사용이 가능하다.
		// int[] 는 기본형 이므로 리스트로 변환할 수 없다. 
			// boxed() : 를 사용하면 int 를 Integer로 변환할 수 있다. (오토박싱)
			// 기본형을 래퍼클래스로 변환할 때 사용한다. (ex. int, double, long)
			// * 오토박싱 : 기본형 데이터를 자동으로 래퍼 클래스 객체로 변환하는 것을 의미함
		
		// .collect(Collectors.toList()) : 스트림을 List로 변환하는 방법으로, 스트림 요소를 리스트로 모아준다.
		
		List<Integer> list = Arrays.stream(num_list).boxed().collect(Collectors.toList());

		// 리스트 뒤집기
		Collections.reverse(list);
	
		// list를 스트림으로 변환해준다.
			// * 스트림은 메서드 체인처럼 사용할 수 있는 객체이다.
		// Integer 를 int 로 변환하기 위해 mapToInt(Integer::inValue) 사용 (언박싱)
			// Integer 객체에서 intValue를 호출해서 int로 변환
			// * :: 메서드 레퍼런스 문법으로 만약 사용하지 않는 경우
				// → map(x -> x.intValue()) 로 사용할 수 있다.
		// toArray() : 변환된 int 값을 새로운 int[] 배열로 반환한다.
		
		return list.stream().mapToInt(Integer::intValue).toArray();
	}
	
	
	public static void main(String[] args) {
		Ex02 ex02 = new Ex02();
		
		int[] num_list = {1, 2, 3, 4, 5}; 
		
		System.out.println(Arrays.toString(ex02.solution(num_list)));
	}
	

}
