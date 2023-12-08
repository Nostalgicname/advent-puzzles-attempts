import java.util.*;
import java.io.*;

public class day4 {
    public static void main(String[] args) throws IOException {
        Scanner in = new Scanner(new File("day4.txt"));
        int matchAmount = 0;
        // Scoring : First win is one point, doubled after each win.
        // 1 = 1, 2 = 2, 3 = 4, 4 = 8, 5 = 16...
        while(in.hasNextLine()) {
            String line = in.nextLine();
            String winning = line.substring(10,25); // Puzzle input ends at 39
            String playing = line.substring(27); // Puzzle input starts at 42
            int winningIndex = 0; // Separate index to add into arrays
            int playingIndex = 0; // same as above
            int[] winningArray = new int[winning.length()];
            int[] playingArray = new int[playing.length()];

            // For loops increment by 3, end 2 before the length, and the substring is (i, i+2)
            // Integer.valueOf(x.substring(i, i+2).trim())

            // Creating arrays
            for (int i = 0; i < winning.length() - 2; i += 3)
            {
                winningArray[winningIndex] = Integer.valueOf(winning.substring(i, i+2).trim());
                winningIndex++;
            }
            
            for (int i = 0; i < playing.length() - 2; i += 3)
            {
                playingArray[playingIndex] = Integer.valueOf(playing.substring(i, i+2).trim());
                playingIndex++;
            }

            // Checking numbers
            for (int win = 0; win < winningArray.length; win++)
            {
                for(int play = 0; play < playingArray; play++)
                {

                }
            }
        }
    }
}