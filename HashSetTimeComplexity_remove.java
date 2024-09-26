import java.util.HashSet;

public class HashSetTimeComplexity_remove 
{
        public static void main(String[] args) {
        // Test for different sizes of HashSets
        for (int size = 1000; size <= 1000000; size *= 10) {
            HashSet<Integer> hashSet = new HashSet<>();

            // Fill the HashSet with integers
            for (int i = 0; i < size; i++) {
                hashSet.add(i);
            }

            // Measure time for deleting an element (simulated at start)
            long startTime = System.nanoTime();
            hashSet.remove(0); // Removing the first element (conceptually)
            long endTime = System.nanoTime();
            System.out.println("Delete at Start: " + (endTime - startTime) + " ns");

            // Measure time for deleting an element (simulated in middle)
            startTime = System.nanoTime();
            hashSet.remove(size / 2); // Removing a middle element (conceptually)
            endTime = System.nanoTime();
            System.out.println("Delete at Middle: " + (endTime - startTime) + " ns");

            // Measure time for deleting an element (simulated at end)
            long startTimeEnd = System.nanoTime();
            hashSet.remove(size - 1); // Removing the last element (conceptually)
            long endTimeEnd = System.nanoTime();
            System.out.println("Delete at End: " + (endTimeEnd - startTimeEnd) + " ns");
        }
    }
}
