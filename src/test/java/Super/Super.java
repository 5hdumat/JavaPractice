package Super;

public class Super {
    public static void main(String[] args) {
        Point3D point3D = new Point3D();
    }
}

class Point {
    int x, y;

//    Point(int x, int y) {
//        this.x = x;
//        this.y = y;
//    }

    String getLocation() {
        return "x :" + x + ", y :" + y;
    }
}

class Point3D extends Point {
    int z;

    /**
     * 컴파일러가 자동적으로 생성자의 첫 줄에 super();를 넣어준다.
     * 하지만 Point 클래스에는 기본 생성자가 정의되어 있지 않으므로 오류가 발생한다.
     * Point 클래스에 아무런 생성자가 정의되어 있지 않다면, 기본 생성자는 컴파일러가 자동으로 넣어주지만 그게 아니라면
     * 개발자가 직접 Point3D 생성자의 첫줄에 super();를 넣어주거나 Point 클래스에 기본 생성자를 작성해주어야 한다.
     * @return
     */
    //    Point3D(int x, int y, int z) {
//        this.x = x;
//        this.y = y;
//        this.z = z;
//    }

    String getLocation() {
        System.out.println();
        return "x :" + x + ", y :" + y + ", z :" + z;
    }
}
