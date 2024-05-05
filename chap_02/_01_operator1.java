package chap_02;

public class _01_operator1 {
    public static void main(String[] args) {
        // 산술 연산자 (계산하다)

        // 일반 연산
        System.out.println(4 + 2); // 6
        System.out.println(4 - 2); // 2
        System.out.println(4 * 2); // 8
        System.out.println(4 / 2); // 2
        System.out.println(5 / 2); // 2.5 (정수 연산일때는 소수점 뒤에가 지워짐)
        System.out.println(2 / 4); // 0 (뒤에 소수점이지워져 0)
        System.out.println(4 % 2); // 0 (4를 2로 나눈 나머지)
        System.out.println(5 & 2); // 1 (5를 2로 나눈 나머지)

        // 우선 순위 연산
        System.out.println(2 + 2 * 2); // 6 (곱하기 먼저 우선 연산)
        System.out.println((2 + 2) * 2); // 8 (가로 안 우선 연산)
        System.out.println(2+ (2 * 2)); //  6 (가로 안 우선 연산)

        // 변수를 이용한 연산 (실제 많이 사용)
        int a = 20;
        int b = 10;
        int c;

        c = a + b;
        System.out.println(c); // 30

        c = a - b;
        System.out.println(c); // 10

        c = a * b;
        System.out.println(c); // 200

        c = a / b;
        System.out.println(c); // 2

        c = a % b;
        System.out.println(c); // 0

        // 증강 연산 ++, --
         int val;
         val = 10;
        System.out.println(val); // 10
        System.out.println(++val); // 11 ( 현재 문장에 적용 ) (1에다가 10을 더함)
        System.out.println(val); // 11

        val = 10; // (val을 다시 10으로 만듦)
        System.out.println(val); // 10
        System.out.println(val++); // 10 ( 다음 문장에 적용 ) (10에다가 1을 더함)
        System.out.println(val); // 11

        val = 10;
        System.out.println(val); // 10
        System.out.println(--val); // 9 ( 현재 문장에 적용 ) (1에다가 10을 뺌)
        System.out.println(val); // 9 (적용 완료)

        val = 10; // (val은 10으로 다시 만듦
        System.out.println(val--); // 10 ( 다음 문장에 적용 ) (10에다가 1을 뺌)
        System.out.println(val); // 9

        // 은행 대기번호 표
        int waiting = 0;
        System.out.println("대기 인원 : " + waiting++); // 대기 인원 : 0
        System.out.println("대기 인원 : " + waiting++); // 대기 인원 : 1
        System.out.println("대기 인원 : " + waiting++); // 대기 인원 : 2
        System.out.println("총 대기 인원 : " + waiting); // 총 대기 인원 : 3
    }
}



