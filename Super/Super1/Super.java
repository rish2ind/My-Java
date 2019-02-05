class Box{
	private double width;
	private double length;
	private double depth;
	
	Box(double w, double l, double d){
		width = w;
		length = l;
		depth = d;
	}
	Box(){
		width = -1;
		length = -1;
		depth = -1;
	}
	double volume(){
		return width * length * depth;
	}
}
class BoxWeight extends Box{
    double weight;
	BoxWeight(){
		super();
		weight = -1;
	}
	BoxWeight(double w, double l, double d, double we){
		super(w, l, d);
		weight = we;
	}
}

class DemoSuper{
	public static void main(String args[]){
		BoxWeight b1 = new BoxWeight(4, 5, 6, 37.5);
		BoxWeight b2 = new BoxWeight(4, 4, 6, 34.5);
		BoxWeight b3 = new BoxWeight(4, 2, 6, 32.5);
		System.out.println("Volume of the box is : "+ b1.volume());
		System.out.println("Weight of the box is : "+ b1.weight);
		System.out.println();
		
		System.out.println("Volume of the box is : "+ b2.volume());
		System.out.println("Weight of the box is : "+ b2.weight);
		System.out.println();
		
		System.out.println("Volume of the box is : "+ b3.volume());
		System.out.println("Weight of the box is : "+ b3.weight);
		System.out.println();
		
	}
}