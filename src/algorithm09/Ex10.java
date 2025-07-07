package algorithm09;


//링크 : https://school.programmers.co.kr/learn/courses/30/lessons/181879
public class Ex10 {
	
	/**
	 * 문제 설명
	 * 1. 배열의 길이가 11 이상이면 모든 원소의 합을
	 * 2. 10 이하면 모든 원소의 곱을 return
	 */
	
	// 풀이
	// 시간 0.02ms ~ 0.04ms
	public int solution(int[] num_list) {
		
		int num = 1;
		
		if(num_list.length >= 11) {
			for(int i = 0; i < num_list.length; i++) {
				num += num_list[i];
			}
			num = num - 1;
		}else {
			for(int i = 0; i < num_list.length; i++) {
				num = num * num_list[i];
			}
		}
		
		return num;
	}
	
	
	public int solution1(int[] num_list) {
		
		int num = num_list.length < 11 ? 1 : 0;
		
		for(int i = 0; i < num_list.length; i++) {
			if(num_list.length >= 11) {
				num += num_list[i];
			}else {
				num *= num_list[i];
			}
		}
		
		return num;
	}
	
	
	
	
	
	
	
	
	
	
	public static void main(String[] args) {
		Ex10 ex02 = new Ex10();
		int[] arr = {2, 3, 4, 5};
		System.out.println(ex02.solution1(arr));
	}
}
