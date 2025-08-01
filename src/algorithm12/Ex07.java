package algorithm12;

// https://school.programmers.co.kr/learn/courses/30/lessons/181873

public class Ex07 {
   
   /*
    * 문제 설명
    * 1. 문자열과, 문자가 있을 때
    * 2. 문자열에서 문자에 해당되는 문자만 대문자로 바꿔 return
    */
   
   // 풀이
   // 시간 0.02ms ~ 0.04ms
   public String solution(String my_string, String alp) {
      
      return my_string.replace(alp, alp.toUpperCase());
   }

}