package chap_01;

public class _07_TypeCasting {
    public static void main(String[] args) {
        // 형변환 TypeCasting
        // 정수형에서 실수형으로
        // 실수형에서 정수형으로

        // int to float,double
        int score = 93;
        System.out.println(score); // 93
        System.out.println((float) score); // 93.0
        System.out.println((double) score); // 93.0

        // float,double to int
        float score_f = 93.3F;
        double score_d = 98.8;
        System.out.println((int)score_f); // 93
        System.out.println((int) score_d); // 98

        // 정수 + 실수 연산
        score = 93 + (int)98.8; // 93 + 98
        System.out.println(score); // 191

        score_d = 93 + 98.8; // 93.0 + 98.8   위에서 이미 double 변수 실수로 만들었다.
        System.out.println(score_d); // 191.8

        // 변수에 형변환된 데이터 집어넣기
        double convertedScoreDouble = score; // 191 -> 191.0
        // int -> long -> float -> double (자동 형변환)

        int convertedScoreInt = (int) score_d; // 191.8 -> 191
        // double -> float -> long -> int (수동 형변환)

        //  숫자를 문자열로  (밑에 두개중 하나 쓸 수 있다)
        String s1 = String.valueOf(93); // valueof 라는 기능을 써서 숫자를 문자열(string) 바꾼다
        s1 = Integer.toString(93); // integer(정수)를 toString 이라는 기능을 써서 문자열로 바꿈
        System.out.println(s1); // 93

        String s2 = String.valueOf(98.8); // valueof 라는 기능 써서 숫자(실수)를 문자로 바꿈
        s2 = Double.toString(98.8); // double을 (실수)를 toString 이라는 기능을 써서 문자열로 바꿈
        System.out.println(s2); // 98.8

        // 문자열을 숫자로
        int i =Integer.parseInt("93"); // parseint(파싱)이라는 기능으로 ("93")에서 93만큼 꺼내서 int(정수)로 변환
        System.out.println(i);
        double d = Double.parseDouble("98.8"); // parsedouble(파싱) 이라는 기능으로 ("98.8")에서 98.8 만큼 꺼내 double(실수) 로 변환
        System.out.println(d);

        int  error = Integer.parseInt("자바"); // ""(따옴표) 안쪽에 올바른 데이터가 들어가 있어야함 









    }
}
