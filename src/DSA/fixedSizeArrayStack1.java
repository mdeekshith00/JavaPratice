package DSA;

public class fixedSizeArrayStack1 {
	protected int capacity;
	public static final int CAPACITY = 16;
	public int[] stackArray;
	protected int top = -1;
	
//	public fixedSizeArrayStack1() {
//		this(CAPACITY);
//	}
	
	public fixedSizeArrayStack1(int cap) {
		capacity = cap;
		stackArray = new int[capacity];
	}
	public int size() {
		return (top+1);
	}
	public boolean isEmpty() {
		return (top<0);
	}
	public void push(int data) throws Exception {
		if(size() == CAPACITY) {
			throw new Exception("Stack is full");
		}
		stackArray[++top] = data;
	}
	public int top() throws Exception {
		if(isEmpty())
			throw new Exception("Stack is Empty");
		return stackArray[top];
	}
	public int pop() throws Exception {
		int data ;
		if(isEmpty()) 
			throw new Exception("Stack is Empty");
		data = stackArray[top];
		stackArray[top--] = Integer.MIN_VALUE;
		return data;
		}
	public String toString() {
		String s;
		s="[";
		if(size()>0)
			s +=stackArray[0];
		if(size()>1)
			for(int i=1;i<=size()-1; i++) {
				s += "," + stackArray[i];
			}
		return s+"]";
	}
	public static void main(String[] args) throws Exception {
		fixedSizeArrayStack1 myStack = new fixedSizeArrayStack1(18);
		myStack.push(1);
		myStack.push(43);
		myStack.push(2);
		myStack.push(18);
		
		myStack.push(32);
		myStack.push(87);
//		myStack.push(65);
		myStack.push(51);
		myStack.push(53);
		
		System.out.println(myStack.toString());
		System.out.println(myStack.pop());
		System.out.println(myStack.pop());
		System.out.println(myStack.pop());
		System.out.println();
		
		
	}

}
