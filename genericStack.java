public class genericStack <T> {

	private Object [] stk;
	private int top=-1;
	private int soS=-1;
	
	public genericStack(int size) {
		
		stk = new Object [size];
		top = size;
		soS = size;
		
		for(int i=0;i<size;i++) stk[i]=null;
	}

	public void push(T element) {
		
		top--;
		if(top==0) System.out.println("-------------- Stack Overflow -------------");
		else {if (stk[top]==null) stk[top]=element;}
	}
	
	public void pop() {
		
		if(top == soS) System.out.println("-------------- Stack Underflow -------------");
		else {stk[top]=null;top++;}
	}
	
	public void printStack() {
		for(int i=0;i<soS;i++) {if(stk[i]!= null) System.out.println(stk[i]);}
	}
}
