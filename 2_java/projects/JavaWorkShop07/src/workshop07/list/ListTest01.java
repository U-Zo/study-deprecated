package workshop07.list;

import java.util.ArrayList;

public class ListTest01 {
    public static void main(String[] args) {
        MakeList makeList = new MakeList();
        makeList.makeArrayList(10);
        ArrayList<Integer> list = makeList.getList();
        System.out.println(list);
        System.out.println("평균: " + makeList.getAverage());
    }
}
