class Box{
	double width;
	double length;
	double height;
	
	Box(double w, double l, double h){  // Creating a parameterized Constructor
		width = w;
		length = l;
		height = h;
	}
	double volume(){
		return width * length * height;
	}
}

class BoxFinal{
	public static void main(String args[]){
		Box b1=new Box(20, 10, 5);
		Box b2=new Box(2, 10, 5);
		
		System.out.println("Volume of Box 1 is : "+ b1.volume());
		System.out.println("Volume of Box 2 is : "+ b2.volume());
	}
}