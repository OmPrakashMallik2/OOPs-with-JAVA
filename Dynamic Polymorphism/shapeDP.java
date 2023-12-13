class Shape {
    void draw() {
        System.out.println("Shape");
    }
}

class Circle extends Shape {
    void draw() {
        System.out.println("circle");
    }
}

class Triangle extends Shape {
    void draw() {
        System.out.println("Triangle");
    }
}

class Square extends Shape {
    void draw() {
        System.out.println("Square");
    }
}

class Rectangle extends Shape {
    void draw() {
        System.out.println("Rectagle");
    }
}

public class shapeDP {
    public static void main(String[] args) {
        System.out.println("shape example");

        Shape s;

        s = new Shape();
        s.draw();
        s = new Circle();
        s.draw();
        s = new Triangle();
        s.draw();
        s = new Square();
        s.draw();
        s = new Rectangle();
        s.draw();
    }
}
