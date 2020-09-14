import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class AsList {
    public static void main(String[] args) {
        List<String> list = Arrays.asList(
                                "freeCodeCamp",
                                "let's",
                                "create");

        final List<String> list2 = new ArrayList<>();
        list2.add("erinc.io is the best blog ever!");
        System.out.println(list2);
        System.out.println(list);
        ArrayList<String> friends =  new ArrayList<>(List.of("Gulbike", "Sinem", "Mete"));
    }
}
