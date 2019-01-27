 class Box{
 	double width;
 	double length;
 	double height;
 	
 	void volume(){
 		System.out.println("The volume of box is : ");
 		System.out.println(width*length*height);
 	}
 }
class BoxFinal{
	public static void main(String args[]){
		Box b1 = new Box();
		Box b2 = new Box();
		b1.width = 9;
		b1.length = 5;
		b1.height = 2;
		
		b2.width = 10;
		b2.length = 5;
		b2.height = 2;
		
		b1.volume();
		b2.volume();
	}
}