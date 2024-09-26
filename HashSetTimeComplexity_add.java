import java.util.HashSet;

public class HashSetTimeComplexity_add
{
   public static void main(String[] args) {
        // Test for different sizes of HashSets
        for (int size = 1000; size <= 1000000; size *= 10) {
            HashSet<Integer> hashSet = new HashSet<>();

            // Fill the HashSet with integers
            for (int i = 0; i < size; i++) {
                hashSet.add(i);
            }

            // Measure time for adding an element (simulated at start)
            long startTime = System.nanoTime();
            hashSet.add(-1); // Adding at the start (conceptually)
            long endTime = System.nanoTime();
            System.out.println("Add at Start: " + (endTime - startTime) + " ns");

            // Measure time for adding an element (simulated in middle)
            startTime = System.nanoTime();
            hashSet.add(size / 2); // Adding in the middle (conceptually)
            endTime = System.nanoTime();
            System.out.println("Add at Middle: " + (endTime - startTime) + " ns");

            // Measure time for adding an element (simulated at end)
            startTime = System.nanoTime();
            hashSet.add(size + 1); // Adding at the end (conceptually)
            endTime = System.nanoTime();
            System.out.println("Add at End: " + (endTime - startTime) + " ns");
        }
    } 


}
