package basicjavaprogramm;

public class This {
	int usn;
	String name;
	public This setUsn(int usn){
		this.usn=usn;
		return this;
	}
	public This setName(String name){
		this.name=name;
		return this;
	}
	public void display() {
		System.out.println("the details are\nUSN:"+usn+"\nName:"+name+"\n");
	}
	public static void main(String args[]) {
		This th=new This();
		th.setUsn(21).setName("mr gowda").display();
		
	}
}
