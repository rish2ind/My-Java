class Box{
	double width;
	double length;
	double height;
	
	double volume(){
		return width*length*height;
	}
}

class BoxFinal{
		public static void main(String args[]){
		Box b1 = new Box();
		Box b2 = new Box();
		double vol;
				
		b1.width = 10;
		b1.length = 3;
		b1.height = 2;
		
		b2.width = 10;
		b2.length = 5;
		b2.height = 2;
		
	/*	vol = b1.volume(); 
		System.out.println("Volume of Box 1 is : " + vol);
		vol = b2.volume(); 
		System.out.println("Volume of Box 2 is : " + vol); */
		
		System.out.println("Volume of Box 1 is : " + b1.volume());
		System.out.println("Volume of Box 2 is : " + b2.volume());
	}
}