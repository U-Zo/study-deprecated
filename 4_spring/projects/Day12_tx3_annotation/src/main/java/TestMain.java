import com.entity.OrderDTO;
import com.entity.ProductDTO;
import com.service.ProductService;
import org.springframework.context.support.GenericXmlApplicationContext;

import java.util.List;

public class TestMain {
    public static void main(String[] args) {

        GenericXmlApplicationContext ctx =
                new GenericXmlApplicationContext("dept.xml");

        ProductService service = ctx.getBean("deptService", ProductService.class);

        List<ProductDTO> list = service.selectProduct();
        for (ProductDTO dto : list) {
            System.out.println(dto);
        }

        List<OrderDTO> list2 = service.selectOrder();
        for (OrderDTO dto : list2) {
            System.out.println(dto);
        }
        
        // 상품 주문
        System.out.println("p01 상품 5개 주문합니다.");
        try {
            service.addOrder("p01", 5);
        } catch (Exception e) {
            System.out.println("에러가 발생하여 롤백 처리");
        }

        list = service.selectProduct();
        for (ProductDTO dto : list) {
            System.out.println(dto);
        }

        list2 = service.selectOrder();
        for (OrderDTO dto : list2) {
            System.out.println(dto);
        }
    }
}
