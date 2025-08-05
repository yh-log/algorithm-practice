package algorithm13;

// https://school.programmers.co.kr/learn/courses/30/lessons/181930

public class Ex07 {
   
   /*
    * 문제 설명
    * 1. 세 주사위를 굴렸을 때 나오는 숫자 a, b, c
    * 2. 세 숫자가 모두 다른 경우 : a + b + c
    * 3. 두 수를 같고 하나가 다른 경우 : (a + b+ c) * (a^2 + b^2 + c^2)
    * 4. 세 숫자가 모두 같은 경우 : (a + b+ c) * (a^2 + b^2 + c^2) * (a^3 + b^3 + c^3)
    */
   
   
   // 풀이
   // 시간 0.01ms ~ 0.03ms
   public int solution(int a, int b, int c) {
        
        if(a != b && b != c && a != c) {
           return a + b + c;
        }else if(a == b && b == c) {
           return (a + b+ c) * (a*a + b*b + c*c) * (a*a*a + b*b*b + c*c*c);
        }else {
           return (a + b+ c) * (a*a + b*b + c*c);
        }
        
    }

}