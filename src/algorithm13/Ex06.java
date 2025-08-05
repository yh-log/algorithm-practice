package algorithm13;

import java.util.Arrays;

// https://school.programmers.co.kr/learn/courses/30/lessons/181852

public class Ex06 {
   
   /*
    * 문제 설명 (뒤에서 5등 위로)
    * 1. 배열에 가장 작은 수 5개를 제외한 수를 오름차순으로 담은 리스트 return
    */
   
   // 풀이
   // 시간 0.33ms ~ 0.51ms
   public int[] solution(int[] num_list) {
      
      Arrays.sort(num_list);
      
      return Arrays.copyOfRange(num_list, 5, num_list.length);
    }

}
