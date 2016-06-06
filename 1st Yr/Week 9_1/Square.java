public class Square{
	private int length;
	public Square(){
		length = 1;
	}
	public Square(int a){
		this.length = a;
	}
	public int getLength(){
		return this.length;
	}
	public void setLength(int a){
		this.length = a;
	}
	public int area(){
		return getLength()*getLength();
	}
}