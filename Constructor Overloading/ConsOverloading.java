class Box{
	double width;
	double height;
	double length;
	
	Box(double w, double h, double l){
		width = w;
		height = h;
		length = l;
	}
	Box(){
		width = -1;
		height  = -1;
		length = -1;
	}
	double volume (){
		return width * height * length ;
	}
}

class BoxFinal{
	public static void main(String args[]){
		Box b1 = new Box(10, 4, 5);
		Box b2 = new Box();
		
		System.out.println("The volume of the box is : " + b1.volume());
		System.out.println("The volume of the box is : " + b2.volume());
	}
}