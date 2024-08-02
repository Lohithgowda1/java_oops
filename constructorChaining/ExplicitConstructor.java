package constructorChaining;

public class ExplicitConstructor {
	public static void main(String[] args) {
		new Birds("Peacock");	
	}
}
class Animal{
	Animal(String name){
		System.out.println("Animal name: "+name);
	}
}
class Birds extends Animal{
	Birds(String bird){
		super("Dog");
		System.out.println("Bird name: "+bird);
	}
}