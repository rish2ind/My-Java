class Figure{
	double dim1;
	double dim2;
	Figure(double a, double b){
		dim1 = a;
		dim2 = b;
	}
	double area(){
		System.out.println("Area of Figure is undefined : ");
		return 0;
	}
}
class Rect extends Figure{
	Rect(double a, double b){
		super(a, b);
	}
	double area(){
		System.out.println("Inside area of Rectangle is : ");
		return dim1*dim2;
	}
}
class Triangle extends Figure{
	Triangle(double a, double b){
		super(a, b);
	}
	double area(){
		System.out.println("Inside area of triangle is : ");
		return (dim1*dim2)/2;
	}
}
class FigArea{
	public static void main(String args[]){
		Figure f = new Figure(45.2, 56.3);
		Rect r = new Rect(10, 30);
		Triangle t = new Triangle(10, 10);
		
		Figure fig;
		
		fig = r;
		System.out.println("Area is : " + fig.area());
		
		fig = t;
		System.out.println("Area is : " + fig.area());
		
		fig = f;
		System.out.println("Area is : " + fig.area());
	}
}