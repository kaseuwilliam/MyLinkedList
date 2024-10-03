import org.w3c.dom.Node;

public class Runner {

	public static void main(String[] args) {

		
		MyLinkedList list1 = new MyLinkedList();
		MyLinkedList list2 = new MyLinkedList();
		
		list1.addFirst("Joe");
		list1.addFirst("Bob");
		list1.addFirst("Ellis");
		list1.addFirst("Sarah");
		list1.addFirst("Kevin");
		list1.addFirst("Brook");
		list1.addFirst("Joe");
		
		list2.addFirst("Joe");
		list2.addFirst("Joe");
		list2.addFirst("Bob");
		list2.addFirst("Ellis");
		list2.addFirst("Sarah");
		list2.addFirst("Kevin");
		
	
		System.out.println(list1.containsSubsequence(list2));
	}

}
