package 조건문과반복문;

import org.junit.jupiter.api.Test;

/**
 * do-while문은 while문의 변형으로 기본적인 구조는 while문과 같으나 조건식과 블럭({})의 순서를 바꿔놓은 것이다.
 * 그래서 while과 반대로 블럭을 먼저 수행한 후에 조건식을 평가한다.
 * <p>
 * do {
 * // 조건식의 연산결과가 참일 때 수행될 문장들을 적는다.
 * } while (조건식);
 * <p>
 * 그리 많이 쓰이지는 않지만 반복적으로 사용자의 입력을 받아서 처리할 때 유용하다.
 */
public class DoWhile {
    @Test
    void do_while을_이용한_삼육구_게임() {
        int tmp;

        for (int i = 1; i <= 100; i++) {
            tmp = i;

            System.out.printf("i = %d ", i);

            do {
                if ((tmp % 10) % 3 == 0 && tmp % 10 != 0) { // 100때문에 tmp % 10 != 0 조건 추가
                    System.out.print("짝");
                }
            } while ((tmp /= 10) != 0);

            System.out.println();
        }
    }

    /**
     * 반복문에 이름을 붙여 중첩 반복문도 break문 한번으로 종료시킬 수 있다.
     */
    @Test
    void 이름_붙은_반복문() {
        Loop1:
        for (int i = 2; i <= 9; i++) {
            for (int j = 1; j <= 9; j++) {
                if (j == 5) {
                    break Loop1;
//                    break;
//                    continue Loop1;
//                    continue;
                }
                System.out.printf("%d * %d = %d ", i, j, i * j);
            }
            System.out.println();
        }
    }
}
