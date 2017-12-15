
public class Plane {
	private String production, model, maximum;
	private static int planes = 0;
	
	public String getProduction(){ return production; }
	public void setProduction(String p){ production = p; }
	public String getModel(){ return model; }
	public void setModel(String mo){ model = mo; } 
	public String getMaximum(){ return maximum; }
	public void setMaximum(String ma){ maximum = ma; }
	
	public Plane(){
		production = "보잉";
		model = "1호";
		maximum = "500명";
		planes++;
	}
	public Plane(String production, String model, String maximum){
		setPlane(production, model, maximum);
		planes++;
	}
	public Plane(String maximum){
		setPlane("보잉", "3호", maximum);
		planes++;
	}
	private void setPlane(String production, String model, String maximum) {
		this.production = production;
		this.model = model;
		this.maximum = maximum;
	}
	public static int getPlanes(){
		return planes;
	}
	public void print(){
		System.out.println("비행기 정보 : " + production + ", " + model + ", " + maximum);
	}
}	