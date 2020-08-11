package arrayList;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;

public class Ex10_7 {
    public static void main(String[] args) {
        List<String> list = new ArrayList<>();
        list.add("홍길동");
        list.add("이순신");
        list.add("유관순");
        list.add("홍길동");
        list.add("홍길동");

        System.out.println("0 위치값 출력: " + list.get(0));
        System.out.println("toString() 출력: " + list);

        for (String s : list) {
            System.out.println("forEach 출력: " + s);
        }

        Iterator<String> ite = list.iterator();
        while (ite.hasNext()) {
            System.out.println(ite.next());
        }

        System.out.println("Set의 갯수: " + list.size());
        System.out.println("Is Set empty? " + list.isEmpty());
        System.out.println("이순신 포함 여부: " + list.contains("이순신"));
        System.out.println("이순신의 위치: " + list.indexOf("이순신"));

        System.out.println(list);
        List<String> sub = list.subList(0, 3);
        System.out.println("sub >> " + sub);

        Object[] arr = list.toArray();
        System.out.println("배열 변환 후 출력: " + Arrays.toString(arr));
        System.out.println("전체 삭제");
        list.clear();
        System.out.println("전체 출력: " + list);
    }
}
