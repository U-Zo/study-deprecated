
public class ObjectP {
	private String name;
	private String phone;
	private String addr;

	public void setName(String name) {
		this.name = name;
	}


	public void setPhone(String phone) {
		this.phone = phone;
	}

	public void setAddr(String addr) {
		this.addr = addr;
	}
	
	public void printInfo() {
		System.out.println(name + ", " + phone + ", " + addr);
	}

	public static void main(String[] args) {
		ObjectP obj1 = new ObjectP();
		obj1.setName("우조");
		obj1.setPhone("01083887932");
		obj1.setAddr("인천");
		
		ObjectP obj2 = new ObjectP();
		obj2.setName("바보");
		obj2.setPhone("01012347932");
		obj2.setAddr("서울");
		
		obj1.printInfo();
		obj2.printInfo();
	}

}
