package algorithm02;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * 링크 https://school.programmers.co.kr/learn/courses/30/lessons/120905
 */

public class Ex02 {
	
	/**
	 * 문제 설명
	 * 1. 정수 n와 정수 배열 numlist가 주어질 때
	 * 2. n의 배수만 배열에 담아 return
	 */
	
	// 풀이 1. 배열의 크기를 미리 계산해주는 방법
	// 시간 0.01ms ~ 0.02ms
    public int[] solution(int n, int[] numlist) {
    	
        int count = 0;
        
        for(int num : numlist) {
        	if(num % n == 0) {
        		count ++;
        	}
        }
        
        int[] arr = new int[count];
        int index = 0;
        
        for(int num : numlist) {
        	if(num % n == 0) {
        		arr[index++] = num;
        	}
        }
        
        return arr;
    }
    
    // 풀이 2. list로 받아서 배열로 변환해주는 방법
    // 시간 1.99ms ~ 2.73ms
    public int[] solution1(int n, int[] numlist) {
        
    	List<Integer> list = new ArrayList<>();
    	
    	for(int num : numlist) {
    		if(num % n == 0) {
    			list.add(num);
    		}
    	}
    	
    	
        return list.stream().mapToInt(i -> i).toArray();
    }
    
    
    
    public static void main(String[] args) {
    	Ex02 ex02 = new Ex02();
    	
    	int n = 3;
    	int[] numlist = {4, 5, 6, 7, 8, 9, 10, 11, 12};
    	
    	System.out.println(Arrays.toString(ex02.solution(n, numlist)));
    	
    }

}
