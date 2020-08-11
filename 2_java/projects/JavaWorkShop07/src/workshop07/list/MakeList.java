package workshop07.list;

import java.util.ArrayList;

public class MakeList {
    private ArrayList<Integer> list;

    public MakeList() {
        list = new ArrayList<>();
    }

    public void makeArrayList(int size) {
        for (int i = 0; i < size; i++) {
            list.add((int)(Math.random() * 10) + 10);
        }
    }

    public double getAverage() {
        int sum = 0;
        for (int i : list) {
            sum += i;
        }

        return (double)sum / list.size();
    }

    public ArrayList<Integer> getList() {
        return list;
    }
}
