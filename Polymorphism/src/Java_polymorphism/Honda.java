package Java_polymorphism;

public class Honda extends Motorbike {
	//khai báo các thuộc tính
	private String color;
	private float speedmax;
	//contructor
	 public Honda(String color, float speedmax) {
		   
	     //khởi tạo giá trị cho các trường 
	     this.color = color;
	     this.speedmax = speedmax;
	 }
	 
	 public Honda(String name, String color, float speedmax) {
	     // Gọi tới cấu tử của class cha (Motorbike)
	     // Nhằm mục đích khởi tạo các trường trên class cha.
	     super(name);
	     // Sau đó mới tới việc khởi tạo giá trị cho các trường của nó
	     this.color = color;
	     this.speedmax = speedmax;
	 }
	@Override
	public String getMotorbikeName() {
		// TODO Auto-generated method stub
		return "Honda";
	}

}
