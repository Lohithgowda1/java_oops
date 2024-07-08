package inheritance;

class Doctor{
	int salary=50000;
}
class Specialist extends Doctor{
	int bonuss=10000;
}
 class Surgen extends Specialist{
	int bonus=8000;
public static void main(String args[]) {
	Surgen s=new Surgen();
	System.out.println("salary of doctor:"+s.salary);
	System.out.println("surgen bonus is:"+s.bonus);
	System.out.println("specialist bonus is:"+s.bonuss);
		
	}//eg for the multilevel 

}
 
