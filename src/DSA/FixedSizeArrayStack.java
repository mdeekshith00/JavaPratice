package DSA;
// IMPLEMENTATION OF STACK USING FIXED ARRAY SIZE  

public class FixedSizeArrayStack {
	
	protected  int capacity1;
	public static final int capacity =16;
	protected int[] stackArray;
	protected int top = -1;
	
	public FixedSizeArrayStack() {
		this(capacity);
}
	public FixedSizeArrayStack(int cap) {
		capacity1 = cap;
		stackArray = new int[capacity1];
	}
	public int size() {
		return (top + 1);
	}
	public boolean isEmpty() {
		return(top < 0);
	}
	
	public void push(int data) throws Exception {
		if(size() == capacity1	)
			throw new Exception("stack is full");
		stackArray[++top] = data;
	}
	public int top() throws Exception {
		if(isEmpty()) 
			throw new Exception("Stack is Empty.");
		return stackArray[top];
	}
	public int pop() throws Exception {
		int data;
		if(isEmpty())
			throw new Exception("stack is empty");
		data = stackArray[top];
		stackArray[top--] = Integer.MIN_VALUE;
		return data;
	} 
	public String toString() {
		String s;
		s = "[";
		if(size() > 0) 
			s += stackArray[0];
		if(size()>1)
			for(int i=1; i<=size()-1; i++) {
				s += "," + stackArray[i];
			}
		return s + "]";
	}
	public static void main(String[] args) throws Exception {
		FixedSizeArrayStack myStack = new FixedSizeArrayStack(2);
		myStack.push(5);
		myStack.push(1);
		
		System.out.println("--- FixedSizeArrayStack ---");
		System.out.println("print stack elements before pop(): "+ myStack.toString());
		System.out.println("size of Stack : " + myStack.size());
		
//		System.out.println("pop element from  Stack : " + myStack.pop());
		System.out.println("pop element from  Stack : " + myStack.pop());
//		System.out.println("pop element from  Stack : " + myStack.pop());
		
		System.out.println("print stack delements after pop(): " + myStack.toString());
	}

}
