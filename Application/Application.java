 import java.util.Scanner;
class App{
	public static void main(String args[]){
		Scanner sc = new Scanner(System.in);
		int gen;
		System.out.println("Enter your gender : \n 1. Male \n 2. Female");
		gen = sc.nextInt();
		switch(gen){
			case 1 : 
				System.out.println("Enter your age : \n");
				int age1 = sc.nextInt();
				if(age1 > 21){
					System.out.println("You are an adult");
				}
				else{
					System.out.println("Minors are not allowed");
				}
				break;
			case 2 :
				System.out.println("Enter your age : \n");
				int age2 = sc.nextInt();
				if(age2 > 18){
					System.out.println("You are an adult");
				}
				else{
					System.out.println("Minors are not allowed");
				}
				break;			
		}
	}
}