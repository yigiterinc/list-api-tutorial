import java.util.ArrayList;
import java.util.List;

public class ToArray {
    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>(List.of(1, 2));
        Integer[] toArray = list.toArray(new Integer[0]);
    }
}
