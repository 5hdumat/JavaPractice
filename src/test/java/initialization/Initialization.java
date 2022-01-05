package initialization;

public class Initialization {
    public static void main(String[] args) {
        System.out.println("호출 전");
        InitBlock initBlock = new InitBlock();
    }
}

/**
 * [초기화 블럭]
 * 아래와 같은 초기화 블럭 안에서는 조건문, 반복문, 예외처리구문 등의 사용이 가능하다.
 * 복잡한 초기화가 필요하다면 사용하면된다.
 * 생성자 초기화보다 인스턴스 초기화 블럭이 먼저 수행된다.
 *
 * 보통 생성자는 인스턴스 변수의 초기화에 사용하고, 인스턴스 초기화 블럭은 모든 생성자에서 공통으로 수행돼야 하는 코드를 넣는데 사용한다.
 */
class InitBlock {
    static {
        System.out.println("static {}");
    }

    {
        System.out.println("instance {}");
    }

    InitBlock() {
        System.out.println("생성자");
    }
}