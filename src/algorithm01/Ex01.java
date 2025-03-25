package algorithm01;

/**
 * 링크 https://school.programmers.co.kr/learn/courses/30/lessons/120814
 */
public class Ex01 {

    /**
     * 문제 설명
     * 1. 7조각 으로 잘린 피자를
     * 2. n명이 모두 먹을 수 있는 피자 수 return
     */

    // 풀이 1. 나눗셈 올림
	// 시간 : 0.01ms ~ 0.02ms
    public int solution(int n){

    	// 소수점이 나올 경우 + 6을 해서 다음 몫으로 넘김
    	// 어떤 수를 7로 나누면 0~6 만 나머지가 나오기 때문에 6을 더해줌
        int piz = (n + 6) / 7; 

        return piz;
    }
    
    // 풀이 1-1. 나눗셈 올림 (Math 사용)
    // 시간 : 0.20ms ~ 0.29ms
    public int solution1_1(int n){

    	// Math.ceil() 은 double를 반환하므로 int 로 형변환
        int piz = (int) Math.ceil(n / 7.0);

        return piz;
    }
    
    
    // 풀이 2. 나머지 연산 + 삼항 연산자
    // 시간 : 0.01ms ~ 0.02ms
    public int solution2(int n){

        int piz = (n % 7 == 0) ? (n / 7) : (n / 7) + 1;

        return piz;
    }
    

    public static void main(String[] args) {
        Ex01 ex01 = new Ex01();
        System.out.println(ex01.solution1_1(10));
        System.out.println(ex01.solution1_1(7));
        System.out.println(ex01.solution1_1(23));
    }

}
