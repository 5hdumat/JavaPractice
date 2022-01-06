package inheritance;

/**
 * 클래스의 상속관계와 포함관계는 어떻게 구분할까?
 * <p>
 * 원을 나타내는 Circle 과 점을 나타내는 Point 클래스가 있을 때
 * <p>
 * ~는 ~이다. (상속 사용) -> Circle 은 Point 이다?
 * ~는 ~을 가지고 있다. (포함관계 사용)  -> Circle 은 Point 를 가지고 있다.
 */
public class Inheritance {
    public static void main(String[] args) {
        Point[] p = {
                new Point(100, 100),
                new Point(200, 200),
                new Point(300, 300)
        };

        Triangle triangle = new Triangle(p);
        Circle circle = new Circle(new Point(150, 150), 50);

        triangle.draw();
        circle.draw();

        System.out.println(circle);
    }
}

class Shape {
    String color = "black";

    void draw() {
        System.out.printf("color = %s", color);
    }
}

class Point {
    int x;
    int y;

    Point(int x, int y) {
        this.x = x;
        this.y = y;
    }

    Point() {
        this(0, 0);
    }

    String getXY() {
        return "(" + x + "," + y + ")";
    }
}

class Circle extends Shape {
    Point center;
    int r;

    Circle() {
        this(new Point(0, 0), 100);
    }

    Circle(Point center, int r) {
        this.center = center;
        this.r = r;
    }

    @Override
    void draw() {
        System.out.println(center.x + " / " + center.y + " / " + r + "/" + color);
    }
}

class Triangle extends Shape {
    Point[] p = new Point[3];

    Triangle(Point[] p) {
        this.p = p;
    }

    @Override
    void draw() {
        System.out.println(p[0].getXY() + " / " + p[1].getXY() + " / " + p[2].getXY() + " / " + color);
    }
}