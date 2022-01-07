package abstractclass;

/**
 * 추상 클래스
 * <p>
 * 여러 클래스에 공통적으로 사용될 수 있는 클래스를 바로 작성하기도 하고,
 * 기존의 공통적인 부분을 뽑아서 추상클래스로 만들어 상속하도록 하는 경우도 있다.
 **/
public class AbstractTest {
    public static void main(String[] args) {
        AudioPlayer audioPlayer = new AudioPlayer();
        audioPlayer.defaultMethod();
        audioPlayer.abc();
    }
}

abstract class Player {
    abstract void play(int pos);

    abstract void stop();
}

/**
 * 인터페이스의 추상 메서드 중 일부만 구현해야 한다면 클래스에 abstract를 붙여주면 된다.
 * abstract class AudioPlayer extends Player implements test {
 */
class AudioPlayer extends Player implements test, test2 {
    @Override
    void play(int pos) {

    }

    @Override
    void stop() {

    }

    /**
     * 오버라이딩 할 때는 항상 조상 클래스의 저븐 제어자보다 더 넓은 범위의 젋근 제어자를 사용해야 한다.
     * 조상 클래스 next()는 public abstract가 생략된 것 이므로, 항상 public으로 오버라이딩 해야 한다.
     */
    @Override
    public void next() {

    }

    /**
     * 두 인터페이스 A와 B에서 상속하는 경우 A 인터페이스 A.super.foo()의 foo(기본값) 메서드 를 호출합니다.
     *
     * 동일한 이름을 가진 기본 메서드가 각각 있는 두 개의 인터페이스를 구현하면 모호합니다.
     * 구현에서 사용하기를 원하는 두 가지 기본 방법을 명시적으로 지정하여 이러한 모호성을 해결해야 합니다.
     * 문제의 메서드를 재정의하고 "부모" 인터페이스의 구현을 직접 호출하여 이를 수행합니다.
     * 새 구문으로 이 작업을 수행합니다.
     *
     * ParentInterfaceName.super.methodName();
     */
    @Override
    public void defaultMethod() {
        test.super.defaultMethod();
    }

    /**
     * 인터페이스의 디폴트 메서드와 구현 클래스 메서드 간의 중복이 발생할 경우 인터페이스의 디폴트 메서드가 무시된다.
     */
    public void abc() {
        System.out.println(1);
    }
}

// jdk 1.8 부터 인터페이스도 static 메서드와 default 메서드를 지원한다. (접근제어자는 public 이어야 하며 생략 가능하다.)
interface test {
    final int abc = 12;

    void next();

    static void staticMethod() {

    }

    // 디폴트 메서드는 추가하더라도 기존에 해당 인터페이스를 구현하고있는 구현체에서 따로 변경할 필요가 없다.
    default void defaultMethod() {
        System.out.println(0);
    }

    default void abc() {
        System.out.println(112);
    }
}

interface test2 {
    /**
     * 여러 인터페이스의 디폴트 메서드 간의 충돌은 인터페이스를 구현한 클래스에서 적절한 메서드로 오버라이딩 하면 된다.
     */
    default void defaultMethod() {
        System.out.println(1);
    }
}