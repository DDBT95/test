package chap_04;

public class _95_Quiz {
    public static void main(String[] args) {

        for (int i = 0; i < 5; i++) {  //   첫번째 실행?
            for (int j = 0; j < i; j++) { // 두번째 실행?? 가로
                System.out.print("**"); // 두번째 실행??
            }
            System.out.println("");  // 첫번째 실행?? 세로
        }
    }
}
