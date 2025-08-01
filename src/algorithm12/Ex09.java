package algorithm12;

// https://school.programmers.co.kr/learn/courses/30/lessons/181847

public class Ex09 {
   
   /*
    * 문제 설명
    * 1. 왼쪽에 문자열에 0을 뗀 나머지를 return
    */
   
   // 풀이
   // 시간 0.01ms ~ 0.02ms
   public String solution(String n_str) {
      
      int idx = 0;
      
      while(idx < n_str.length() && n_str.charAt(idx) == '0') idx++;
      
      return n_str.substring(idx);
      
   }
   
   
   public static void main(String[] args) {
      Ex09 ex09 = new Ex09();
      System.out.println(ex09.solution("00101"));
   }

}
