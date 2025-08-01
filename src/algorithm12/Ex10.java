package algorithm12;

// https://school.programmers.co.kr/learn/courses/30/lessons/181837

public class Ex10 {

   /*
    * 문제 설명
    * 1. 아메리카노 4500, 라떼 5000
    * 2. 아무거나는 5000   
    */
   
   // 풀이
   public int solution(String[] order) {
      
      int sum = 0;
      
      for(String str : order) {
         System.out.println(str + " 일 경우 -< " + sum);
         if(str.contains("cafe")) sum += 5000;
         else sum += 4500;
         
      }
      
      return sum;
   }
   
   
   public static void main(String[] args) {
      Ex10 ex10 = new Ex10();
      String str[] = {"cafelatte", "americanoice", "hotcafelatte", "anything"};
      System.out.println(ex10.solution(str));
   }
}
