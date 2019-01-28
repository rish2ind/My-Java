class Factorial{
	int fact(int n){
		if (n==1)
		return 1;
		return fact(n-1)*n;
	}
}
class Recursion{
	public static void main(String args[]){
		Factorial f = new Factorial();
		
		System.out.println("Factorial of 3 is : " + f.fact(3));
		System.out.println("Factorial of 4 is : " + f.fact(4));
		System.out.println("Factorial of 5 is : " + f.fact(5));
		System.out.println("Factorial of 1 is : " + f.fact(1));
	}
}