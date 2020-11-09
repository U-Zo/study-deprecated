import lombok.Data;
import org.springframework.stereotype.Component;



public class TestDTO {
    int num;
    String username;
    String address;

    public TestDTO() {
    }

    public TestDTO(int num, String username, String address) {
        this.num = num;
        this.username = username;
        this.address = address;
    }

    public int getNum() {
        return num;
    }

    public void setNum(int num) {
        this.num = num;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    @Override
    public String toString() {
        return "TestDTO{" +
                "num=" + num +
                ", username='" + username + '\'' +
                ", address='" + address + '\'' +
                '}';
    }
}
