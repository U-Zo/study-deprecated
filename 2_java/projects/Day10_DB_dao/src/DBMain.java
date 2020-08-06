import com.dao.MySQLDAO;
import com.dao.OracleDAO;
import com.service.DBService;


public class DBMain {

	public static void main(String[] args) {
		DBService service = DBService.getDBService();

		service.setDAO(new MySQLDAO());
		// MySQL 접속을 위해 객체 생성 후 service에 넘김
		service.insert();
		DBService service2 = DBService.getDBService();
		DBService service3 = DBService.getDBService();

		System.out.println(service2);
		System.out.println(service3);

		service.setDAO(new OracleDAO());
		// Oracle 접속을 위해 객체 생성 후 service에 넘김
		service.insert();
	}

}
