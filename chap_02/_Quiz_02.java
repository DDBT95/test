package chap_02;

public class _Quiz_02 {
    public static void main(String[] args) {
        // 내가 푼거
        int k = 120;
        int x = 130;
        int y = 110;
        String max = (k < x) ? "키가 120cm 이상 이므로 탑승 가능합니다. " : "키가 120cm 미만 이므로 탑승 불가능 합니다.";
        String min = (k < y) ? "키가 120cm 이상 이므로 탑승 가능합니다. " : "키가 120cm 미만 이므로 탑승 불가능 합니다.";
        System.out.println(max);
        System.out.println(min);


        //  강사님이 하신거
        int height = 121;
        String result = (height >= 120) ? "탑승 가능합니다." : "탑승 불가능합니다.";
        System.out.println("키가 " + height + "cm 이므로 " + result);


    }
}
