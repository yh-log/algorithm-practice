package algorithm05;

/**
 * 링크 https://school.programmers.co.kr/learn/courses/30/lessons/120818
 */

public class Ex02 {
	
	/**
	 * 문제 설명
	 * 1. 10만원 이상 구매 시 5% 할인
	 * 2. 30만원 이상 구매 시 10% 할인
	 * 3. 50만원 이상 구매 시 20%를 할인해준다.
	 * 4. 구매한 옷 가격 price가 있을 때 할인 후 지불해야 하는 금액을 return
	 */
	
	// 풀이 
	// 시간 0.01ms ~ 0.02ms
	public int solution(int price) {
		
		if(price >= 100000 && price < 300000) {
			return (int) ( price - (price * 0.05));
		}else if(price >= 300000 && price < 500000) {
			return (int) ( price - (price * 0.1));
		}else if(price >= 500000) {
			return (int) (price - (price * 0.2));
		}else {
			return price;
		}
		
	}

}
