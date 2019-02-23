interface StackDemo{
	void push(int item);
	int pop();
}
class FixedStack implements StackDemo{
	private int stack[];
	private int tos;
	FixedStack(int size){
		stack = new int[size];
		tos = -1;
	}
	public void push(int item){
		if(tos <= stack.length - 1){
			int temp[] = new int[stack.length * 2];
			for(int i = 0; i<stack.length; i++)
				temp[i] = stack[i];
			stack = temp;
			stack[++tos] = item;	
		}
			
		else
			stack[++tos] = item;	
	}
	public int pop(){
		if(tos<0){
			System.out.println("Stack Underflow");
			return 0;
		}	
		else
			return stack[tos--];	
	}
}
class FinalDemo{
	public static void main(String args[]){
		FixedStack f = new FixedStack(5);
		
		for(int i =0; i<5; i++)
			f.push(i);
			
		System.out.println("Stack is : ");
		for(int i = 0; i<5; i++)
			System.out.println(f.pop());	
	}
}