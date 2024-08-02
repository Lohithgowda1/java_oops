package abstraction;

public class SingleTonClass {
	public static void main(String[] args) {
		Account.objCreate();
		Account.objCreate();
	}
}
class Account{
	private static Account ac;
	private Account() {
		System.out.println("Object created");
	}
	
	public static Account objCreate() {
		if(ac == null) {
			return ac = new Account();
		} else {
			System.out.println("Object already exist");
		}
		return ac;
	}
}
