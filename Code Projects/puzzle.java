
import java.util.*;

public class puzzle{
    public static void main(String[] args)
    {
        // Original Sequence : 1, 2, 3 ,6, 12, 15, 21, 24, 30, 33, 39, 51, 57, 69, 84
        // +1, +1, +1, +3, +6, +3, +6, +3, +6, +3, +6, +12, +6, +12, +15
        ArrayList<Integer> seq = new ArrayList<Integer>(Arrays.asList(1, 2, 3, 6, 12, 15, 21, 24, 30, 33, 39, 51, 57, 69, 84));
        int[] order = {1, 1, 1, 3, 6, 3, 6, 3, 6, 3, 6, 12, 6, 12, 15};
        int limit = 100;

        (for int x = 0; x <= limit/15 x++)
        {
            for (int i = 0; i < 15; i++)
            {
                seq.add(seq.size() - 1 + order[i]);
            }
        }
        System.out.print(seq.get(100));
    }
}