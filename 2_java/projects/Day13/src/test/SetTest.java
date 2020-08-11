package test;

import java.util.Set;

public class SetTest {
    public static void main(String[] args) {
        SetService setService = new SetService();
        setService.addPersonSet(new Person("김우조", 27, "인천"));
        setService.addPersonSet(new Person("김일출", 27, "인천"));
        setService.addPersonSet(new Person("박일출", 27, "인천"));
        setService.printPerson(setService.getPersonSet());
    }
}
