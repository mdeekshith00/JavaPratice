package DSA;



public class ListNode {
//	public class ListNode {
		public ListNode next;
		public int data;
	
		public ListNode() {
			next = null;
			data = Integer.MIN_VALUE;
		}
		public ListNode(int data) {
			next = null;
			this.data=data;
		}
		public ListNode getNext() {
			return next;
		}
		public void setNext (ListNode node) {
			next = node;
		}
		public int getData() {
			return data;
		}
		public void setData(int elem) {
			data = elem;
		}
		public String toString (){
			 return Integer.toString(data);
	} 
	public static void main(String[] args) {
		ListNode list = new ListNode(20);	
		list.data=10;
		list.data=30;
//		list.setData(65);
		
		
		System.out.println(list);
		System.out.println(list.getData());
		System.out.println(list.getNext());
		
		System.out.println(	list.toString());

		
		
	}

	}
