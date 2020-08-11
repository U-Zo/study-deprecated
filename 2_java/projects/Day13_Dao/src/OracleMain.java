import com.service.OracleService;

import java.util.Set;

public class OracleMain {
    public static void main(String[] args) {
        OracleService service = new OracleService();
        Set<?> hashSet = service.select();
        System.out.println(hashSet);
        for (Object p : hashSet) {
            System.out.println(p);
        }
    }
}
