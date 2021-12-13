package 조건문과반복문;

import org.junit.jupiter.api.Test;

/**
 * if 문과 달리 while문은 조건식 생략이 불가능하다. for(;;)과 같이 사용 불가능
 * 그래서 while은 항상 참을 유지하기위해 true를 기입한다 while(true) == for(;;)
 */
public class While {
    @Test
    void 숫자의_각_자릿수의_합() {
        int num = 12345;
        int sum = 0;

        while (num > 0) {
            sum += num % 10;
            num /= 10;
        }

        System.out.println(sum);
    }
}
