package inheritance;
class Cs{
	public void stu(){
	System.out.print("60 students");
}
}
 class Ec extends Cs{
	public void estu() {
		System.out.println("65 students in ec \n cs students are");
	}
}
 class Student extends Ec {
	 public static void main(String args[]) {
		 Student s=new Student();
		 s.estu();
		 s.stu();
		 
	 }
	
}
