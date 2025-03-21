package OOps;

class Data{
	//getter and setter
	
	private String name;
	public String getName() {        //getter
		return name;
	}
	
	public void setName(String name) {       
		if(name!=null && !name.isEmpty()) {
			this.name=name;
		}else {
			System.out.println("Invalid name");
		}
	}

}
public class Encapsulation {
public static void main(String[] args) {
	Data d1=new Data();
	d1.setName("Sowmeha");
	System.out.println("Student name:"+d1.getName());
}
	
}
