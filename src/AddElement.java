import java.util.ArrayList;

public class AddElement {
    public static void main(String[] args) {
        ArrayList<String> list = new ArrayList<>();
        list.add("hello");
        list.add(1, "world");
        System.out.println(list);

        list.set(1, "from the otherside");
        System.out.println(list);
    }
}
