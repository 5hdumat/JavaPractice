package type;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.*;

public class PrimitiveType {
    /**
     * boolean
     * <p>
     * - 기본값은 false이다.
     * - 대소문자를 구분한다. (False -> 에러)
     */
    @Test
    void 논리형() {

        boolean power = true;
        boolean checked = false;
    }

    /**
     * char
     * <p>
     * - 단 한가지 문자만을 저장할 수 잇다.
     * - 문자가 저장되는 것 같지만 문자가 아닌 '문자의 유니코드(정수)'가 저장된다. (문자 'A'의 유니코드는 65이므로, A는 65가 저장된다.)
     * - char타입의 크기는 2byte(=16 bit)이므로, 16자리의 2진수로 표현할 수 있는 정수의 개수인 65536개(2^16)의 코드를 사용할 수 있으며,
     * char형 변수는 이 범위 내의 코드 중 하나를 이진수로 저장한다.
     */
    @Test
    void 문자형() {
        char ch1 = 'A';
        char ch2 = 65;

        // ch1과 ch2는 동일하다.
        assertThat(ch1).isEqualTo(ch2);

        // 어떤 문자의 유니코드를 알고 싶다면 char 형 변수에 저장된 값을 int 형으로 캐스팅하면된다.
        assertThat((int) ch1).isEqualTo(65);
    }

    @Test
    void 문자형_특수문자() {
        /**
         * '
         * abc	12456
         *
         *
         * "Hello"
         * c:\
         */
        System.out.println('\'');
        System.out.println("abc\t123\b456"); // \b에 의해 3이 지워진다. (\b: 백스페이스)
        System.out.println('\n');
        System.out.println("\"Hello\"");
        System.out.println("c:\\");
    }

    /**
     * 정수형 특징
     * <p>
     * - 정수형에는 모두 4개의 자료형이 있다.
     * - 각 자료형이 저장할 수 있는 값의 범위가 서로 다르다. 크기순으로 나열하면 아래와 같다.
     * -> byte(1byte) -> short(2byte) -> int(4byte, 기본 자료형) -> long(8byte)
     * - 메모리를 절약하고자 byte나 short를 사용하기 보단 int 사용을 권장한다.
     * -> JVM의 피연산자 스택(operand stack)이 피연산자를 4 byte 단위로 저장하기 때문에 4 byte보다 작은 자료형의 값을 계산할 때는 4 byte로 변환하여 연산이 수행된다.
     * 그러므로 오히려 int를 사용하는 것이 더 효율적이다.
     */

    // 오버플로우가 발생했다고 해서 에러가 바랭하는 것은 아니다. 다만 예상했던 결과를 얻지 못할 뿐이다.
    // 오버플로우란? 타입이 표현할 수 있는 값의 범위를 넘어서는 것
    // -> 4 bit 이진수 '1111'에 '0001'을 더하면 '10000' 이지만 4 bit를 넘어서므로 오버플로우
    @Test
    void 정수형_오버플로우() {
        short sMin = -32768;
        short sMax = 32767;
        char cMin = 0;
        char cMax = 65535;

        System.out.println(cMax);
        System.out.println("sMin    = " + sMin);
        System.out.println("sMin-1  = " + (short) (sMin - 1)); // sMin은 -32768로 short형의 최솟값이다. 여기서 1을 빼면 최댓값으로 오버플로우된다. (32767 출력)
        System.out.println("sMax    = " + sMax);
        System.out.println("sMax+1  = " + (short) (sMax + 1)); // 최댓값에 +1 을 해줬더니 최솟값으로 오버플로우 됐다.
        System.out.println("cMin    = " + (int) cMin); // char은 최솟값이 0 이다. (유니코드는 음수가 없으므로)
        System.out.println("cMin-1  = " + (int) --cMin);
        System.out.println("cMax    = " + (int) cMax);
        System.out.println("cMax+1  = " + (int) ++cMax);
    }

    /**
     * [정밀도]
     * float -> 7자리
     * double -> 15자리
     */
    @Test
    void 실수형() {
        float f = 9.12345678901234567890f;
        float f2 = 1.2345678901234567890f;
        double d = 9.12345678901234567890;

        System.out.printf("f   : %f %n", f); // %f는 기본적으로 소수점 이하 6자리까지만 출력하르모 7번째 자리는 반올림한다.
        System.out.printf("f   : %24.20f %n", f); // 24자리 중 20자리는 소수점 이하의 수를 출력하라는 의미이다.
        System.out.printf("f2  : %24.20f %n", f2); //
        System.out.printf("d   : %24.20f %n", d); //
    }
}
