package constructorarray;

public class Stuoverload {
	Stuoverload(int Usn){
		System.out.println(Usn);
	}
	Stuoverload(String name){
		System.out.println(name);
	}
	public static void main(String args[]) {
		new Stuoverload(21);
		new Stuoverload("lohith");
	}

}
