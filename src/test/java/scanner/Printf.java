package scanner;

import org.junit.jupiter.api.Test;

public class Printf {

    /**
     * [형식화된 출력 printf]
     * <p>
     * printf()는 지시자(specifier)를 통해 변수의 값으 ㄹ여러가지 형식으로 변환하여 출력하는 기능을 가지고 있다.
     * '지시자'는 값을 어떻게 출력할 것인지를 지정해주는 역할을 한다.
     * 정수형 변수에 저장된 값을 10진 정수로 출력할 때는 지시자 '%d'를 사용하며, 변수의 값을 지정된 형식으로 변환해서 지시자 대신 넣는다.
     */
    @Test
    void printf() {
        int age = 14;

        System.out.printf("age = %d", age);
    }

    @Test
    void 출력하려는_값이_2개라면() {
        int age = 14;
        int year = 2021;

        System.out.printf("age = %d year = %d", age, year);
    }

    /**
     * printf는 줄바꿈을 하지 않는다. 줄바꿈을 하려면 지시자 '%n'를 따로 넣어주자.
     */
    @Test
    void printf_줄바꿈() {
        int age = 14;
        int year = 2021;

        System.out.printf("age = %d year = %d %n", age, year);
    }

    /**
     * printf()의 지시자 중에서 자주 사용되는 것만 뽑아보면 다음과 같다.
     * (Java API, Fomrmatter클래스 (java.util패키지 참고)
     */
    @Test
    void 자주_사용하는_지시자_정수형() {
        byte b = 1;
        short s = 2;
        char c = 'A';

        int finger = 10;
        long big = 100_000_000_000L; // long big = 100000000000L
        long hex = 0xFFFF_FFFF_FFFF_FFFFL;

        /**
         * 참고) 2, 8, 16진수로 표현된 리터럴을 변수에 저장할 때, 16진수라는 것을 표시하기 위해 리터럴앞에 접두사 '0x', 8진수의 경우 '0'을 붙인다.
         */
        int octNum = 010; // 8진수 10, 10진수로는 8
        int hexNum = 0x10; // 16진수 10, 10진수로는 16
        int binNum = 0b10; // 2진수 10, 10진수로는 2

        System.out.printf("b: %d %n", b);
        System.out.printf("s: %d %n", s);
        System.out.printf("c: %c, %d %n", c, (int) c);

        System.out.printf("finger: [%5d] %n", finger);
        System.out.printf("finger: [%-5d] %n", finger);
        System.out.printf("finger: [%05d] %n", finger);
        System.out.printf("big: %d %n", big);
        System.out.printf("hex: %#x %n", hex); // 지시자는 %x 16진수 출력 ('#'은 접두사 즉, 16진수 0x, 8진수 0를 표현해준다.)

        System.out.printf("octNum: %o, %d %n", octNum, octNum); // 8진수 10, 10진수로는 8
        System.out.printf("hexNum: %x, %d %n", hexNum, hexNum); // 16진수 10, 10진수로는 16
        System.out.printf("binNum: %s, %d %n", Integer.toBinaryString(binNum), binNum); // 2진수 10, 10진수로는 2
    }

    @Test
    void 자주_사용하는_지시자_실수형() {
        String url = "www.codechobo.com";

        float f1 = .10f; // 0.100, 1.0e=1
        float f2 = 1e1f; // 10.0, 1.0e1, 1.0e+1 (e는 10의 2승을 의미한다.)
        float f3 = 3.14e3f;
        double d = 1.23456789;

        System.out.printf("f1: %f, %e, %g %n", f1, f1, f1);
        System.out.printf("f2: %f, %e, %g %n", f2, f2, f2);
        System.out.printf("f3: %f, %e, %g %n", f3, f3, f3);

        System.out.printf("d: %f <- 마지막 자리 반올림됨 %n", d);
        System.out.printf("d: %14.10f %n", d);

        /**
         * 지시자 '%s'에도 숫자를 추가하면 원하는 만큼의 출력공간을 확보하거나 문자열의 일부만 출력할 수 있다.
         */
        System.out.printf("[12345678901234567890] %n");
        System.out.printf("[%s] %n", url);
        System.out.printf("[%20s] %n", url); // 오른쪽부터 정렬
        System.out.printf("[%-20s] %n", url); // 왼쪽부터 정렬
        System.out.printf("[%.8s] %n", url); // 왼쪽에서 8글자만 출력
    }
}
