package select;

import java.lang.reflect.Field;
import java.lang.reflect.Method;

public class ClassforNameTest {
    public static void main(String[] args) throws Exception {
        // java.lang.Math 클래스 속성들의 이름을 갖고 온다
        Class cl = Class.forName("java.lang.Math");

        // 선언된 필드들의 이름을 저장 및 출력
        Field[] fields = cl.getDeclaredFields();
        for (Field f : fields) {
            System.out.println("field: " + f.getName());
        }

        // 선언된 메소드들의 이름을 저장 및 출력
        Method[] methods = cl.getDeclaredMethods();
        for (Method m : methods) {
            System.out.println("method: " + m.getName());
        }
    }
}
