import java.util.ArrayList;

public class ArrayListTimeComplexity_remove {
    public static void main(String[] args) {
        for (int size = 1000; size <= 1000000; size *= 10) {
            ArrayList<Integer> arrayList = new ArrayList<>();

            // Fill the ArrayList
            for (int i = 0; i < size; i++) {
                arrayList.add(i);
            }

            // Delete at Start
            long startTime = System.nanoTime();
            arrayList.remove(0); // Deleting from the start
            long endTime = System.nanoTime();
            System.out.println("Delete at Start: " + (endTime - startTime) + " ns");

            // Delete at Middle
            startTime = System.nanoTime();
            arrayList.remove(size / 2); // Deleting from the middle
            endTime = System.nanoTime();
            System.out.println("Delete at Middle: " + (endTime - startTime) + " ns");

            // Delete at End
            startTime = System.nanoTime();
            arrayList.remove(arrayList.size() - 1); // Deleting from the end
            endTime = System.nanoTime();
            System.out.println("Delete at End: " + (endTime - startTime) + " ns");
        }
    }
}
