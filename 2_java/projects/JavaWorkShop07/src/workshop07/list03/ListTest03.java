package workshop07.list03;

import java.util.ArrayList;

public class ListTest03 {
    public static void main(String[] args) {
        ArrayList<Integer> list1 = new ArrayList<>();
        ArrayList<Integer> list2 = new ArrayList<>();

        RandomService randomService = new RandomService();
        randomService.makeRandomInt(list1);
        randomService.makeRandomInt(list2);
        randomService.printArrayList(list1, list2);
    }
}
