package generic;

class Pet {
}

class Cat extends Pet {
}

class Dog extends Pet {
}

class Box2<T extends Pet> {
    T obj;

    public T getObj() {
        return obj;
    }

    public void setObj(T obj) {
        this.obj = obj;
    }
}

public class Ex10_3 {
    public static void main(String[] args) {
        Box2<Pet> b = new Box2<>();
        Box2<Cat> b2 = new Box2<>();
        Box2<Dog> b3 = new Box2<>();

        // Box2<Object> b4 = new Box2<>(); error occur because T extends Pet
    }
}
