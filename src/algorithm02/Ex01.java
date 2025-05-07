package algorithm02;

/**
 * 링크 https://school.programmers.co.kr/learn/courses/30/lessons/120903
 */
public class Ex01 {
	
	/**
	 * 문제 설명
	 * 1. 문자열 배열 s1과 s2가 주어질 때 
	 * 2. 같은 원소의 개수를 return
	 * 3. 배열의 원소 길이는 1~10
	 */
	
	// 풀이 1. 반복문과 if 문을 사용한 풀이 
	// 시간 0.02ms ~ 0.03ms
    public int solution(String[] s1, String[] s2) {
        int answer = 0;
        
        for(int i = 0; i < s1.length; i++) {
        	for(int j = 0; j < s2.length; j++) {
        		if(s1[i].equals(s2[j])) {
        			answer++;
        		}
        	}
        }
        
        return answer;
    }
    

    

    public static void main(String[] args) {
    	Ex01 ex01 = new Ex01();
    	
    	String[] s1 = {"n", "omg"};
    	String[] s2 = {"m", "dot"};
    	
    	System.out.println(ex01.solution(s1, s2));
    }

}
