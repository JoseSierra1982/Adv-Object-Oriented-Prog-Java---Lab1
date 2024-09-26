import java.util.ArrayList;

public class ArrayListTimeComplexity_add
{
    public static void main(String[] args)
    {
        for (int size = 1000; size <= 1000000; size *= 10) {
            ArrayList<Integer> arrayList = new ArrayList<>();
            // Fill the ArrayList
            for (int i = 0; i < size; i++) 
            {
                arrayList.add(i);
            }
            // Insert at Start
            long startTime = System.nanoTime();
            arrayList.add(0, -1); // Inserting at the start
            long endTime = System.nanoTime();
            System.out.println("Insert at Start: " + (endTime - startTime) + " ns");
            // Insert at Middle
            startTime = System.nanoTime();
            arrayList.add(size / 2, -1); // Inserting in the middle
            endTime = System.nanoTime();
            System.out.println("Insert at Middle: " + (endTime - startTime) + " ns");
            // Insert at End
            startTime = System.nanoTime();
            arrayList.add(-1); // Inserting at the end
            endTime = System.nanoTime();
            System.out.println("Insert at End: " + (endTime - startTime) + " ns");
        }
    }
}


