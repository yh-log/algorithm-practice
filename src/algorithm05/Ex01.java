package algorithm05;

/**
 * 링크 https://school.programmers.co.kr/learn/courses/30/lessons/120845
 */

public class Ex01 {

	/**
	 * 문제 설명
	 * 1. 정육면체 모양의 주사위를 가장 많이 채우고 싶음
	 * 2. 상자의 가로, 세로, 높이가 저장된 배열과
	 * 3. 주사위 모서리 길이 n이 있을 때
	 * 4. 상자에 들어갈 수 있는 주사위의 최대 개수를 return
	 */
	
	// 풀이
	// 시간 0.01ms ~ 0.02ms
	public int solution(int[] box, int n) {
		
		return (box[0] / n) * (box[1] / n) * (box[2] / n);
	}
	
	
	
	public static void main(String[] args) {
		Ex01 ex01 = new Ex01();
		
		int[] box = {10, 8, 6};
		System.out.println(ex01.solution(box, 3));
	}
}
