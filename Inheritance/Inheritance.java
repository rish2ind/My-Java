class Box{
	double width;
	double length;
	double height;
	
	Box(){
		width = -1;
		length = -1;
		height = -1;
	}
	Box(Box b){
		width = b.width;
		length = b.length;
		height = b.height;
	}
	Box(double w, double l, double h){
		width = w;
		length = l;
		height = h;
	}
	double vol(){
		return width*length*height;
	}
}
class BoxWeight extends Box{
	double weight;
	BoxWeight(double w, double l, double h, double m){
		width = w;
		length = l;
		height = h;
		weight = m;
	}
}

class Final{
	public static void main(String args[]){
		BoxWeight b1 = new BoxWeight(4.5, 5.0, 6.0, 35.6);
		BoxWeight b2 = new BoxWeight(5.0, 5.0, 4.0, 36.2); 
		
		System.out.println("Volume of Box 1 is : " + b1.vol());
		System.out.println("Volume of Box 2 is : " + b2.vol());
		
		System.out.println("Weight of Box 1 is : " + b1.weight);
		System.out.println("Weight of Box 2 is : " + b2.weight);
	}
}