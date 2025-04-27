package algorithm12;

import algorithm12.Ex01;

/**
 * 링크 https://school.programmers.co.kr/learn/courses/30/lessons/12951
 */

public class Ex01 {
	
	/**
	 * 문제 설명 (Lv.2)
	 * 1. 첫 문자가 대문자 그 뒤에는 소문자로
	 * 2. 만약 첫 문자가 숫자일 경우 뒤에는 소문자
	 * 3. 공백 문자가 연속으로 나올 수 있음 (\\s+ 정규식 필요)
	 */

	
	// 풀이
	// 시간 0.07ms ~ 0.17ms
	public String solution(String s) {
		
		StringBuilder sb = new StringBuilder();
		
		String[] arr = s.toLowerCase().split(" ", -1);
		
		for(int i = 0; i < arr.length; i++) {
			
			
			if(arr[i].length() > 0) {
				sb.append(Character.toUpperCase(arr[i].charAt(0)))
					.append(arr[i].substring(1));
			}else {
				sb.append(arr[i]);
			}
			
			if(i < arr.length -1) {
				sb.append(" ");
			}
		}
				
		return sb.toString();
	}
	
	
	// 풀이 2
	// 시간 1.28ms ~ 3.74ms
	public String soultion1(String s) {
		
		String answer = "";
		String[] arr = s.toLowerCase().split("");
		boolean flag = true;
		
		for(String str : arr) {
			answer += flag ? str.toUpperCase() : str;
			flag = str.equals(" ") ? true : false;
		}
		
		return answer;
	}
	
	
	public String solution2(String s) {
		
		StringBuilder sb = new StringBuilder();
		String[] arr = s.toLowerCase().split("");
		boolean flag = true;
		
		
		for(String str : arr) {
			sb.append(flag ? str.toUpperCase() : str);
			flag = sb.equals(" ") ? true : false;
		}
		
		return sb.toString();
	}
	
	
	public static void main(String[] agrs) {
		Ex01 ex01 = new Ex01();
		System.out.println(ex01.soultion1("3pEoplE          unFollowed   me     "));
		System.out.println(ex01.soultion1("f 1d 3d sdfse a        "));
	}
	
}
