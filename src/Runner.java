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
		list.addLast("Zen");
		list.addLast("Tom");
		list.addLast("Zen");
		list.addLast("Kevin");
		list.addLast("Zen");
		list.addLast("Sarah");
		
		list.reverse();
		
		System.out.println(list.head.value);
		System.out.println(list.head.next.value);
		System.out.println(list.head.next.next.value);
		System.out.println(list.head.next.next.next.value);
		System.out.println(list.head.next.next.next.next.value);
		System.out.println(list.head.next.next.next.next.next.value);
		System.out.println(list.head.next.next.next.next.next.next.value);
		System.out.println(list.head.next.next.next.next.next.next.next.value);
		
		System.out.println();
		System.out.println("The head is "+list.head.value);
		System.out.println("The tail is "+list.tail.value);
		
		
		
		list.removeMaximumValues(5);
		
		System.out.println(list.head.value);
		System.out.println(list.head.next.value);
		System.out.println(list.head.next.next.value);
		System.out.println(list.head.next.next.next.value);
		System.out.println(list.head.next.next.next.next.value);
		//System.out.println(list.head.next.next.next.next.next.value);
		
		
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
