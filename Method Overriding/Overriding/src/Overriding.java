class A{
	int i, j;
	A(int a, int b){
		i = a;
		j = b;	
	}
	void show(){
		System.out.println("This is A's constructor !" +i + ", "+ j);
	}
}
class B extends A{
	int k;
	B(int a, int b, int c){
		super(a, b);
		k = c;
	}
	void show(){
		System.out.println("This is B's constructor !" + k);
	}
}
class C extends B{
	int l;
	C(int a, int b, int c, int d){
		super(a, b, c);
		l = d;
	}
	void show(){
		System.out.println("This is C's constructor ! " + l);
	}
}
public class Overriding {
	public static void main(String[] args) {
		C c = new C(1, 2, 3, 4);
		c.show();

	}

}
