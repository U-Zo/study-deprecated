package generic;

class Group<T> {
    T obj;

    public T getObj() {
        return obj;
    }

    public void setObj(T obj) {
        this.obj = obj;
    }
}

class Person {}
class Man extends Person {}
class Woman extends Person {}

public class ex10_5 {
    public static void method(Group<?> group) {}
    public static void method2(Group<? extends Person> group) {}
    public static void method3(Group<? super Person> group) {}

    public static void main(String[] args) {
        // method: 어떤 타입도 설정 가능
        method(new Group<Object>());
        method(new Group<Person>());
        method(new Group<Man>());
        method(new Group<Woman>());

        // method2: Person 또는 Person 의 자식만 가능
        // method2(new Group<Object>());
        method2(new Group<Person>());
        method2(new Group<Man>());
        method2(new Group<Woman>());

        // method3: Person 또는 Person 의 부모만 가능
        method3(new Group<Object>());
        method3(new Group<Person>());
        // method3(new Group<Man>());
        // method3(new Group<Woman>());
    }
}
