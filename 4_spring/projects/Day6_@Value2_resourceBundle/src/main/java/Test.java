import com.dto.Student;
import org.springframework.context.support.GenericXmlApplicationContext;

public class Test {

    public static void main(String[] args) {

        GenericXmlApplicationContext ctx = new GenericXmlApplicationContext("stu.xml");

        Student student = ctx.getBean("student", Student.class);
        System.out.println(student.getName());
        System.out.println(student.getAge());
    }

}
