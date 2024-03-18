
import java.util.*;

public class puzzle{
    public static void main(String[] args)
    {
        // Original Sequence : 1, 2, 3 ,6, 12, 15, 21, 24, 30, 33, 39, 51, 57, 69, 84
        // Unsure about first few, but take each digit's sum and add them for the next term
        // 12 is 1 + 2, so 12 + 3 = 15. 5 + 7 = 12 so 57 + 12 = 69
        ArrayList<Integer> seq = new ArrayList<Integer>(Arrays.asList(1, 2, 3, 6, 12, 15, 21, 24, 30, 33, 39, 51, 57, 69, 84));
        

        // for (int i = 0; i < 86; i++)
        // {
        //     int sum = 0;
        //     String number = seq.get(i) + "";
        //     for (int x = number.length(); x > 0; x--)
        //     {
        //         if (x > 0){
        //             sum += seq.get(seq.size()-1) / 10;
        //         }
        //         else{
        //         sum += seq.get(seq.size()-1) % 10;
        //         }
        //     }
        //     seq.add(sum);
        // }
        // System.out.println(seq.get(100));
        // System.out.println(seq);
        int test = 1131;
        String testString = test + "";
        for (int i = 0; i < testString.length(); i++)
        {
            System.out.println(test % 10);
            test /= 10;
        }
    }
}