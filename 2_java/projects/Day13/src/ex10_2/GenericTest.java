package ex10_2;

import java.util.Date;

class Box {
    Object obj;

    public Object getObj() {
        return obj;
    }

    public void setObj(Object obj) {
        this.obj = obj;
    }
}

public class GenericTest {
    public static void main(String[] args) {
        Box b = new Box();
        b.setObj("Hello");
        String str = (String)b.getObj();
        System.out.println(str);

        Box b2 = new Box();
        b2.setObj(new Date());
        Date d = (Date)b2.getObj();
        System.out.println(d);
    }
}
