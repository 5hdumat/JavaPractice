package forwhile;

import java.util.Scanner;

public class NamingFlow {
    public static void main(String[] args) {
        int num;
        int menu;

        Scanner scanner = new Scanner(System.in);

        outer:
        while (true) {
            System.out.println("(1) square");
            System.out.println("(2) square root");
            System.out.println("(3) log");
            System.out.println("원하는 메뉴(1~3)를 선택해주세요. (종료: 0)");

            menu = Integer.parseInt(scanner.nextLine());

            if (menu == 0) {
                System.out.println("프로그램을 종료합니다.");
                break;
            } else if (!(1 <= menu && menu <= 3)) {
                System.out.println("잘못 입력하셨습니다.");
                continue;
            }

            while (true) {
                System.out.println("계산할 값을 입력하세요. (0: 계산종료, 99: 프로그램 종료)");
                num = Integer.parseInt(scanner.nextLine());

                if (num == 0) {
                    System.out.println("계산을 종료합니다.");
                    break;
                }

                if (num == 99) {
                    System.out.println("프로그램을 종료합니다.");
                    break outer;
                }

                switch (menu) {
                    case 1:
                        System.out.printf("result = %d %n", num * num);
                        break;
                    case 2:
                        System.out.printf("result = %f %n", Math.sqrt(num));
                        break;
                    case 3:
                        System.out.printf("result = %f %n", Math.log(num));
                        break;
                    default:
                        System.out.println("계산할 수 없는 메뉴입니다.");
                }
            }
        }
    }
}
