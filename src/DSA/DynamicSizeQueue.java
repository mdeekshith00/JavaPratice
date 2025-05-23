package DSA;

public class DynamicSizeQueue {
	private int maxSize;
	private int[] stackArray;
	private int top;
	
	public DynamicSizeQueue(int size) {
		maxSize = size;
		stackArray = new int[maxSize];
		top = -1;
	}
	public void push(int value) {
			if(!isFull()) {
				top++;
				stackArray[top] =value;
			} else {
				resize(maxSize * 2);
				push(value);
			}
	}
	
	public int pop() {
		if(!isEmpty()) {
			return stackArray[top--];
		}
		if(top < maxSize/4) {
			resize(maxSize/2);
			return pop();
		} else {
			System.out.println("The stack is already empty");
			return -1;
		}
	}
	private void resize(int i) {
		// TODO Auto-generated method stub
		int newSize = 0;
		int [] transferarray = new int[newSize];
		
		for(int i1=0; i1<stackArray.length; i1++) {
			transferarray[i1] = stackArray[i1];
			stackArray= transferarray;
		}
		maxSize = newSize;
	}
	
	public int peek() {
		if(!isEmpty()) {
			return stackArray[top];
		} else {
			System.out.println("The stack is empty , cant peek");
			return -1;
		}
	}
	
	private boolean isEmpty() {
		// TODO Auto-generated method stub
		return (top == -1);
	}
	private boolean isFull() {
		// TODO Auto-generated method stub
		return (top +1 == maxSize);
	}
	public void makeEmpty() {
		top = -1;
	}
	public static void main(String[] args) {
		DynamicSizeQueue mystack = new DynamicSizeQueue(2);
		mystack.push(5);
		mystack.push(14);
		mystack.push(65);
		mystack.push(54);
		
		System.out.println("--- stack Array Implementation ---");
		System.out.println(mystack.isEmpty());
		System.out.println(mystack.isFull());
		System.out.println(mystack.peek());
		System.out.println(mystack.pop());
		System.out.println(mystack.peek());
		
		
	}

}
