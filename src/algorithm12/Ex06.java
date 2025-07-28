package algorithm12;

// https://school.programmers.co.kr/learn/courses/30/lessons/181864

public class Ex06 {
   
   /*
    * 문제 설명
    * 1. A를 B로 , B를 A로 바꾼 문자열 중
    * 2. pat와 일치하는게 있으면 1, 아니면 0 return
    */

   
   // 풀이
   // 시간 0.03ms ~ 0.04ms
   public int solution(String myString, String pat) {
      
      String msg = myString.replace("A", "X")
                      .replace("B", "A")
                      .replace("X", "B");
      if(msg.contains(pat)) {
         return 1;
      }
      
      return 0;
   }
}
