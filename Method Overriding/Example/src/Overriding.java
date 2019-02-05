class A{
	int i, j;
	A(int a, int b){
		i = a;
		j = b;
	}
	void show(){
		System.out.println("i and j is : "+i +", "+j);
	}
}
class B extends A{
	int k;
	B(int a, int b, int c){
		super(a, b);
		k = c;
	}
	void show(String msg){
		System.out.println(msg + k);
	}
}
public class Overriding {
	public static void main(String[] args) {
		B b = new B(1, 2, 3);
		
		b.show("String of this class is : " );
		b.show();
	}

}
