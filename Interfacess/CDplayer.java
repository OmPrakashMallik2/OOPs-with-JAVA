// package Interfacess;

public class CDplayer implements Media {

    @Override
    public void start() {
        System.out.println("Start music playing");
    }

    @Override
    public void stop() {
        System.out.println("Stop music playing");
    }

}
