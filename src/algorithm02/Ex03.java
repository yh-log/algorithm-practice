package algorithm02;

import java.util.Arrays;

/**
 * 링크 https://school.programmers.co.kr/learn/courses/30/lessons/120847
 */

public class Ex03 {
	
	/**
	 * 문제 풀이
	 * 1. 정수 배열 속 2개의 숫자를 사용해
	 * 2. 최대값을 만들어 return
	 */
	
	// 풀이 1. 오름차순 정렬 Arrays.sort
	// 시간 0.33ms ~ 0.53ms
    public int solution(int[] numbers) {
        
    	Arrays.sort(numbers);
    	return numbers[numbers.length -1] * numbers[numbers.length -2];
    	
    }
    
    // 풀이 2. 반복문
    // 시간 0.02ms ~ 0.05ms
    public int solution1(int[] numbers) {
        
    	int max1 = 0;
    	int max2 = 0;
    	
    	for(int num : numbers) {
    		if(num > max1) {
    			max2 = max1;
    			max1 = num;
    		}else if(num > max2) { // 최대값이 중복된 경우 갱신하기 위해
    			max2 = num;
    		}
    	}
    	return max1 * max2;
    }
    
    // 풀이 3. stream API 사용
    // 시간 3.50ms ~ 10.96ms
    public int solution2(int[] numbers) {
    	
    	int[] maxNum = Arrays.stream(numbers)
    						.boxed() // int -> Integer로 
    						.sorted((a,b) -> b -a) // 내림차준으로 정렬
    						.limit(2) // 상위 2개 값
    						.mapToInt(Integer::intValue) // Integer -> int로 
    						.toArray(); // 배열로 변환
    	
    	return maxNum[0] * maxNum[1];
    }
    
    public int solution3(int[] numbers) {
    	
    	int[] maxNum = Arrays.stream(numbers)
    						.boxed()
    						.sorted((a,b) -> a - b) // a- b 는 오름차순?
    						.limit(2)
    						.mapToInt(Integer::intValue)
    						.toArray();
    	
    	System.out.println(Arrays.toString(maxNum));
    	
    	return maxNum[0] * maxNum[1];
    }
    
    
    public static void main(String[] args) {
    	Ex03 ex03 = new Ex03();
    	
    	int[] arr = {1,2,3,4,5,2};
    	System.out.println(ex03.solution2(arr));
    }
    
}
