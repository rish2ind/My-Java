class A{
	int i;
}
class B extends A{
	int i;
	B(int a, int b){
		super.i = a;
		i = b;
	}
	void show(){
	    System.out.println("Ye i superclass ka h : "+ super.i);
		System.out.println("Ye i subclass ka h : "+ i);
	}
}
class SuperDemo{
	public static void main(String args[]){
		B b1 = new B(3, 4);
		b1.show();
	}
}