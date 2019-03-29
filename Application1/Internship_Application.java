 import java.util.Scanner;
class App{
	public static void main(String args[]){
		Scanner sc = new Scanner(System.in);
		int gen;
		System.out.println("\nEnter your gender : \n 1. Male \n 2. Female\n");
		gen = sc.nextInt();
		switch(gen){
			case 1 : 
				System.out.println("\nEnter your age : \n 1. Above 21\n 2. Below\n");
				int age1 = sc.nextInt();
					switch(age1){
						case 1 : 
						System.out.println("You are an adult");
							break;
						case 2 :
						System.out.println("Minors are not allowed");
						break;
					}
					break;
			case 2 :
				System.out.println("\nEnter your age :\n 1. Above 18\n 2. Below\n");
				int age2 = sc.nextInt();
					switch(age2){
						case 1 : 
						System.out.println("You are an adult");
							break;
						case 2 :
						System.out.println("Minors are not allowed");
						break;
					}
					break;
		}
	}
}