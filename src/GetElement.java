import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class GetElement {
    public static void main(String[] args) {
        List list = new ArrayList();
        list.add("hello");
        list.add("freeCodeCamp");
        list.add("freeCodeCamp");
        list.get(1);

        list.remove("freeCodeCamp");
        System.out.println(list);
    }
}
