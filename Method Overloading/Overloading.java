class OverloadingDemo{
	void test(){
		System.out.println("No parameters ");
	}
	void test(int a){
		System.out.println("Value of a is : "+a);
	}
	int test(int a, int b){
		return (a+b);
	}
	double test(double a){
		return a*a;
	}
}
class Overloading{
	public static void main(String args[]){
		OverloadingDemo ob = new OverloadingDemo();
		double mul;
		double sum;
		ob.test();
		ob.test(10);
		System.out.println("The sum is : " + ob.test(40, 30));
		System.out.println("Multiplication is : " + ob.test(45.5));
	}
}