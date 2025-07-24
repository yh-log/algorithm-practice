package algorithm12;

import java.util.Arrays;

//https://school.programmers.co.kr/learn/courses/30/lessons/181909

public class Ex01 {
   
   /*
    * 문제 설명 (접미사 배열)
    * 1. 접미사는 특정 인덱스 부터 시작하는 문자열을 의미함
    * 2. 주어진 문자열에 대한 모든 접미사를 사전 순으로 정렬
    */
   
   /*
    * 방법 고민
    * 1. 문자열을 하나씩 끊어서
    * 2. 정렬하기
    */
   
   // 풀이
   // 시간 0.02ms ~ 0.56ms
   public String[] solution(String my_string) {
      
      String[] strArr = new String[my_string.length()];
      
      for(int i = 0; i < strArr.length; i++) {
         strArr[i] = my_string.substring(i);
      }
      
      Arrays.sort(strArr);
      
      return strArr;
   }
   
   
   public static void main(String[] args) {
      Ex01 ex01 = new Ex01();
      System.out.println(Arrays.toString(ex01.solution("banana")));
   }

}
