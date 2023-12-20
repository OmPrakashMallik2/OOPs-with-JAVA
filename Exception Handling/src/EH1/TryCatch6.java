package EH1;
import java.io.FileNotFoundException;
import java.io.PrintWriter;

public class TryCatch6 {
    public static void main(String[] args) {
        PrintWriter pw;
        try{
            pw = new PrintWriter("hello.txt");
            pw.println("saved");
        } catch (FileNotFoundException s){
            System.out.println(s);
        }
        System.out.println("File saved successfully");
    }
}