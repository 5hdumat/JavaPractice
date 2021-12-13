package type;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.*;

public class Casting {
    @Test
    void 형변환_방법() {
        double d = 85.4;
        int score = (int) d;

        // double 에서 int로 캐스팅할때 소수점은 반올림하지 않고 버린다.
        assertThat(score).isEqualTo(85);
    }

    @Test
    void 큰_타입에서_작은_타입으로_형변환() {
        int i = 300;
        byte b = (byte) i;

        // int는 4바이트인데 byte는 1바이트이므로 값손실이 발생한다.
        System.out.println(b);
        assertThat(b).isEqualTo(44);
    }

    @Test
    void 작은_타입에서_큰_타입으로_형변환() {
        byte b = -2;
        int i = (int) b;

        System.out.printf("[byte -> int] b = %d -> i = %d %n", b, i);
        System.out.println(Integer.toBinaryString(i));

        // 반환값이 음수인 경우 빈 공간을 1로 채운다. 형변환 후에도 부호를 유지할 수 있도록 하기 위해서이다.
        // -2는 2진수로 11111111111111111111111111111110이다.
        // (2는 2진수로 00000000000000000000000000000001이므로 2의 보수는 11111111111111111111111111111110이다.)
        assertThat(Integer.toBinaryString(i)).isEqualTo("11111111111111111111111111111110");
    }

    @Test
    void 실수의_형변환() {
        // float의 최대값보다 큰 값을 double로 저장한 후
        // float로 캐스팅하면 무한대가 된다.
        double d = 1.0e100;
        float f = (float) d;

        // float의 최솟값보다 작은 값을 double로 저장한 후
        // float로 캐스팅하면 0이 된다.
        double d2 = 1.0e-50;
        float f2 = (float) d2;

        /**
         * 실수도 오버플로우가 있다. 그리고 정수형에는 없는 언더플로우라는 것도 존재하는데
         * 언더플로우는 실수형으로 표현할 수 없는 아주 작은 값, 즉 양의 최소값보다 작은 값이 되는 경우를 말한다. 이때 변수의 값은 0이 된다.
         */
        System.out.println(f); // Infinity 오버플로우
        System.out.println(f2); // 0 언더플로우

        float f3 = 9.1234567f;
        double d3 = 9.1234567;
        int i = Float.floatToIntBits(f3);
        System.out.printf("wdwd %d",i);

        System.out.printf("f3 = %20.18f %n", f3); // 9.123456954956055000 정밀도가 소수점 6자리까지라 이후부턴 이상한 값들이 저장된다.
        System.out.printf("d3 = %20.18f %n", d3); // 9.123456700000000000 정밀도가 소수점 14자리까지 이므로 정확히 저장된다.
    }
}
