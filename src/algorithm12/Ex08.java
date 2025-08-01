package algorithm12;

// https://school.programmers.co.kr/learn/courses/30/lessons/181840

public class Ex08 {
   
   /*
    * 문제 설명
    * 1. 배열에 숫자 n이 있으면 1 없으면 0
    */
   
   // 풀이
   // 시간 0.01ms ~ 0.02ms
   public int solution(int[] num_list, int n) {
      
      for(int i = 0; i < num_list.length; i++) {
         if(num_list[i] == n) return 1;
      }
      
      return 0;
   }

}
