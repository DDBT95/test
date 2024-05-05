package chap_01;

public class _Quiz_01 {
    public static void main(String[] args) {
        // (내가 한거)
        String Name = "불광";
        int i = 0;
        int ii = 9;
        System.out.println(Name + i + ii + "번 버스");

        int a = 7;
        System.out.println("약 " + a + "분 후 도착");

        double d = 2.2;
        System.out.println("남은 거리 " + d + "km");

        // 버스 번호 (1234, 상암08)   (강사님이 한거)
        String busNo = "상암08";

        // 남은 시간 (3분, 5분)
        int minute =3;

        // 남은 거리 (1.5km 0.8km)
        double distance = 1.2;

        // 결과 출력
        System.out.println(busNo + "번 버스");
        System.out.println("약 " + minute + "분 후 도착");
        System.out.println("남은 거리 " + distance + "km");

    }


}
