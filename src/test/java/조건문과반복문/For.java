package 조건문과반복문;

import org.junit.jupiter.api.Test;

public class For {

    @Test
    void 별찍기() {
        int num = 10;

        for (int i = 1; i <= num; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }

    @Test
    void 향샹된_for문() {
        int[] arr = {1, 2, 3, 4, 5};

        for (int tmp : arr) {
            System.out.printf("%d ", tmp); // 1 2 3 4 5 출력
        }

    }
}
