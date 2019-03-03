class Exc2{
	public static void main(String args[]){
		int d, a;
		try{
			d = 0;
			a = 10/d;
			System.out.println("This statement will not printed");
		}
		catch(ArithmeticException e){
			System.out.println("Divided by 0 ");
		}
		System.out.println("Catch is a normal message ");
	}
}