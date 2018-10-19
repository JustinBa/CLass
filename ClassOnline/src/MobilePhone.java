
public class MobilePhone {

	private String Manufacture;
	private String Model;
	private double price;
	private String carrier;
	
	public MobilePhone(String Manufacture, String Model, double price, String carrier) {
		this.Manufacture = Manufacture;
		this.Model = Model;
		this.price = price;
		this.carrier = carrier;
		
	}
	
	
	public String call(String phone_number) {
		String supstr = "I am calling " + phone_number;
		return supstr;
	}
	
	public String text(String text) {
		return text;
	}
	
	public String toString() {
		String to = "Manufacturer: " + Manufacture + "\nModel: " + Model + "\nPrice: " + price + "\nCarrier: " + carrier;
		return to;
	}
	

}
