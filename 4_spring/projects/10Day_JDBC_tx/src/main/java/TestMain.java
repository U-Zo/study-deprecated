import org.springframework.context.support.GenericXmlApplicationContext;

public class TestMain {
    public static void main(String[] args) {
        TestDAO dao=new TestDAO();
        System.out.println(dao.insert(13,"김혜빈","김혜빈"));
    }
}


//sql 1, sql2 생성 -> pstmt1,pstmt2, setautocommit (false)