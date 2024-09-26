public class ArrayTimeComplexity_add
{
    public static void main(String[] args) {
        // Test for different sizes of arrays
        for (int size = 1000; size <= 1000000; size *= 10) {
            int[] array = new int[size];

            // Fill the array with integers
            for (int i = 0; i < size; i++) {
                array[i] = i;
            }

            // Insert at Start
            long startTime = System.nanoTime();
            int[] newArrayStart = new int[size + 1];
            newArrayStart[0] = -1; // Inserting at the start
            System.arraycopy(array, 0, newArrayStart, 1, size);
            long endTime = System.nanoTime();
            System.out.println("Insert at Start: " + (endTime - startTime) + " ns");

            // Insert at Middle
            startTime = System.nanoTime();
            int[] newArrayMiddle = new int[size + 1];
            int midIndex = size / 2;
            System.arraycopy(array, 0, newArrayMiddle, 0, midIndex);
            newArrayMiddle[midIndex] = -1; // Inserting in the middle
            System.arraycopy(array, midIndex, newArrayMiddle, midIndex + 1, size - midIndex);
            endTime = System.nanoTime();
            System.out.println("Insert at Middle: " + (endTime - startTime) + " ns");

            // Insert at End
            startTime = System.nanoTime();
            int[] newArrayEnd = new int[size + 1];
            System.arraycopy(array, 0, newArrayEnd, 0, size);
            newArrayEnd[size] = -1; // Inserting at the end
            endTime = System.nanoTime();
            System.out.println("Insert at End: " + (endTime - startTime) + " ns");
        }
    }
}
