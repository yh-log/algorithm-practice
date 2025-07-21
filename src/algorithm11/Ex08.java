package algorithm11;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

//https://school.programmers.co.kr/learn/courses/30/lessons/181927

public class Ex08 {
   
   
   /*
    * 문제 설명 (마지막 두 원소)
    * 1. 마지막 원소가 그 전 원소보다 크면 마지막 - 그 전 원소의 값을 넣고
    * 2. 반대일 경우 마지막 원소 * 2의 값을 넣어 return
    */
   
   // 풀이 1. stream 사용
   // 시간 2.94ms ~ 5.01ms
   public int[] solution(int[] num_list) {
   
      List<Integer> list = Arrays.stream(num_list).boxed().collect(Collectors.toList());

      int len = num_list.length;
      
      list.add((num_list[len -1] > num_list[len - 2]) ? 
            num_list[len -1] - num_list[len - 2] : num_list[len -1] * 2);
      
      return list.stream().mapToInt(Integer::valueOf).toArray();
   }
   
   
   // 풀이 2. 배열로 풀이
   // 시간 0.02ms ~ 0.03ms
   public int[] solution1(int[] num_list) {
      
      int len = num_list.length;
      
      int[] arr = Arrays.copyOf(num_list, len + 1);
      
      arr[len] = (num_list[len -1] > num_list[len - 2]) ? 
               num_list[len -1] - num_list[len - 2] : num_list[len -1] * 2;
      
      return arr;
   }
   
   
   
   
   
   public static void main(String[] args) {
      Ex08 ex08 = new Ex08();
      int[] num_list = {2, 1, 6};
      System.out.println(Arrays.toString(ex08.solution1(num_list)));
   }

}
