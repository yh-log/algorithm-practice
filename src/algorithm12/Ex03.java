package algorithm12;

// https://school.programmers.co.kr/learn/courses/30/lessons/181911

public class Ex03 {
   
   /*
    * 문제 설명 (부분 문자열 이어 붙여 문자열 만들기)
    * 1. 문자열 배열과 정수 배열이 주어질 때
    * 2. 정수 배열의 0번째 원소 값 ~ 1번째 원소 값 만큼의 길이로
    * 3. 문자열을 잘라서 이어붙여 최종 반환
    */
   
   /*
    * 방법 고민
    * 1. 스트링 빌더 선언
    * 2. 반복문으로 원소를 순회하며 새로운 문자열에 이어 붙여주기
    * * 정수 배열이 2차원 배열이지만 0과 1까지만 존재하므로 이중for문 없이 풀이
    */
   
   // 풀이
   // 시간 0.04ms ~ 0.14ms 
   public String solution(String[] my_strings, int[][] parts) {
      
      StringBuilder sb = new StringBuilder();
      
      for(int i = 0; i < my_strings.length; i++) {
         
         int start = parts[i][0];
         int end = parts[i][1] + 1;
         
         sb.append(my_strings[i].subSequence(start, end));
      }
      
      return sb.toString();
   }
   
   
   public static void main(String[] args) {
      Ex03 ex03 = new Ex03();
      
      String[] strArr = {"progressive", "hamburger", "hammer", "ahocorasick"};
      int[][] arr = {{0, 4}, {1, 2}, {3, 5}, {7, 7}};
      
      System.out.println(ex03.solution(strArr, arr));
   }

}
