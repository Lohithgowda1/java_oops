package javalibraries;

public class Equals {
	String a="mr gowda";
	public static void main(String[] args) {
		Equals e1=new Equals();
		Equals e2=new Equals();
		
		System.out.println(e1.equals(e2));	
		//System.out.println(e2.a);
	}
	public boolean equals(Object ob) {
		//return true;
		Equals e=(Equals) ob;
		
		//System.out.println(e.a);
		return a.equals(e.a);
	}
}
