
package java_assignments;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

 class ShuffleArray {
    public static void main(String[] args) {
        Integer[] array = {1, 2, 3, 4, 5, 6, 7};

        List<Integer> list = Arrays.asList(array);
        Collections.shuffle(list);

        // Convert the shuffled list back to an array if needed
        Integer[] shuffledArray = list.toArray(new Integer[0]);

        for (int num : shuffledArray) {
            System.out.print(num + " ");
        }
    }
}
