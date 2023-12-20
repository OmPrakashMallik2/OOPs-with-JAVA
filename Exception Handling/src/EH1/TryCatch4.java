package EH1;

public class TryCatch4 {
    public static void main(String[] args) {
        int arr[] = new int[5];

        try {
            arr[8] = 20;
        } catch (Exception s){
            System.out.println(s);
        }
    }
}

