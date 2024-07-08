package inheritance;

class Car extends Vehicle {
	public static void main(String args[]) {
		Car vc=new Car();
		vc.engine();
		vc.suzuki();
	}
	public void suzuki() {
		System.out.println("swift");
	}

}
class Vehicle{
	public void engine() {
		System.out.println("toyota ");
	}
}
