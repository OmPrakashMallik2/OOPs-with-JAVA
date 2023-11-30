public class StaticBlock {
    static int a =10;
    static int b;


    // will only run once when the first object is created.
    static {
        System.out.println("I am in ststic block");
        b = a + 10;
    }

    public static void main(String[] args) {
        StaticBlock obj = new StaticBlock();
        
        System.out.println(StaticBlock.a+ " "+StaticBlock.b);
        StaticBlock.b += 5;
        System.out.println(StaticBlock.a+ " "+StaticBlock.b); 
        
        StaticBlock obj2 = new StaticBlock();
        System.out.println(StaticBlock.a+ " "+StaticBlock.b);
    }

}
