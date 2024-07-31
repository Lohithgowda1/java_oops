package polymorphisam;

class Teacher{
	void Teach() {
		System.out.println("Teaching");
	}
}
class Student extends Teacher{
	void Teach() {
		System.out.println("Listen the teaching");
	}
}
class Stu extends Student{
	void Teach() {
		System.out.println("Listens");
	}
}
public class RunTime {
	public static void main(String args[]) {
		Teacher t=new Teacher();
		Teacher t1=new Student();//specialization:one reference one object
		Teacher t2=new Stu();
		t.Teach();
		t1.Teach();
		t2.Teach();
	}

}
