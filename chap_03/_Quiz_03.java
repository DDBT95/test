package chap_03;
public class _Quiz_03 {
    public static void main(String[] args) {
        // "901231-1234567" 인 경우 901231-1 까지 출력
        // "030708-4567890" 인 경우 030708-4 까지 출력

        String id = "901231-1234567"; // 주민등록번호 13까지
        System.out.println(id.substring(0,8)); // 0 위치부터 8 위치 직전까지

        id = "030708-4567890";
        System.out.println(id.substring(0,id.indexOf("-") + 2));  // - 다음 두칸 까지 (중요한 스킬!!)






    }

}
