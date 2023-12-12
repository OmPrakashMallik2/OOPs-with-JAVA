class Bike {
    // final void run(){
    void run(){
        System.out.println("Bike is running");
    }
}
class Hero extends Bike {
    // we cant override the final method
    void run(){ 
        System.out.println("Hero bike is running");
    }
}


public class FinalTest2 {
    public static void main(String[] args) {
        Hero h = new Hero();
        h.run();
    }
}
