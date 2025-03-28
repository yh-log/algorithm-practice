package algorithm01;

import java.util.Scanner;

/**
 * 링크 https://school.programmers.co.kr/learn/courses/30/lessons/181944
 */

public class Ex04 {
	
	/**
	 * 문제 설명
	 * 1. 자연수 n이 짝수면 n is even , 홀수면 n is odd를 출력
	 */
	
	// 문제 풀이 1. if 문 사용
	public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        
        if(n % 2 == 0) {
        	System.out.println(n + " is even");
        }else {
        	System.out.println(n + " is odd");
        }
        
    }
	
	// 문제 풀이 2. 삼항연산자 사용
	public static void sub(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		
		System.out.println(n + " is " + (n % 2 == 0 ? "even" : "odd"));
	}

}
