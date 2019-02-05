class Box{
	private double width;
	private double length;
	private double depth;
	
	Box(){
		width = -1;
		length = -1;
		depth = -1;
	}
	Box(double w, double l, double d){
		width = w;
		length = l;
		depth = d;
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
	BoxWeight(double w, double l, double d, double m){
		super(w, l, d);
		weight = m;
	}
}
class BoxCost extends BoxWeight{
	double cost;
	BoxCost(){
		super();
		cost = -1;
	}
	BoxCost(double w, double l, double d, double m, double c){
		super(w, l, d, m);
		cost = c;
	}
}
class BoxFinal{
	public static void main(String args[]){
		BoxCost b1 = new BoxCost(5, 6, 5, 35.7, 150);
		BoxCost b2 = new BoxCost(4, 6, 2, 32.7, 120);
		
		System.out.println("Volume of Box 1 is : "+ b1.volume());
		System.out.println("Weight of Box 1 is : "+ b1.weight);
		System.out.println("Cost of Box 1 is : "+ b1.cost);
		
		System.out.println();
		System.out.println("Volume of Box 2 is : "+ b2.volume());
		System.out.println("Weight of Box 2 is : "+ b2.weight);
		System.out.println("Cost of Box 2 is : "+ b2.cost);
	}
}