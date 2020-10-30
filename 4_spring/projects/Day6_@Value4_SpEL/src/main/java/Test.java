import com.dto.Student;
import org.springframework.context.support.GenericXmlApplicationContext;

public class Test {

    public static void main(String[] args) {

        GenericXmlApplicationContext ctx = new GenericXmlApplicationContext("stu.xml");

        Student student = ctx.getBean("firstStudent", Student.class);
        Student student2 = ctx.getBean("stu", Student.class);

        System.out.println(student);
        System.out.println(student2);
    }

}
