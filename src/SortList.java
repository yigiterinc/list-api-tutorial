import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class SortList {
    public static void main(String[] args) {
        List<Integer> toBeSorted = new ArrayList<>(List.of(3,2,4,1,-2));
        Collections.sort(toBeSorted);
        System.out.println(toBeSorted);
    }
}
