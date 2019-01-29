class Static{
	static int a =8;
	static int b = 9;
	
	static int stat(){
		return a;
	}
}
class StaticDemo{
	public static void main(String args[]){
		System.out.println("Value of a is : " + Static.stat());
		System.out.println("Value of b is : " + Static.b);
	}
}