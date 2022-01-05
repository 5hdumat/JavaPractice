package varargs;

/**
 * 가변인자는 매개 변수의 개수를 고정하지않고 동적으로 지정할 수 있는 기능이다. (가변인자는 오버로딩하지 않는것이 좋다.)ㅇㅇ
 */
public class Varargs {
    public static void main(String[] args) {
        System.out.println(concatenate(",", "2", "3", "4"));
        System.out.println(concatenate(",", new String[]{"1", "2", "3"}));

    }

    static String concatenate(String delim, String... args) {
        String result = "";

        for (String str : args) {
            result += str + delim;
        }

        return result;
    }
}
