package constructorChaining;

public class ConstChain {
	ConstChain(int age){
		System.out.println("Age:"+age);
	}
	ConstChain(String name){
		this(22);
		System.out.println("Name:"+name);
	}
	ConstChain(String name,int age){
		this("mr");
		System.out.println("Name is:"+name+" Age:"+age);
	}
	public static void main(String args[]) {
		new ConstChain("Lohith",22);
	}
}
