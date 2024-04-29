import java.util.*;

public class april {
       public static void main(String[] args)
       {
        int index = 100000;
        int pCount = 0;
        long oCount = 0;
        // Formula is n(3n-1)/2, start at 2nd index (2nd term)
        ArrayList<Long> penta = new ArrayList<Long>();
        for (long i = 2; i <= index; i++)
        {
            Long add = (i*((3*i) - 1))/2;
            penta.add(add);
            //System.out.print(add + " ");
        }
        // Formula is n(3n-2), start at 1st index (2nd term)
        System.out.println();
        ArrayList<Long> octa = new ArrayList<Long>();
        for (long i = 2; i <= index; i++)
        {
            Long add = i*(3*i - 2);
            octa.add(add);
            oCount++;
            //System.out.print(add + " ");
        }
        // Star value forumula is "Digit + oCount"
        //System.out.println();
        for(int r = 0; r < octa.size(); r++)
        {
            for(int c = 0; c < penta.size(); c++)
            {
                //System.out.println(r + " " + c);
                // Integer DOESNT AUTOBOX in this case, for some reason (idk why)
                // had it at ==
                if(penta.get(r).equals(octa.get(c)))
                {
                    pCount++;
                    System.out.println(pCount + " " + penta.get(r) + " " + oCount);
                }
            }
        }
       }
       
}
