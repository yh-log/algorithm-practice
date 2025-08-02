package algorithm13;

// https://school.programmers.co.kr/learn/courses/30/lessons/181842

public class Ex03 {
   
   /*
    * 문제 설명
    * 1. 문자열 a 가 b에 속하면 1 아니면 0
    */
   
   // 풀이
   // 시간 0.02ms ~ 0.04ms
   public int solution(String str1, String str2) {
      return str2.contains(str1) ? 1 : 0;
   }

}
