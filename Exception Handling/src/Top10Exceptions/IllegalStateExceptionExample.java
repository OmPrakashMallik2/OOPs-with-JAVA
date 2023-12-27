package Top10Exceptions;

import java.util.ArrayList;
import java.util.Iterator;

public class IllegalStateExceptionExample {
    public static void main(String[] args) {
        System.out.println("IllegalStateException Example");
        ArrayList<String> arrayList = new ArrayList<>();
        arrayList.add("one");
        arrayList.add("two");
        arrayList.add("three");
        arrayList.add("four");
        arrayList.add("five");
        System.out.println(arrayList);

        Iterator<String> itr = arrayList.iterator();
        while (itr.hasNext()){
//            Object obj = itr.next();
            itr.remove();
        }

        System.out.println(arrayList);
    }
}
