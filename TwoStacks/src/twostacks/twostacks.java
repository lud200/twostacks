package twostacks;

public class twostacks {
	public static void main(String args[]){
		stacks s=new stacks();
		s.push1(1);
		s.push1(2);
		s.push1(3);
		s.push2(4);
		s.push1(5);
		s.push2(6);
		s.push1(7);
		s.push2(8);
		s.push1(9);
		s.push2(10);
	}

}
class stacks{
	public final int MAX_INT=100;
	int top1, top2;
	int stack[]=new int[MAX_INT];
	
	public void twoStacks(){
		top1=-1;
		top2=-1;
	}
	
	public void empty(){
		System.out.println("Stack is empty");
	}
	
	public void full(){
		System.out.println("Stack is full");
	}
	
	public void push1(int x){
		System.out.println("Stack1");
		if(top1==MAX_INT-1){
			System.out.println("Stack is full");
		}
		else{
			top1=top1+1;
			stack[top1]=x;
			top2=top1;
			System.out.println(x);
		}
	}
	
	public void push2(int x){
		System.out.println("Stack2");
		if(top2==MAX_INT-1){
			System.out.println("Stack is full");
		}
		else{
			top2=top2+1;
			stack[top2]=x;
			top1=top2;
			System.out.println(x);
		}
	}
	
	public int pop1(){
		if(top1==-1){
			System.out.println("Empty stack");
		}
		else{
			stack[top1]=stack[top1-1];
			top1=top1-1;
			return stack[top1];
		}
		return stack[top1];
	}
	
	public int pop2(){
		if(top2==-1){
			System.out.println("Empty stack");
		}
		else{
			stack[top2]=stack[top2-1];
			top2=top2-1;
			return stack[top2];
		}
		return stack[top2];
	}
	
	public void printstack1(){
		for(int i=top2;i<top1; i++){
			System.out.println(stack[i]);
		}
	}
	
	public void printstack2(){
		for(int i=top1; i<top2; i++){
			System.out.println(stack[i]);
		}
	}
}