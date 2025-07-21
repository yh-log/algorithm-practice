package algorithm11;


//https://school.programmers.co.kr/learn/courses/30/lessons/181834

public class Ex09 {
   
   /*
    * 문제 설명 (l로 만들기)
    * 1. 알파벳 소문자로 이루어진 문자열
    * 2. 만약 l보다 앞 순서는 모두 l로 바꾼 문자열 return
    */
   
   /*
    * 풀이 방법
    * 1. 문자열 분리해서 아스키 코드값으로 비교해서 진행
    */
   
   // 풀이
   // 시간 1.43ms ~ 8.75ms
   public String solution1(String myString) {
      
      StringBuilder sb = new StringBuilder();
      
      for(int i = 0; i < myString.length(); i++) {
         if(myString.charAt(i) < 'l') {
            sb.append("l");
         }else {
            sb.append(myString.charAt(i));
         }
      }
      
      return sb.toString();
   }
   
   // 풀이 2. 정규식 사용
   // 시간 5.75ms ~ 17.77ms
   public String solution(String myString) {
      
      return myString.replaceAll("[^l-z]", "l");
   }
   
   public static void main(String[] args) {
      Ex09 ex09 = new Ex09();

      System.out.println(ex09.solution("abcdevwxyz"));
   }

}
