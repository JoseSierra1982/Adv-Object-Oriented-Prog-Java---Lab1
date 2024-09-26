public class ArrayTimeComplexity_remove
{
    public static void main(String[] args) {
        // Test for different sizes of arrays
        for (int size = 1000; size <= 1000000; size *= 10) {
            int[] array = new int[size];

            // Fill the array with integers
            for (int i = 0; i < size; i++) {
                array[i] = i;
            }

            // Delete at Start
            long startTime = System.nanoTime();
            int[] newArrayAfterDeleteStart = new int[size - 1];
            System.arraycopy(array, 1, newArrayAfterDeleteStart, 0, size - 1); // Deleting from the start
            long endTime = System.nanoTime();
            System.out.println("Delete at Start: " + (endTime - startTime) + " ns");

            // Delete at Middle
            startTime = System.nanoTime();
            int[] newArrayAfterDeleteMiddle = new int[size - 1];
            int midIndex = size / 2;
            System.arraycopy(array, 0, newArrayAfterDeleteMiddle, 0, midIndex);
            System.arraycopy(array, midIndex + 1, newArrayAfterDeleteMiddle, midIndex, size - midIndex - 1); // Deleting from the middle
            endTime = System.nanoTime();
            System.out.println("Delete at Middle: " + (endTime - startTime) + " ns");

            // Delete at End
            startTime = System.nanoTime();
            int[] newArrayAfterDeleteEnd = new int[size - 1];
            System.arraycopy(array, 0, newArrayAfterDeleteEnd, 0, size - 1); // Deleting from the end
            endTime = System.nanoTime();
            System.out.println("Delete at End: " + (endTime - startTime) + " ns");
        }
    }
}
