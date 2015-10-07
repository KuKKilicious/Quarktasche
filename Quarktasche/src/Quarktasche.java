
public class Quarktasche {

	String name;
	int length;
	int width;
	Quarktasche(){
		
	}

	Quarktasche(String name){
		setName(name);
	}
	Quarktasche(String name, int length, int witdth){
		setName(name);
		setLength(length);
		setWidth(witdth);
		
	}
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
	
	public int getLength() {
		return length;
	}

	public void setLength(int length) {
		this.length = length;
	}

	public int getWidth() {
		return width;
	}

	public void setWidth(int width) {
		this.width = width;
	}

	@Override
	public String toString(){
	return this.getName();	
	}
}
