import java.util.ArrayList;
import java.util.List;

public class DuplicateAndRemoveCode {

    public static void main(String[] args) {
        List<String> list = new ArrayList<>();

        list.add("One");
        list.add("Two");
        list.add("Three");
        list.add("Four");
        list.add("Five");

        list.add("Copy this line, please");


        for (String s : list) {
            System.out.println(s);
        }
    }
}
