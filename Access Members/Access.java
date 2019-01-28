class Test{
	int a;
	public int b;
	private int c;
	
	void setc(int i){
		c = i;
	}
	
	int getc(){
		return c;
	}
}

class TestFinal{
	public static void main(String args[]){
		Test t =  new Test();
		
		t.a=10;
		t.b = 20;
		
	// Produce Error	t.c = 30;
		
		t.setc(30);
		System.out.println("Value of a, b and c is : " +t.a + " "+t.b+ " "+ t.getc());
	}
}