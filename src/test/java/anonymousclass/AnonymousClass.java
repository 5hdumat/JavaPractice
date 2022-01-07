package anonymousclass;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

/**
 * 익명 클래스는 객체의 선언과 동시에 생성을 하기 위한 일회용 클래스이다.
 * 이름이 없기때문에 생성자도 사용 할 수 없으며 조상 클래스의 이름이나 구현에 사용하고자 하는 인터페이스의 이름을 사용해서 정의한다.
 *
 * 상속받는 동시에 인터페이스를 구현하거나, 둘 이상의 인터페이스를 구현할 수 없다.
 */
public class AnonymousClass {
    public static void main(String[] args) {
        Button b = new Button("Start");
        b.addActionListener(new ActionListener() {
                                public void actionPerformed(ActionEvent e) {
                                    System.out.println("ActionEvent");
                                }
                            }
        );
    }
}