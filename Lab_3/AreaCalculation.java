package Lab_3;
class Rectangle {
    int length, width;

    Rectangle(int x, int y) {
        length = x;
        width = y;
    }

    void areaOfRectangle() {
        int area = length * width;
        System.out.println("Area of Rectangle: " + area);
    }
}

class Triangle extends Rectangle {
    Triangle(int x, int y) {
        super(x, y);
    }

    void areaOfTriangle() {
        int area = (length * width) / 2;
        System.out.println("Area of Triangle: " + area);
    }
}

public class AreaCalculation {
    public static void main(String[] args) {
        Rectangle rect = new Rectangle(5, 4);
        rect.areaOfRectangle();

        Triangle tri = new Triangle(4, 6);
        tri.areaOfTriangle();
    }
}
