import com.dto.ListStudent;
import com.dto.Student;
import org.springframework.context.support.GenericXmlApplicationContext;

import java.util.List;

public class Test {

    public static void main(String[] args) {

        GenericXmlApplicationContext ctx = new GenericXmlApplicationContext("stu.xml");

        ListStudent listStudent = ctx.getBean("list", ListStudent.class);
        ListStudent listStudent2 = ctx.getBean("list2", ListStudent.class);

        List<Student> list = listStudent.getList();
        List<Student> list2 = listStudent2.getList();

        for (Student s : list) {
            System.out.println(s);
        }

        for (Student s : list2) {
            System.out.println(s);
        }
    }

}
