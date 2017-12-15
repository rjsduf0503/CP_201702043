package computer_programing_09;
public class CustomerTest {
	public static void main(String[] args) {
		Customer c = new Customer();
		c.setName("유건열");
		c.setAddress("충청남도 천안시 백석동");
		c.setPhone("010-5019-xxxx");
		c.setCusnum(1);
		c.setMileage(1000);
		
		c.print();
	}

}
