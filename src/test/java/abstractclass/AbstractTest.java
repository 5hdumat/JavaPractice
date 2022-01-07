package abstractclass;

/**
 * 추상 클래스
 *
 * 여러 클래스에 공통적으로 사용될 수 있는 클래스를 바로 작성하기도 하고,
 * 기존의 공통적인 부분을 뽑아서 추상클래스로 만들어 상속하도록 하는 경우도 있다.
 *
 **/
public class AbstractTest {
    public static void main(String[] args) {

    }
}

abstract class Player {
    abstract void play(int pos);
    abstract void stop();
}

class AudioPlayer extends Player {

    @Override
    void play(int pos) {

    }

    @Override
    void stop() {

    }
}