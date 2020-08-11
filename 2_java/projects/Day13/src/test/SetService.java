package test;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class SetService {
    private Set<Person> set;

    public Set<Person> getSet() {
        return set;
    }

    public SetService() {
        set = new HashSet<Person>();
    }

    public void addPersonSet(Person person) {
        set.add(person);
    }

    public Set<Person> getPersonSet() {
        Person p = new Person("유관순", 17, "서울");
        set.add(new Person("홍길동", 20, "서울"));
        set.add(new Person("이순신", 44, "전라"));
        set.add(new Person("이순신", 44, "전라"));
        set.add(p);

        return set;
    }

    public void printPerson(Set<Person> set) {
        Iterator<Person> ite = set.iterator();
        while (ite.hasNext()) {
            System.out.println(ite.next());
        }
    }
}
