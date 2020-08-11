package collection;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class Ex10_6 {
    public static void main(String[] args) {
        Set<String> s = new HashSet<>();
        s.add("홍길동");
        s.add("이순신");
        s.add("유관순");

        // 순서가 없는 Set 계열이기 때문에 중복 저장되지 않음
        s.add("홍길동");
        s.add("홍길동");

        System.out.println("toString() 전체 출력: " + s);

        for (String data : s) {
            System.out.println("forEach 전체 출력: " + data);
        }

        System.out.println("Set의 데이터 갯수: " + s.size());
        System.out.println("Is Set empty? " + s.isEmpty());
        System.out.println("Is Set including 이순신? " + s.contains("이순신"));
        System.out.println("이순신 삭제");
        s.remove("이순신");

        Object[] objArr = s.toArray();
        for (Object o : objArr) {
            System.out.println(o);
        }

        for (String data : s) {
            System.out.println("forEach 전체 출력: " + data);
        }

        Iterator<String> ite = s.iterator();
        while (ite.hasNext()) {
            String data = ite.next();
            System.out.println(data);
        }

        System.out.println("전체 삭제");
        s.clear();
        System.out.println("toString() 전체 출력: " + s);
    }
}
