import java.util.LinkedList;

public class Runner {

	public static void main(String[] args) {

		
		MyLinkedList list = new MyLinkedList();
		
//		list.addFirst("Mike");
//		list.addFirst("Andrew");
//		list.addFirst("Tom");
//		list.addFirst("Sarah");
//		list.addFirst("Kevin");
		
		list.addLast("Mike");
		list.addLast("Andrew");
		list.addLast("Tom");
		list.addLast("Sarah");
		list.addLast("Kevin");
		
		list.reverse();
		
		System.out.println(list.head.value);
		System.out.println(list.head.next.value);
		System.out.println(list.head.next.next.value);
		System.out.println(list.head.next.next.next.value);
		System.out.println(list.head.next.next.next.next.value);
		
		System.out.println("The head is "+list.head.value);
		System.out.println("The tail is "+list.tail.value);
		
		System.out.println("hello".compareTo("z"));
		
//		LinkedList<String> names = new LinkedList<String>();
//		
//		names.add("Mike");
//		names.add("Andrew");
//		names.add("James");
//		names.add("Kevin");
//
//		
//		System.out.println(names.pop());
//		System.out.println(names);
	}

}
