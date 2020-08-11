package workshop07.list03;

import java.util.ArrayList;

public class RandomService {
    public void printArrayList(ArrayList<Integer> list1, ArrayList<Integer> list2) {
        for (int i = 0; i < list1.size(); i++) {
            int a = list1.get(i);
            int b = list2.get(i);
            try {
                System.out.print(a + " / " + b);
                if (b == 0)
                    throw new ArithmeticException(" 분모가 0입니다.");
                System.out.print(" " + a / b);
            } catch (ArithmeticException e) {
                System.out.print(e.getMessage());
            }
            System.out.println();
        }
    }

    public void makeRandomInt(ArrayList<Integer> list) {
        list.clear();

        for (int i = 0; i < 10; i++) {
            list.add((int) (Math.random() * 10));
        }
    }
}
