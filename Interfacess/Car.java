// package Interfacess;

public class Car implements Engine, Brake, Media {

    @Override
    public void brake() {
        System.out.println("I do break like a normal car.");
    }

    @Override
    public void start() {
        System.out.println("I do start engine like a normal car.");
    }

    @Override
    public void stop() {
        System.out.println("I do stop  enginelike a normal car.");
    }

    @Override
    public void acc() {
        System.out.println("I do accelerate like a normal car.");
    }
}
