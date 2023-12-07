import java.util.*;
import java.io.*;

public class day2 {
    public static void main(String[] args) throws IOException {
        Scanner in = new Scanner(new File("day2.txt"));

        while(in.hasNextLine()) {
            String line = in.nextLine();
            System.out.println(line);
        }
    }
}