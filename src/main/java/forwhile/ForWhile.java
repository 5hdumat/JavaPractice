package forwhile;

import java.util.Scanner;

public class ForWhile {
    public static void main(String[] args) {
        int num;
        int sum = 0;
        boolean flag = true;
        Scanner scanner = new Scanner(System.in);

        System.out.println("합계를 구할 숫자를 입력하세요. (종료: 0)");

        while (flag) {
            String tmp = scanner.nextLine();
            num = Integer.parseInt(tmp);

            if (num != 0) {
                sum += num;
            } else {
                flag = false;
            }
        }

        System.out.printf("합계 %d", sum);
    }
}
