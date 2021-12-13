package 조건문과반복문;

import org.junit.jupiter.api.Test;

/**
 * Switch문의 제약조건중 하나는 조건식의 결과값이 반드시 정수형이여야 한다는 점이다. (case도 동일)
 */
public class SwitchCase {
    @Test
    void 가위바위보만들기() {
        System.out.println("가위(1), 바위(2), 보(3) 중 하나를 입력하세요");


        /**
         * 난수를 얻기 위해서는 Math.random()을 사용해야 하는데, 이 메서드는 0.0과 1.0 사이의 범위에 속하는 하나의 double값을 반환한다.
         * 0.0 범위는 포함되고 1.0 범위는 포함되지 않는다. (0.0 <= Math.random() < 1.0)
         * 즉, 1과 3사이의 범위를 얻으려면 3을 곱한 후 +1을 해줘야한다.
         * => (0.0 * 3) + 1 <= (Math.random() * 3) + 1 < (1.0 * 3) + 1
         */
        int com = (int) (Math.random() * 3) + 1;
        int user = 1;

        System.out.println("user = " + user);
        System.out.println("com = " + com);

        switch (user - com) {
            case 2:
            case -1:
                System.out.println("졌습니다.");
                break;

            case -2:
            case 1:
                System.out.println("이겼습니다");
                break;

            case 0:
                System.out.println("비겼습니다.");
                // 마지막 문장엔 break; 를 사용할 필요가 없다.
        }
    }

    @Test
    void 성별판별() {
        String regNo = "940725-1111111";

        // 문자열은 0부터 시작하는 시퀀스이다. 그러므로 8번째 자리의 문자를 가져오기위해선 8을 입력해야 한다.
        char gender = regNo.charAt(7);

        // char 타입의 값은 사실 문자가 아닌 정수(유니코드)이므로 switch문의 조건식과 case문에서 사용할 수 있다.
        switch (gender) {
            case '1':
            case '3':
                System.out.println("남자");
                break;
            case '2':
            case '4':
                System.out.println("여자");
                break;
            default:
                System.out.println("유효하지 않은 주민등록 번호입니다.");
        }
    }
}
