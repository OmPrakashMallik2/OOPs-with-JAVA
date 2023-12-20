package EH1;

public class TryCatch5 {
    public static void main(String[] args) {
        System.out.println(1);
        System.out.println(2);

        try {
            int arr[] = {1,2,3,4,5};
            System.out.println(arr[6]);
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println(e);
        }

        System.out.println(4);
        System.out.println(5);
    }
}
