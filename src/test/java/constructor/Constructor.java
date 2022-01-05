package constructor;

class Car {
    String color;
    int size;

    /**
     * 매개변수와 초기화 해야하는 인스턴스 변수의 이름이 같다면 인스턴스 변수 앞에 this를 붙여주자.
     * this는 인스턴스 자기 자신을 가리킨다.
     *
     * @param color
     * @param size
     */
    Car(String color, int size) {
        this.color = color;
        this.size = size;
    }

    Car(String color) {
        this(color, 20);
    }

    Car(Car car) {
        this(car.color, car.size);
    }



    public int getSize() {
        return size;
    }

    /**
     * static 메서드(클래스 메서드)에서는 인스턴스 자기 자신을 가리키는 참조변수 this로 인스턴스 멤버에 접근할 수 없다.
     * 이유는 static에서 인스턴스에 접근할 수 없는 이유와 동일하다. (static이 메모리에 올라가있다고해서 인스턴스가 힙메모리에 적재되어있는 것은 아니므로)
     */
    //    static int test() {
    //        return this.size;
    //    }
}

public class Constructor {
    public static void main(String[] args) {
        Car bbb = new Car("가나다");

        // 인스턴스 복사 생성자(두 인스턴스의 상태는 같지만, 할당된 메모리는 다르다.)
        Car ccc = new Car(bbb);

        System.out.println(bbb.getSize());
        System.out.println(ccc.getSize());
    }

}
