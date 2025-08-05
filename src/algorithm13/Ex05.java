package algorithm13;

// https://school.programmers.co.kr/learn/courses/30/lessons/181841

public class Ex05 {
   
   /*
    * 문제 설명 (꼬리 문자열)
    * 1. 모든 문자열을 순서대로 합친 문자열 = 꼬리 문자열
    * 2. 특정 문자열을 포함한 문자열을 제외하고자 함
    * 3. 특정 문자를 포함한 문자를 제외한 꼬리 문자열 return
    */
   
   // 풀이
   // 시간 0.03ms ~ 0.05ms
   public String solution(String[] str_list, String ex) {
      
      StringBuilder sb = new StringBuilder();
      
      for(String str : str_list) {
         if(!str.contains(ex)) {
            sb.append(str);
         }
      }
      
      return sb.toString();
    }

}
