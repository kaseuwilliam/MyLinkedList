import java.util.ArrayList;

public class MyLinkedList {

	class Node {
		String value;
		Node next = null;

		Node(String value) {
			this.value = value;
		}
	}

	protected Node head = null;
	protected Node tail = null;
	protected int size = 0;

	public void addFirst(String value) {
		Node newNode = new Node(value);
		newNode.next = head;
		head = newNode;
		if (newNode.next == null) {
			tail = newNode;
		}
		size++;
	}

	public void addLast(String value) {
		Node newNode = new Node(value);
		if (tail == null) {
			head = newNode;
		} else {
			tail.next = newNode;
		}
		tail = newNode;
		size++;
	}

	public void add(int index, String value) {
		if (index < 0)
			throw new IndexOutOfBoundsException();
		if (index == 0) {
			addFirst(value);
		} else {
			Node newNode = new Node(value);
			Node current = head;
			for (int i = 0; i < index - 1; i++) {
				if (current == null)
					throw new IndexOutOfBoundsException();
				current = current.next;
			}
			if (current.next == null) {
				tail = newNode;
			}
			newNode.next = current.next;
			current.next = newNode;
			size++;
		}
	}

	public String get(int index) {
		if (index < 0) {
			throw new IndexOutOfBoundsException();
		} else {
			Node current = head;
			for (int i = 0; i < index; i++) {
				if (current == null || current.next == null) {
					throw new IndexOutOfBoundsException();
				}
				current = current.next;
			}
			return current.value;
		}
	}

	public boolean contains(String value) {
		Node current = head;
		while (current != null) {
			if (current.value.equals(value)) {
				return true;
			}
			current = current.next;
		}
		return false;
	}

	public void removeFirst() {
		if (head != null) {
			head = head.next;
		}
		if (head == null) {
			tail = null;
		}
		if (size > 0)
			size--;
	}

	public void removeLast() {
		if (head == null) { // empty list
			return;
		} else if (head == tail) {
			// single element list
			head = null;
			tail = null;
		} else {
			Node current = head;
			while (current.next != tail) {
				current = current.next;
			}
			tail = current;
			current.next = null;
		}
		size--;
	}

	public void remove(int index) {
		if (index < 0)
			throw new IndexOutOfBoundsException();
		else if (index == 0)
			removeFirst();
		else {
			Node current = head;
			for (int i = 0; i < index - 1; i++) {
				if (current == null)
					throw new IndexOutOfBoundsException();
				current = current.next;
			}
			current.next = current.next.next;
			if (current.next == null) {
				tail = current;
			}
			size--;
		}
	}

	/*
	 * Implement the methods below. Please do not change their signatures!
	 */

	public void reverse() {

		ArrayList<Node> list = new ArrayList<Node>();

		Node current = head;

		int counter = 0;

		while (current != null) {

			list.add(current);

			current = current.next;
			counter++;
		}

		if (counter == 0) {

			throw new NullPointerException("The LinkedList is empty");

		} else if (counter == 1) {

		} else {

			for (int i = 0; i < list.size(); i++) {

				Node newNode = list.get(i);

				newNode.next = head;
				head = newNode;

			}

			tail = list.get(0);
			list.get(0).next = null;

		}
	}

	public void removeMaximumValues(int N) {

		for (int i = 0; i < N; i++) {

			compareToRemover();
		}

	}

	public boolean containsSubsequence(MyLinkedList two) {
		/* IMPLEMENT THIS METHOD! */

		return false;
	}

	public void compareToRemover() {

		if (head == null) {

		} else {

			Node current = head;
			
			Node larger = head;
			
			int index = 0;

			int counter = 0;

			if (current.next == null) {

				remove(0);

			} else if(current.next.next == null) {
				
				if(current.value.compareTo(current.next.value) > 0) {
				
					remove(1);
				} else {
					
					remove (0);
				}
				
			}
				else {
			
				
				// create a method to deal when there's 2 nodes left
				
				for (int i = 0; i < size - 1; i++) {

					if (current.value.compareTo(current.next.value) > 0 && current.next != null
							&& current.value.compareTo(larger.value) > 0) {

						larger = current;
						index = counter;

					}

					current = current.next;
					counter++;
				}

				remove(index);

				while (contains(larger.value)) {

					compareToRemover();
				}
			}
		}
	}
}