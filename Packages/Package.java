package MyPackage;
class Balance{
	String name;
	double bal;
	
	Balance(String n, double b){
		name = n;
		bal = b;
	}
	void show(){
		if (bal < 0)
		System.out.print("-->");
		System.out.println(name + ": $" + bal);
	}
}
class AccountBalance{
	public static void main(String args[]){
		Balance current[] = new Balance[3];
		
		current[0] = new Balance("Rishabh Mathur", 250.85);
		current[1] = new Balance("Ramiz Khan", 150.85);
		current[2] = new Balance("Riyaz Ul Haq", -250.85);
		
		for(int i = 0; i<3; i++)
		current[i].show();
	}
}