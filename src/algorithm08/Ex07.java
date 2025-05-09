package algorithm08;


/**
 * 링크 https://school.programmers.co.kr/learn/courses/30/lessons/12943
 */

public class Ex07 {
	
	/**
	 * 문제 설명
	 * 1. 입력된 수가 짝수일 경우 2로 나누고
	 * 2. 입력된 수가 홀수일 경우 3을 곱해고 1을 더한다.
	 * 3. 숫자가 1이 될 때까지 반복한다.
	 */
	
	
	// 풀이
	// 시간 0.02ms ~ 0.05ms
	public int solution(int num) {
		
		if(num == 1) {
			return 0;
		}
		
		long bNum = num;
		
		int count = 0;
		
		boolean isOne = false;
		
		while(!isOne) {
			
			if(bNum == 1) {
				isOne = true;
			}else {
				count++;
				if(bNum % 2 == 0) {
					bNum = bNum / 2;
				}else {
					bNum = (bNum * 3) + 1;
				}
			}
		}
		
		return count >= 500? -1 : count;
	}

	
	public int solution1(int num) {
		
		
		
		return 0;
	}
	
	public static void main(String[] args) {
		Ex07 ex07 = new Ex07();
		System.out.println(ex07.solution(16));
	}
}
