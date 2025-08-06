package algorithm13;

// https://school.programmers.co.kr/learn/courses/30/lessons/181939

public class Ex09 {
   
   /*
    * 문제 설명 (더 큰 수 반환)
    * 1. a + b , b + a 중 더 큰값 return
    * 2. 수를 더하지 않고 문자열로 계산해줌
    */
   
   // 풀이
   // 시간 6.24ms ~ 10.62ms
   public int solution(int a, int b) {
      
      int anum = Integer.valueOf(a + "" + b);
      int bnum = Integer.valueOf(b + "" + a);
      
      return anum > bnum ? anum : bnum;
   }

}
