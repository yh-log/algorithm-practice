package algorithm13;

// https://school.programmers.co.kr/learn/courses/30/lessons/181887

public class Ex08 {
   
   /*
    * 문제 설명
    * 1. 배열에서 홀수번째의 합과 짝수번째의 합중 더 큰것을 return
    */
   
   
   // 풀이
   // 시간 0.01ms ~ 0.04ms
   public int solution(int[] num_list) {
      
      int even = 0;
      int odd = 0;
      
      for(int i = 0; i < num_list.length; i++) {
         if(i == 0 || i % 2 == 0) {
            odd += num_list[i];
         }else {
            even += num_list[i];
         }
      }
      
      return even > odd ? even : odd;
   }

}
