
public class Quarktasche {

	String name;
	int length;
	int momy;
	int width;
	String taste;
	Quarktasche(){
		
	}

	Quarktasche(String name){
		setName(name);
	}
	Quarktasche(String name, int length, int witdth, String taste){
		setName(name);
		setLength(length);
		setWidth(witdth);
		setTaste(taste);
		
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
	
	public void setTaste(String taste){
		this.taste = taste;
	}
	
	public String getTaste(){
		return taste;
	}

	@Override
	public String toString(){
	return this.getName();	
	}
}
