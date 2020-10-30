import java.util.List;

public class TestMain {

    public static void main(String[] args) {
        TestDAO dao = new TestDAO();

        List<TestDTO> list = dao.select();

        for (TestDTO dto : list) {
            System.out.println(dto);
        }

        System.out.println("============");
        TestDTO dto = dao.selectByUsername("홍길동");
        System.out.println(dto);

        System.out.println("============");
        dao.insert(10, "김우조", "인천");
    }
}
