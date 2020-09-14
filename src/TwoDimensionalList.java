import java.util.ArrayList;

public class TwoDimensionalList {
    public static void main(String[] args) {
        ArrayList<ArrayList<Integer>> listOfLists = new ArrayList<>();
        System.out.println(listOfLists);
        int numberOfLists = 3;
        for (int i = 0; i < numberOfLists; i++) {
            listOfLists.add(new ArrayList<>());
        }

        System.out.println(listOfLists);

        listOfLists.get(0).add(1);
        listOfLists.get(1).add(2);
        listOfLists.get(2).add(0,3);

        System.out.println(listOfLists);

        /*
        for (ArrayList<Integer> list : listOfLists) {
            for (Integer el : list)
                System.out.printf("%s ", el);
        }
        */
    }
}
