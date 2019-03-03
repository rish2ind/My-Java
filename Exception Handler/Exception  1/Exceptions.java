class Exc1{
	static void subroutine(){
		int d = 0;
		int a =42/d;
	}
}

class Demo{
	public static void main(String args[]){
		Exc1.subroutine();
	}
}