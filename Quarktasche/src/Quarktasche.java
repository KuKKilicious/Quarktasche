
public class Quarktasche {

	String name;
	


	Quarktasche(String name){
		setName(name);
	}
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
	
	@Override
	public String toString(){
	return this.getName();	
	}
}
