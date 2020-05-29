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
	
		
////		list.addFirst("Joe");
////		list.addFirst("Bob");
////		list.addFirst("Ellis");
////		list.addFirst("Sarah");
////		list.addFirst("Kevin");
//		
////		list.addLast("Mike");
////		list.addLast("Andrew");
////		list.addLast("Zen");
////		list.addLast("Tom");
////		list.addLast("Zen");
////		list.addLast("Kevin");
////		list.addLast("Zen");
////		list.addLast("Sarah");
////		list.addLast("Bob");
////		list.addLast("Joe");
////		
////		list.reverse();
//		
////		System.out.println(list.head.value);
////		
////		System.out.println(list.head.next.value);
////		System.out.println(list.head.next.next.value);
////		System.out.println(list.head.next.next.next.value);
////		System.out.println(list.head.next.next.next.next.value);
////		System.out.println(list.head.next.next.next.next.next.value);
////		System.out.println(list.head.next.next.next.next.next.next.value);
////		System.out.println(list.head.next.next.next.next.next.next.next.value);
//		
////		System.out.println();
////		System.out.println("The head is "+list.head.value);
////		System.out.println("The tail is "+list.tail.value);
//		
//		list.addFirst("COYOTE");
//		list.addFirst("DONKEY");
//		list.addFirst("KANGAROO");
//		list.addFirst("AARDVARK");
//		list.addFirst("PLATYPUS");
//		list.addFirst("KANGAROO");
//		
//		
//		
//		list.removeMaximumValues(1);
//		
//		System.out.println(list.head.value);
//		System.out.println(list.head.next.value);
//		System.out.println(list.head.next.next.value);
//		System.out.println(list.head.next.next.next.value);
//		System.out.println(list.head.next.next.next.next.value);
//		System.out.println(list.head.next.next.next.next.next.value);
//		System.out.println(list.head.next.next.next.next.next.next.value);
//		
//		
////		LinkedList<String> names = new LinkedList<String>();
////		
////		names.add("Mike");
////		names.add("Andrew");
////		names.add("James");
////		names.add("Kevin");
////
////		
////		System.out.println(names.pop());
////		System.out.println(names);
	}

}
