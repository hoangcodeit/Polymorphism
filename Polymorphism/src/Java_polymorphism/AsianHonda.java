package Java_polymorphism;

public class AsianHonda extends Honda {

	public AsianHonda(String name, String color, float speedmax) {
		super(name, color, speedmax);
		// TODO Auto-generated constructor stub
	}
	  // Ghi đè method của class cha (Honda)
	  @Override
	  public String getMotorbikeName() {
	      return "Asian Honda";
	  }
	

}