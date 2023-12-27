package Examples2;

import java.util.ArrayList;
import java.util.Arrays;

public class HeterogeneousCollectionExample {
    public static void main(String[] args) {
        Object[] heterogeneousArray = { "String Element", 42, 3.14, true, new MyClass() };
        System.out.println(Arrays.toString(heterogeneousArray));

        ArrayList<Object> arrayList = new ArrayList<>();
        arrayList.add("OPM");
        arrayList.add(23);
        arrayList.add(true);
        arrayList.add(50000.99);
        System.out.println(arrayList);
    }
}

class MyClass{

}
