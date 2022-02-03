import java.util.LinkedList;
public class LinkedListDemo {
	public static void main(String[] args) {
		LinkedList ll = new LinkedList();
		ll.addFirst(6);
		ll.add(10);
		ll.add("raja");
		ll.add("kamali");
		ll.add(true);
		System.out.println(ll);
		
		ll.addFirst(100);//using addFirst method the integer object will add first
		System.out.println(ll);
		System.out.println("Before poll:" +ll);//using poll
		System.out.println(ll.poll());
		System.out.println("After poll:" +ll);//removing first element
		
		//add and offer same method
		ll.offer(5000);
		System.out.println("after offer:" +ll );
		
		
		//ll.clear();
		//System.out.println("after clear:"  +ll );
		ll.remove();
		ll.removeLast();
		ll.remove("C");
		
		
		System.out.println("Original List After deleting first and last object");
		System.out.println(ll);
		System.out.println("First object in linked list: "+ ll.getFirst());
		System.out.println("Last object in linked list: "+ ll.peekLast());
		System.out.println(ll);
		
		LinkedList ll2= (LinkedList)ll.clone();//using clone: give object copy
		System.out.println("cloned object:"  +ll2 );
	
	
	
	System.out.println(ll2);
	}
	
}
