package polymorphisam;
class Father{
	void age(){
		int age=55;
		System.out.println(age);
	}
}
class Son extends Father{
	void age() {
		int age=22;
		System.out.println(age);
	}
	
}

public class Generalization {// for one reference multiple objects
	public static void main(String args[]) {
		Father f=new Father();
		f.age();
		f=new Son();
		
		f.age();
		
	}

}
