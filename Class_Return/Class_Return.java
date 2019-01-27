class Box{
	double width;
	double length;
	double height;
	
	double volume(){
		return width*length*height;
	}
	void setDim(double w, double l, double h){
		width = w;
		height = h;
		length = l;
	}
}

class BoxFinal{
		public static void main(String args[]){
		Box b1 = new Box();
		Box b2 = new Box();
		double vol;
				
		b1.setDim(10, 30, 2);
		b2.setDim(4, 5, 5);
		
	/*	vol = b1.volume(); 
		System.out.println("Volume of Box 1 is : " + vol);
		vol = b2.volume(); 
		System.out.println("Volume of Box 2 is : " + vol); 
		
		System.out.println("Volume of Box 1 is : " + b1.volume());
		System.out.println("Volume of Box 2 is : " + b2.volume());*/
		
		System.out.println("Volume of Box 1 is : " + b1.volume());
		System.out.println("Volume of Box 2 is : " + b2.volume());
	}
}