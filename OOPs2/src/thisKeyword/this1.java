package thisKeyword;

public class this1 {

    int x;
    this1(){
        this(10);
    }

    this1(int x){
        this.x = x;
    }
    void m2(){
        this.myMethod();
    }
    void myMethod(){

    }
    public static void main(String[] args) {
        System.out.println("this keyword.");
    }
}
