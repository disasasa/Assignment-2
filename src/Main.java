import java.util.Iterator;

public class Main {
    public static void main(String[] args) {
        MyArrayList<Object> myList = new MyArrayList<>();
        // Adding elements to the list
        myList.add(40);
        myList.add(30);
        myList.add(20);
        myList.add(10);
        myList.add(50);
        myList.add(99);

        // Displaying the list
        System.out.println("Original List:");
        myList.printArr();

        // Testing other methods
        System.out.println("Testing other methods:");

        // Testing add
        System.out.println("\nAdding 25 at index 2:");
        myList.add(2, 25);
        myList.printArr();

        // Testing addFirst
        System.out.println("Adding 5 at the beginning:");
        myList.addFirst(5);
        myList.printArr();

        // Testing addLast
        System.out.println("Adding 60 at the end:");
        myList.addLast(60);
        myList.printArr();

        // Testing set
        System.out.println("Setting element at index 3 to 35:");
        myList.set(3, 35);
        myList.printArr();

        // Testing get
        System.out.println("Getting element at index 4: " + myList.get(4));

        // Testing getFirst()
        System.out.println("\nGetting the first element: " + myList.getFirst());

        // Testing getLast()
        System.out.println("\nGetting the last element: " + myList.getLast());

        // Testing remove
        System.out.println("\nRemoving element at index 1:");
        myList.remove(1);
        myList.printArr();

        // Testing removeFirst()
        System.out.println("Removing first element:");
        myList.removeFirst();
        myList.printArr();

        // Testing removeLast()
        System.out.println("Removing last element:");
        myList.removeLast();
        myList.printArr();

        // Testing lastIndexOf
        System.out.println("Index of 40: " + myList.lastIndexOf(40));

        // Testing exists
        System.out.println("\nDoes 50 exist in the list? " + myList.exists(50));

        // Testing sort
        System.out.println("\nSorting list");
        myList.sort();
        myList.printArr();

        // Testing toArray()
        System.out.println("Converting list to array:");
        Object[] array = myList.toArray();
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i] + " ");
        }

        // Testing clear()
        System.out.println("\nClearing the list:");
        myList.clear();
        myList.printArr();

        // Adding elements again to the list
        myList.add(10);
        myList.add(20);
        myList.add(30);
        myList.add(40);
        myList.add(50);

        // Displaying the list
        System.out.println("List after adding elements again:");
        myList.printArr();

        // Testing iterator
        System.out.println("Testing iterator:");
        System.out.println("Iterating over the list:");
        Iterator<Object> iter = myList.iterator();
        while(iter.hasNext()){
            System.out.print(iter.next() + " ");
        }

        // Testing MyLinkedList
        MyLinkedList<Object> myListLinked = new MyLinkedList<>();

        // Adding elements to the list
        myListLinked.add(40);
        myListLinked.add(30);
        myListLinked.add(20);
        myListLinked.add(10);
        myListLinked.add(50);
        myListLinked.add(99);

        // Displaying the list
        System.out.println("\n\n\nTesting MyLinkedList:");
        System.out.println("Original List:");
        myListLinked.printArr();

        // Testing other methods
        System.out.println("\nTesting other methods:");

        // Testing add
        System.out.println("\nAdding 25 at index 2:");
        myListLinked.add(2, 25);
        myListLinked.printArr();

        // Testing addFirst
        System.out.println("Adding 5 at the beginning:");
        myListLinked.addFirst(5);
        myListLinked.printArr();

        // Testing addLast
        System.out.println("Adding 60 at the end:");
        myListLinked.addLast(60);
        myListLinked.printArr();

        // Testing set
        System.out.println("Setting element at index 3 to 35:");
        myListLinked.set(3, 35);
        myListLinked.printArr();

        // Testing get
        System.out.println("Getting element at index 4: " + myListLinked.get(4));

        // Testing getFirst
        System.out.println("\nGetting the first element: " + myListLinked.getFirst());

        // Testing getLast
        System.out.println("\nGetting the last element: " + myListLinked.getLast());

        // Testing remove
        System.out.println("\nRemoving element at index 1:");
        myListLinked.remove(1);
        myListLinked.printArr();

        // Testing removeFirst
        System.out.println("Removing first element:");
        myListLinked.removeFirst();
        myListLinked.printArr();

        // Testing removeLast
        System.out.println("Removing last element:");
        myListLinked.removeLast();
        myListLinked.printArr();

        // Testing lastIndexOf
        System.out.println("Index of 10: " + myListLinked.lastIndexOf(10));

        // Testing exists
        System.out.println("\nDoes 50 exist in the list? " + myListLinked.exists(50));

        // Testing sort
        System.out.println("\nSorting list");
        myListLinked.sort();
        myListLinked.printArr();

        // Testing toArray
        System.out.println("Converting list to array:");
        Object[] arrayLinked = myListLinked.toArray();
        for (int i = 0; i < arrayLinked.length; i++) {
            System.out.print(arrayLinked[i] + " ");
        }

        // Testing clear
        System.out.println("\nClearing the list:");
        myListLinked.clear();
        myListLinked.printArr();

        // Adding elements again to the list
        myListLinked.add(10);
        myListLinked.add(20);
        myListLinked.add(30);
        myListLinked.add(40);
        myListLinked.add(50);

        // Displaying the list
        System.out.println("\nList after adding elements again:");
        myListLinked.printArr();

        // Testing iterator
        System.out.println("Testing iterator:");
        System.out.println("Iterating over the list:");
        Iterator<Object> iterLinked = myListLinked.iterator();
        while (iterLinked.hasNext()) {
            System.out.print(iterLinked.next() + " ");
        }
        System.out.println(" ");
        // Create a new stack
        MyStack<Object> stack = new MyStack<>();

        // Test isEmpty method
        System.out.println("\nIs stack empty? " + stack.isEmpty()); // Output: true

        // Test push method
        stack.push(3);
        stack.push(4);
        stack.push(5);

        // Test peek method
        System.out.println("Top element of the stack: " + stack.peek());

        // Test pop method
        System.out.println("Popped element: " + stack.pop());
        System.out.println("Popped element: " + stack.pop());

        // Test size method
        System.out.println("Size of the stack: " + stack.size());

        // Test isEmpty method again
        System.out.println("Is stack empty? " + stack.isEmpty());


        // Create a new queue
        MyQueue<Object> queue = new MyQueue<>();

        // Test isEmpty method
        System.out.println("\nIs queue empty? " + queue.isEmpty());

        // Test enqueue method
        queue.enqueue(3);
        queue.enqueue(4);
        queue.enqueue(5);

        // Test peek method
        System.out.println("Front element of the queue: " + queue.peek());

        // Test dequeue method
        System.out.println("Dequeued element: " + queue.dequeue());
        System.out.println("Dequeued element: " + queue.dequeue());

        // Test size method
        System.out.println("Size of the queue: " + queue.size());

        // Test isEmpty method again
        System.out.println("Is queue empty? " + queue.isEmpty());

        // Create a new min heap
        MyMinHeap<Integer> minHeap = new MyMinHeap<>();

        // Test isEmpty method
        System.out.println("\nIs heap empty? " + minHeap.isEmpty());

        // Test insert method
        System.out.println("Adding elements...");
        minHeap.insert(4);
        minHeap.insert(2);
        minHeap.insert(7);
        System.out.println("After adding 4, 2, 7: ");
        minHeap.printArr();
        minHeap.insert(1);
        minHeap.insert(8);
        System.out.println("After adding 1, 8: ");
        minHeap.printArr();

        // Test getMin method
        System.out.println("Minimum element in the heap: " + minHeap.getMin());

        // Test extractMin method
        System.out.println("Minimum element removed: " + minHeap.extractMin());
        minHeap.printArr();

        // after extracting min
        System.out.println("Minimum element in the heap: " + minHeap.getMin());

        // Test size method
        System.out.println("Size of the heap: " + minHeap.size());

        // Test isEmpty method again
        System.out.println("Is heap empty? " + minHeap.isEmpty());
    }

}