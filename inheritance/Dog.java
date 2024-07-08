package inheritance;

 class Animal {
	
	public void eat() {
		System.out.println("eat");
	}

}
class Dog extends Animal{
	public static void main(String args[]) {
		Dog an=new Dog();
		an.eat();
		an.bark();
		
	}
	public void bark() {
		System.out.println("barks");
	}
}
