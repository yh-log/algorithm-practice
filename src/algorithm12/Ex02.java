package algorithm12;

import java.util.Arrays;

//https://school.programmers.co.kr/learn/courses/30/lessons/181889

public class Ex02 {
   
   /*
    * 문제 설명 (n번째 원소까지)
    * 1. 배열의 첫 번째 ~ n번째까지 배열을 담은 배열을 return (숫자는 1부터 시작 - 인덱스)
    */
   
   /*
    * 방법 고민
    * 1. 반복문 또는 배열 함수 사용
    */
   
   // 풀이
   // 시간 0.02ms ~ 0.03ms
   public int[] solution(int[] num_list, int n) {
      
      return Arrays.copyOfRange(num_list, 0, n);
   }
   

}
