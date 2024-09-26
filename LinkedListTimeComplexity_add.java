import java.util.LinkedList;
public class LinkedListTimeComplexity_add
{

    public static void main(String[] args) {
        // Test for different sizes of LinkedLists
        for (int size = 1000; size <= 1000000; size *= 10) {
            LinkedList<Integer> linkedList = new LinkedList<>();

            // Fill the LinkedList with integers
            for (int i = 0; i < size; i++) {
                linkedList.add(i);
            }

            // Measure time for adding an element at the start
            long startTime = System.nanoTime();
            linkedList.addFirst(-1); // Adding at the start
            long endTime = System.nanoTime();
            System.out.println("Add at Start: " + (endTime - startTime) + " ns");

            // Measure time for adding an element in the middle
            startTime = System.nanoTime();
            linkedList.add(size / 2, -1); // Adding in the middle
            endTime = System.nanoTime();
            System.out.println("Add at Middle: " + (endTime - startTime) + " ns");

            // Measure time for adding an element at the end
            startTime = System.nanoTime();
            linkedList.add(-1); // Adding at the end
            endTime = System.nanoTime();
            System.out.println("Add at End: " + (endTime - startTime) + " ns");
        }
    }
}


