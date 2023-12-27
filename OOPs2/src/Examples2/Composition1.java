package Examples2;

class Engine {
    public void start(){
        System.out.println("Engine started");
    }

    public void stop(){
        System.out.println("Engine stopped");
    }
    public void stop(String a){
        System.out.println("Engine stopped");
    }
}

class Car extends Engine{
    Engine engine;
    Car (){
        engine = new Engine();
    }

    public void startCar(){
        engine.start();
    }

    public void stopCar(){
        engine.stop();
    }
    @Override
    public void stop(){
        engine.stop();
    }
}

public class Composition1 {
    public static void main(String[] args) {
        Car car = new Car();
        car.startCar();
    }
}
