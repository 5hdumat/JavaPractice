package polymorphism;

public class Polymorphism {
    public static void main(String[] args) {
        /**
         * 자식 인스턴스가 부모 타입의 클래스를 사용하는 것은 기본형 변수와 마찬가지로 캐스팅을 생략해도 된다. (float 타입으로 int 값을 사용할 수 있듯이)
         */

        Tv captionTv = new CaptionTv();

        /**
         * 자식 타입으로 부모 타입의 인스턴스를 사용하려면 '다운 캐스팅'해야한다.
         * 단, 두 클래스가 자식과 부모관계(상속) 관계에 있어야 한다.
         *
         * 타입간의 캐스팅은 양방향으로 자유롭게 사용할 수 있으나,
         * 참조 변수가 가리키고 있는 인스턴스의 자손타입으로의 다운 캐스팅은 불가능하다.
         */
        Tv castingTv = null;
        CaptionTv a = (CaptionTv) castingTv;


        // 참조 변수가 가리키고 있는 인스턴스의 자손타입으로의 다운 캐스팅은 불가능하다.
        // Tv castingTv = new Tv();
        // CaptionTv a = (CaptionTv) captionTv; 오류!


        /**
         * instanceof
         * 참조 변수가 참조하고있는 인스턴스의 실제 타입을 알아볼 수 있다.
         */
        Tv caption = new CaptionTv();
        Tv caption2 = new CaptionTv2();
        Tv tv = new Tv();
        System.out.println(caption instanceof Tv); // true
        System.out.println(caption2 instanceof CaptionTv); // false
        System.out.println(caption2 instanceof Object); // true
        System.out.println(tv instanceof CaptionTv); // false
    }
}

class Tv {

}

class CaptionTv extends Tv {

}

class CaptionTv2 extends Tv {

}