package EH1;

public class TryCatch3 {
    public static void main(String[] args) {
        String str = "abc";

        try {
            int a = Integer.parseInt(str);
        } catch (Exception s){
            System.out.println(s);
        }
    }
}
