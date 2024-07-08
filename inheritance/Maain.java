package inheritance;

 class Animalsound {
	 public void animalsound() {
		 System.out.println("Animals make sound");
	 }

}
 class Dooog extends Animalsound{
	 public void animalsound() {
		 System.out.println("Dog make bow bow sound");
	 }
 }
 class Cat extends Animalsound{
	 public void animalsound() {
		 super.animalsound();
		 System.out.println("cat make mewo mewo sound");
	 }
 }
 class Maain {
	 public static void main(String args[]) {
		 Animalsound animal=new Animalsound();
		 Dooog dog=new Dooog();
		 Cat cat=new Cat();
		 animal.animalsound();
		 dog.animalsound();
		 cat.animalsound();
	 }
	 
 }
