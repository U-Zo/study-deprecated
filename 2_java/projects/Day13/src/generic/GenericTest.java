package generic;

import java.util.ArrayList;
import java.util.Date;

class Box<T> {
    T obj;

    public T getObj() {
        return obj;
    }

    public void setObj(T obj) {
        this.obj = obj;
    }
}

public class GenericTest {
    public static void main(String[] args) {
        Box<String> b = new Box<>();
        b.setObj("Hello");
        String str = b.getObj();
        System.out.println(str);
        // b.setObj(new Date()); 오류 발생

        Box<Date> b2 = new Box<>();
        b2.setObj(new Date());
        Date d = b2.getObj();
        System.out.println(d);
        // b2.setObj("오류 예정");

        Box<Integer> b3 = new Box<>();
        b3.setObj(100);
        // b3.setObj("100"); 오류 발생
        int n = b3.getObj();
        System.out.println(n);
    }
}
