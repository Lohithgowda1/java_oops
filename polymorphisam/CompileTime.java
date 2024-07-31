package polymorphisam;

public class CompileTime {
	public void add(int a,int b){
		int sum=a+b;
		System.out.println(sum);
		
	}
	public void add(double A,double B){
		double sub=A+B;
		System.out.println(sub);
	}
 public static void main(String args[]) {
	CompileTime a=new CompileTime();
	a.add(4,5);
	a.add(4.2, 2.2);
 }
}
