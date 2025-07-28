package algorithm12;

import java.util.Scanner;

// https://school.programmers.co.kr/learn/courses/30/lessons/181947

public class Ex05 {

   /*
    * 문제 설명 (덧셈식 출력하기)
    * 1.a, b가 주어질 때 a + b = c 계산식 출력
    */
   
   // 풀이
   public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();

        System.out.println(a + " + " + b + " = " + (a+b));
    }
}
