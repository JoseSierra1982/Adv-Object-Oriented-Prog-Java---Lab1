import java.util.LinkedList;
public class LinkedListTimeComplexity_remove {
     public static void main(String[] args) {
        // Test for different sizes of LinkedLists
        for (int size = 1000; size <= 1000000; size *= 10) {
            LinkedList<Integer> linkedList = new LinkedList<>();

            // Fill the LinkedList with integers
            for (int i = 0; i < size; i++) {
                linkedList.add(i);
            }

            // Measure time for deleting an element at the start
            long startTime = System.nanoTime();
            linkedList.removeFirst(); // Removing the first element
            long endTime = System.nanoTime();
            System.out.println("Delete at Start: " + (endTime - startTime) + " ns");

            // Measure time for deleting an element in the middle
            startTime = System.nanoTime();
            linkedList.remove(size / 2); // Removing a middle element
            endTime = System.nanoTime();
            System.out.println("Delete at Middle: " + (endTime - startTime) + " ns");

            // Measure time for deleting an element at the end
            startTime = System.nanoTime();
            linkedList.removeLast(); // Removing the last element
            endTime = System.nanoTime();
            System.out.println("Delete at End: " + (endTime - startTime) + " ns");
        }
    }
    
}
