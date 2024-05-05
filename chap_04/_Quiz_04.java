package chap_04;

public class _Quiz_04 {
    public static void main(String[] args) {
        // 내가 푼거.. 삼항 연산자 이용.. 이거 맞나??

        // 주차요금은 시간당 4000원 (일일 최대 요금 30000 원)
        // 경차 또는 장애인 차량은 최종 요금에서 50% 할인

        // 일반 차량 5시간 주차 시 20000원
        // 경차 5시간 주차 시 10000원
        // 장애인 차량 10시간 주차 시 15000원

        // 실행결과 : 주차 요금은 xxx원 입니다.

        int hour = 10;
        int a = 4000;
        int c = hour * a;
        int b = 2;
        int max = 30000;
        int maxy = (max >= c) ? c : max;

        if (hour <= 24) {
            System.out.println("일반 차량 " + hour + "시간 주차 시 " + (maxy) + "원" );
            System.out.println("경차 " + hour + "시간 주차 시 " + ((maxy) / b) + "원");
            System.out.println("장애인 차량 " + hour + "시간 주차 시 " + (maxy / b) + "원");
        }
        System.out.println("일일 최대 요금은 30000원 입니다.");

        System.out.println("----------------------");

        // 강사님이 푸신거...

        hour = 10; // 주차시간  (위에서 int 선언 또 쓸 필요없다)
        boolean inSmallCar = true; // 경차 여부
        boolean withDsisabledPerson = true; // 장애인 차량 여부

        int fee = hour * 4000; // 시간당 4000원 곱하기

        // 30000원 초과 시 일일 최대 요금으로 수정
        if (fee > 30000){
            fee = 30000;
        }
        // 경차 또는 장애인 차량인 경우 50% 할인
        if (inSmallCar || withDsisabledPerson) {
            fee /= 2; // 50% 할인 적용
        }

        // 실행 결과 출력
        System.out.println("주차 요금은 " + fee + "원 입니다.");




    }
}
