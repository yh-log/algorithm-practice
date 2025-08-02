package algorithm13;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

// https://school.programmers.co.kr/learn/courses/30/lessons/181919

public class Ex01 {
   
   /*
    * 문제 설명 (콜라츠 수열 만들기)
    * 1. x가 짝수면 2로 나누고
    * 2. 홀수면 3 * x + 1로 바꾸는 계산을 계속 반복하면
    * 3. 언젠카 x가 1이 되는지 묻는 문제로
    * 4. 이 과정을 기록한 것이 콜라츠 수열
    */
   
   /*
    * 방법 고민
    * 1. 반목문을 수행하며, 종료 조건을 1로 설정
    */
   
   
   // 풀이 1. 배열로 풀이
   // 시간 0.02ms ~ 0.03ms
   public int[] solution(int n) {
      
      int[] arr = new int[1000];
      
      int j = 1;
      arr[0] = n;
      
      while (n != 1) {
         if(n%2==0) n = n / 2;
         else n = 3 * n + 1;
         
         arr[j] = n;
         j++;
         
      }
      
      return Arrays.copyOf(arr, j);
   }
   
   // 풀이 2. list로 풀이
   // 시간 1.85ms ~ 2.79ms
   public int[] solution1(int n) {
      
      List<Integer> list = new ArrayList<>();
      list.add(n);
      
      while (n != 1) {
         if(n%2==0) n = n / 2;
         else n = 3 * n + 1;
         
         list.add(n);
      }
      
      return list.stream().mapToInt(i->i).toArray();
   }
   
   
   public static void main(String[] args) {
      Ex01 ex01 = new Ex01();
      System.out.println(Arrays.toString(ex01.solution1(10)));
   }

}
