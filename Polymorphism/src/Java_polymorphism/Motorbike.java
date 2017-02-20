package Java_polymorphism;

public abstract class Motorbike {
	//khai báo thuộc tính tên
	private String name;
	//contructor mặc định 
	 public Motorbike() {
	     // Gán tên mặc định
	     this.name = this.getMotorbikeName();
	 }
	 public Motorbike(String name) {
	     this.name = name;
	 }
	
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
	 // Trả về tên của Motorbike này.
	 // Một method trìu tượng.
	 // Nội dung cụ thể của method này được viết tại class con.
	 public abstract String getMotorbikeName();
	
}
