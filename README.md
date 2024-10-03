# Custom LinkedList Implementation

## Project Overview

This project implements a custom `MyLinkedList` class in Java, demonstrating the fundamental concepts of linked list data structures. The implementation includes basic operations such as adding and removing elements, as well as more advanced features like reversing the list and checking for subsequences.

## Features

- Basic LinkedList operations:
  - `addFirst(String value)`
  - `addLast(String value)`
  - `add(int index, String value)`
  - `get(int index)`
  - `contains(String value)`
  - `removeFirst()`
  - `removeLast()`
  - `remove(int index)`
- Advanced operations:
  - `reverse()`: Reverses the order of elements in the list
  - `removeMaximumValues(int N)`: Removes the N maximum values from the list
  - `containsSubsequence(MyLinkedList two)`: Checks if the list contains a given subsequence

## How to Use

1. Clone the repository:
   ```
   git clone https://github.com/yourusername/custom-linkedlist.git
   ```

2. Navigate to the project directory:
   ```
   cd custom-linkedlist
   ```

3. Compile the Java files:
   ```
   javac *.java
   ```

4. Run the Runner class:
   ```
   java Runner
   ```

## Example Usage

```java
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
```

## Project Structure

- `MyLinkedList.java`: Contains the main implementation of the custom LinkedList.
- `Runner.java`: Provides example usage and testing of the MyLinkedList class.

## Contributions

Contributions to this project are welcome. Please fork the repository and submit a pull request with your changes.


## Future Improvements

- Implement generic type support instead of using String
- Add more advanced operations (e.g., sorting, merging lists)
- Improve time complexity of certain operations
- Add comprehensive unit tests

Feel free to contribute to any of these improvements or suggest new features!
