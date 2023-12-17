// import Interfacess.*;

public class Main {
    public static void main(String[] args) {
        Engine car = new Car();

        // car.start();
        // car.stop();
        // car.acc();
        // car.brake();
        // System.out.println(car.PRICE);

        // Media mcar = new Car();
        // mcar.stop();

        NiceCar nc = new NiceCar();
        nc.start();
        nc.startMusic();
        nc.upgradeEngine();
        nc.start();
    }
}
