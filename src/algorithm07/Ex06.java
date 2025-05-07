package algorithm07;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * 링크 https://school.programmers.co.kr/learn/courses/30/lessons/42885
 */

public class Ex06 {
	
	/**
	 * 문제 설명 (Lv.2)
	 * ※ 조건 : 보트는 최대 2명 / 무게 제한 있음
	 * 1. 각 다른 무게를 가진 사람들이
	 * 2. 탈출할 수 있는 최소한의 구명보트의 수 return
	 * 
	 * ▶ 사람 1 ~ 50,000명 / 무게 40 ~ 240
	 * ▶ 구명보트 무게 제한 40 ~ 240
	 * ▶ 구명보트의 무게 제한은 사람들의 몸무게의 최댓값 보다 크게 주어짐
	 */
	
	// [욕심쟁이 방법] - 최대한 큰 수부터 욕심내서 넣기
	
	// 풀이
	// 시간 ms ~ ms
	public int solution(int[] people, int limit) {
		
		
		List<Integer> list = new ArrayList<Integer>();
		
		// 1. 오름차순으로 정렬 (최대한 큰 수부터 넣기 위해)
		Arrays.sort(people);
		
		// 보트의 수를 담을 변수
		int count = 0;
		
		int num = 0;
		
		// 2. 한명씩 넣고 limit에 걸리는지 체크
		for(int i = people.length -1; i >= 0; i--) {

			// 아냐아냐 배열을 모두 순회하면서 넣을 수 있는 가장 큰 수를 넣어야해
			// 그러면서 한번 넣은 수는 빼줘야 하고, 
			// 그럼 그냥 배열을 순회하는게 아니라
			// 특정 인덱스는 뺄 수 있도록 해야하고
			// 그 빠진 인덱스 만큼 반복문 횟수가 조정되어야 함
			// 컬렉션프레임워크가 있을까? → 
			
			// 아니지 0번 인덱스랑 그 이후 인덱스를 더해서 limit보다는 작으면서
			// 가장 큰 수가 있으면 2명 이상을 빼고,
			// 없으면 1명만 나가는 방식으로 하는거지! 
			// 그러면 그 특정 인덱스 번호는 어떻게 뺄 수 있을까?
			// -> list로 조작? list.remove(index)
			// 그리고 만약 안쪽 for문을 돌았을 때에도 limit 에 남은 수보다 작은 수가 배열에 있으면
			// 다시 for문을 돌 수 있게 해야하나?
			// 시간 복잡도 괜찮나..?
			
			
			num += people[i];

			if(num < limit) {
				
			}else {
				num = 0;
			}
			
			
		}
		
		return 0;
	}
	
	
	
	
	
	
	
	public static void main(String[] args) {
		Ex06 ex01 = new Ex06();
		int[] people1 = {70, 50, 80, 50};
		int[] people2 = {70, 80, 50};
		
		System.out.println(ex01.solution(people1, 100));
		System.out.println(ex01.solution(people2, 100));
	}

}
