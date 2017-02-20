package Java_polymorphism;

public class Demo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Honda honda=new Honda("SH","pink",150);
		Honda honda2=new AsianHonda("SH150","green",160);
		
		System.out.println("Motorbike name of honda: "+ honda.getMotorbikeName());
		System.out.println("Motorbike name of honda2: "+ honda2.getMotorbikeName());
		
		
	}

}
