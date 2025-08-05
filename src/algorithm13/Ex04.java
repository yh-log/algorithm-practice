package algorithm13;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

// https://school.programmers.co.kr/learn/courses/30/lessons/181858

public class Ex04 {

   /*
    * 문제 설명
    * 1. k : 배열의 길이
    * 2. 겹치지 않는 수일 경우에만 배열에 담아준다.
    * 3. 배열 길이가 k 보다 작을 경우 나머지는 -1로 채워준다.
    */
   
   
   // 풀이
   // 시간 0.04ms ~ 10.51ms
   public int[] solution(int[] arr, int k) {
      
      List<Integer> list = new ArrayList<>();
      
      for(int num : arr) {
         if(list.size() < k && !list.contains(num)) {
            list.add(num);
         }
      }
      
      int[] arr_list = new int[k];
      
      for(int i = 0; i < k; i++) {
         if(i < list.size()) {
            arr_list[i] = list.get(i);
         }else {
            arr_list[i] = -1;
         }
      }
        
        return arr_list;
    }
   
   
   public static void main(String[] args) {
      Ex04 ex04 = new Ex04();
      int[] arr = {0, 1, 1, 1, 1};
      System.out.println(Arrays.toString(ex04.solution(arr, 4)));
   }
   
}
