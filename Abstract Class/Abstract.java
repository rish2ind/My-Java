abstract class Figure{
	double dim1;
	double dim2;
	
	Figure(double a, double b){
		dim1 = a;
		dim2 = b;
	}
	abstract double area();
}
class Rect extends Figure{
	Rect(double a, double b){
		super(a, b);
	}
	double area(){
		return dim1*dim2;
	}
}
class Triangle extends Figure{
	Triangle(double a, double b){
		super(a, b);
	}
	double area(){
		return (dim1*dim2)/2;
	}
}
class AbstractArea{
	public static void main(String args[]){
		Rect r = new Rect(15.0, 4.0);
		Triangle t = new Triangle(10.0, 10.0);
		
		Figure fig;
		fig = r;
		System.out.println("Area of Rectangle is : " + fig.area());
		
		fig = t;
		System.out.println("Area of Triangle is : " + fig.area());
	}
}