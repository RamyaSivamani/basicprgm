class MultilevelInheritance{
	protected String str;
	MultilevelInheritance() {
		str = "This ";
	}
}
 
class ChildClass1 extends MultilevelInheritance {
	ChildClass1() {
		str = str.concat("is ");
	}
}
 
class ChildClass2 extends ChildClass1 {
	ChildClass2() {
		str = str.concat("Multilevel Inheritance ");
	}
}
 
class ChildClass3 extends ChildClass2 {
	ChildClass3() {
		str = str.concat("Example.");
	}
	void display() {
		System.out.println(str);
	}
}
 
class MultilevelInheri {
	public static void main(String args[]) {
		ChildClass3 obj = new ChildClass3();
		obj.display();
	}
}

