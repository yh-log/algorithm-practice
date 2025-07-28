package algorithm12;

//https://school.programmers.co.kr/learn/courses/30/lessons/131705

public class Ex04 {
   
   /*
    * 문제 설명 (삼총사)
    * 1. 배열 속 3개의 값을 합쳐 0이 될 경우를 return
    */
   
   /*
    * 방법 고민
    * - 3수를 비교해야 하므로 3번의 반목문을 사용 -> 배열 길이가 최대 13이므로 시간 복잡도 괜찮을 듯
    * - 자기 자신을 호출하는 재귀함수 사용
    */
   
   
   
   // 풀이. 반복문 사용
   // 시간 0.02ms ~ 0.03ms
   public int solution(int[] number) {
      
      int count = 0;
      
      // sum이 0이 되면 count++
      for(int i = 0; i < number.length; i++) {
         for(int j = i + 1; j < number.length; j++) {
            for(int k = j + 1; k < number.length; k++) {
               if(number[i] + number[j] + number[k] == 0) {
                  count++;
               }
            }
         }
      }
      return count;
   }
   
   
   
   // 풀이 2. 재귀 사용 (백트래킹)
   // 시간 0.02ms ~ 0.08ms
   
   int count = 0;
   
   public int solution1(int[] number) {
      
      combine(number, 0,0,0);
      
      return count;
   }
   
   private void combine(int[] number, int start, int depth, int sum) {
      
      if(depth == 3) {
         if(sum == 0) count++;
         return;
      }
      
      
      for(int i = start; i < number.length; i++) {
         combine(number, i + 1, depth + 1, sum + number[i]);
      }
      
   }
   
   
   public static void main(String[] args) {
      Ex04 ex04 = new Ex04();
      int[] number = {-3, -2, -1, 0, 1, 2, 3}; // -1, 1, -1, 1
      //-3, -2, -1, 0, 1, 2, 3
      
      System.out.println(ex04.solution1(number));
   }

}
