import java.util.ArrayList;
import java.util.List;

public class Clone {
    public static void main(String[] args) {
        ArrayList<String> list1 = new ArrayList<>();
        list1.add("Hello");
        List list2 = list1;
        list2.add(" World");

        System.out.println(list1);
        System.out.println(list2);

        ArrayList list3 = (ArrayList) list1.clone();
        list3.add(" Of Java");

        System.out.println(list1);
        System.out.println(list3);
    }
}
