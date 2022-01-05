package array;

import org.junit.jupiter.api.Test;

import java.util.Arrays;

import static org.assertj.core.api.Assertions.*;

public class Array {
    @Test
    public void 배열의_선언과_생성() throws Exception {
        //given
        /**
         * 1. 배열의 선언
         *  - 단지 생성된 배열을 다루기 위한 참조변수 선언을 하는것 뿐이다.
         */
        int[] score;

        /**
         * 2. 배열의 생성
         *  - 실제로 데이터를 저장하기 위한 메모리공간을 확보한다. (배열은 각 저장공간이 연속적으로 배치되어 있다.)
         *  - 배열의 타입과 함께 길이를 지정해주어야 한다.
         *  - 배열은 각 저장공간에 타입의 기본값을 초기화한다.(int -> 0)
         *  - 자바는 오른쪽 할당 방식이기 때문에 '=' 대입 연산자에 의해 int형 배열 참조 변수 score에 배열의 주소가 저장된다.
         */
        score = new int[5];

        // when
        score[3] = 100;
        int value = score[3];

        // then
        assertThat(value).isEqualTo(100);

        /**
         * score.length는 변경할 수 없다.
         * 상수로서 배열의 길이를 동적으로 사용할 수 있으므로 .length의 사용을 권장한다.
         */
        assertThat(score.length).isEqualTo(5);
    }

    @Test
    public void 배열의_초기화() throws Exception {
        //given
        // new int[] 생략가능
        // int[] score = new int[]{1, 2, 3, 4, 5};
        int[] score2 = {1, 2, 3, 4, 5};
        char[] ch = {'a', 'b'};

        // when
        /**
         * Arrays.toString(배열이름) 메서드를 사용하면 배열의 모든 요소를 문자열로 만들어서 반환한다. [첫번째 요소, 두번째 요소, ...]
         */
        System.out.println(Arrays.toString(score2));

        /**
         * I@3349e9bb와 같은 타입과 참조주소가 출력된다.
         * I는 int 배열이라는 의미이고, @뒤의 16진수는 배열의 주소이다. (실제 주소가 아닌 내부 주소)
         */
        System.out.println(score2);

        /**
         * 예외적으로 char의 경우에는 각 요소가 구분자 없이 ab로 출력된다.
         * 이는 println메서드가 char 배열일 때만 이렇게 동작하도록 작성되어있기 때문이다.
         */
        System.out.println(ch);

        // then
    }

    @Test
    public void arraycopy() throws Exception {
        //given
        char[] abc = {'a', 'b', 'c', 'd'};
        char[] num = {'0', '1', '2', '3', '4', '5', '6', '7', '8', '9'};
        char[] sum = new char[abc.length + num.length];

        // when
        // abc 배열의 0번째 요소부터 abc.length만큼 sum의 0번째 요소부터 차례차례 복사
        System.arraycopy(abc, 0, sum, 0, abc.length);
        System.out.println(sum);

        System.arraycopy(num, 0, sum, abc.length, num.length);
        System.out.println(sum);

        // then
    }

    /**
     * 배열 활용
     */
    @Test
    public void 섞기() throws Exception {
        //given
        int[] card = new int[10];
        int n, tmp;

        // when
        for (int i = 0; i < 10; i++) {
            card[i] = i;
            System.out.print(i);
        }
        System.out.println();

        for (int i = 0; i < card.length; i++) {
            n = (int) (Math.random() * 10);
            tmp = card[i];
            card[i] = card[n];
            card[n] = tmp;
        }

        // then
        for (int i : card) {
            System.out.print(i);
        }
    }

    @Test
    public void 로또번호() throws Exception {
        //given
        int[] ball = new int[45];
        int tmp, n;

        // when
        for (int i = 0; i < 45; i++) {
            ball[i] = i + 1;
        }

        for (int i = 0; i < 6; i++) {
            n = (int) (Math.random() * 45);
            tmp = ball[i];
            ball[i] = ball[n];
            ball[n] = tmp;
        }

        // then
        for (int i = 0; i < 6; i++) {
            System.out.printf("%d ", ball[i]);
        }
    }

    @Test
    public void bubble_sort() throws Exception {
        //given
        int[] numArr = new int[10];
        int tmp;
        boolean exchange;

        for (int i = 0; i < numArr.length; i++) {
            numArr[i] = (int) (Math.random() * numArr.length);
            System.out.print(numArr[i]);
        }

        System.out.println();

        // when
        for (int i = 1; i < numArr.length - 1; i++) {
            exchange = false;

            for (int j = 0; j < numArr.length - i; j++) {
                if (numArr[j] > numArr[j + 1]) {
                    tmp = numArr[j];
                    numArr[j] = numArr[j + 1];
                    numArr[j + 1] = tmp;

                    exchange = true;
                }
            }

            if (!exchange) {
                break;
            }
        }

        // then
        for (int i : numArr) {
            System.out.print(i);
        }
    }

    @Test
    public void 객체배열() throws Exception {
        //given
        String num = "1234567";
        String num2 = "1234567";
        char[] cha = {'1', '2', '3'};


        // when
        char c = num.charAt(3);// 인자 값인 인덱스 문자열 반환
        int length = num.length();// 문자열 길이 반환
        String substring = num.substring(1, 3); // 범위 내 문자열 반환
        boolean equals = num.equals(num2); // 문자열의 내용이 인자 값인 obj와 같은지 반환

        char[] chars = num.toCharArray(); // 문자열을 char 배열로 반환
        String chaToString = new String(cha); // char -> String 변환

        System.out.println(cha); // println으로 문자 배열 출력하면 한줄로 나열되어 출력된다.

        // then
        assertThat(c).isEqualTo('4');
        assertThat(length).isEqualTo(7);
    }

    @Test
    public void 다차원배열() throws Exception {
        //given
        int[][] num = {
                {1, 2, 3},
                {1, 2, 3},
                {1, 2, 3},
                {1, 2, 3},
                {1, 2, 3}
        };

        // when

        // 향상된 for문은 배열에 저장된 값을 변경할 수 없다.
        for (int[] ints : num) {
            for (int anInt : ints) {
                System.out.print(anInt);
            }
            System.out.println();
        }

        for (int i = 0; i < num.length; i++) {
            for (int j = 0; j < num[i].length; j++) {
                System.out.print(num[i][j]);
            }
            System.out.println();
        }
        // then
    }

    @Test
    public void 가변배열() throws Exception {
        //given
        int[][] num = new int[5][];

        // when
        // num 배열의 길이는 5지만 각 원소 배열의 길이는 모두 다르다.
        num[0] = new int[5];
        num[1] = new int[4];
        num[2] = new int[3];
        num[3] = new int[2];
        num[4] = new int[1];

        // then
        for (int[] ints : num) {
            System.out.println(ints.length);
        }

    }
}
