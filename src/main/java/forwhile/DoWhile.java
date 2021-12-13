package forwhile;

import java.util.Scanner;

public class DoWhile {
    public static void main(String[] args) {
        int tmp;
        Scanner scanner = new Scanner(System.in);
        int ans = (int) (Math.random() * 100) + 1; // 난수 저장


        // 난수를 1~100까지 생성해서 사용자 입력 값에 따라 근사값을 찾는다.
        // 정답을 맞추게되면 while문이 종료된다.
        do {
            System.out.print("1과 100사이의 정수를 입력하세요. >> ");
            tmp = Integer.parseInt(scanner.nextLine());

            if (ans > tmp) {
                System.out.println("좀 더 큰 수를 입력해보세요.");
            } else if (ans < tmp) {
                System.out.println("좀 더 작은 수를 입력해보세요.");
            }
        } while (ans != tmp);

        System.out.println("정답입니다!");
    }
}
