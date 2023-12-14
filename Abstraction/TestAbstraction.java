abstract class Shape {
    abstract void draw();
}

class Triangle extends Shape {
    void draw() {
        System.out.println("Triangle is drown");
    }
}

class Cirlce extends Shape {
    void draw() {
        System.out.println("Cirlce is drown");
    }
}

public class TestAbstraction {
    public static void main(String[] args) {
        Shape c1 = new Cirlce();
        c1.draw();
        
        Shape t1 = new Triangle();
        t1.draw();
    }
}
