class Stack{
	int stck[] = new int[10];
	int tos;
	
	Stack(){
		tos = -1;
	}
	
	void push(int item){
		if(tos==9)
			System.out.println("Stack is full");
		else
			stck[++tos] = item;	
	}
	int pop(){
		if(tos<0){
			System.out.println("Stack is Empty");
			return 0;
		}
		else 
		   return stck[tos--];
	}
}

class StackDemo{
	public static void main(String args[]){
		Stack s1 = new Stack();
		Stack s2 = new Stack();
		
		for (int i = 0; i<10; i++)
			s1.push(i);
		for (int i = 10; i<20; i++)	
			s2.push(i);
			
		System.out.println("Elements in Stack 1 is : ");
		for (int i = 0; i<10; i++)	
			System.out.println(s1.pop());
			
		System.out.println("Elements in Stack 2 is : ");
		for (int i = 0; i<10; i++)	
			System.out.println(s2.pop());	
	}
}