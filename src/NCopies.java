import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class NCopies {
    public static void main(String[] args) {
        List<String> list = Collections.nCopies(10, "HELLO");
        System.out.println(list);
    }
}
