import java.util.*;
import java.io.*;

public class test {
    public static void main(String[] args) throws IOException {
        Scanner in = new Scanner(new File("day1.txt"));
        String numbers = "0123456789";
        String[] words = {"one", "two", "three", "four", "five", "six", "seven", "eight", "nine"};
        int sum = 0;
        String hold = "";
        int input = 0;
        boolean firstCheck = true;
        while(in.hasNextLine()) {
            String first = "0";
            String last = "0";
            String line = in.nextLine();
            String sline = line.substring(0);
            for (int i = 0; i < line.length(); i++)
            {
                String check = line.substring(i, i+1);
                if (firstCheck && numbers.indexOf(check) > -1)
                {
                    first = check;
                    last = check;
                    firstCheck = false;
                }
                else if (firstCheck)
                {
                    //System.out.println("Check");
                    int index = 0;
                    int number = 1;
                    boolean foundNum = false;
                    while(!foundNum)
                    {
                        number = sline.indexOf(words[index]);
                        index += 1;
                        if (number == 0 )
                        {
                            foundNum = true;
                            break;
                        }
                        if (index == 9)
                        {
                            index = 0;
                            sline = sline.substring(1);
                            i++;
                            break;
                        }
                        if (sline.length() == 1)
                        {
                            foundNum = true;
                            break;
                        }
                    }
                    number = index;
                    first = number + "";
                    last = number + "";
                    if (sline.length() == 1)
                    {
                        first = sline.substring(0,1) + "";
                        last = sline.substring(0,1) + "";
                    }
                    firstCheck = false;
                    sline = sline.substring(words[index].length() - 1);
                    i = words[index].length() - 1;

                }
                else if (firstCheck == false && numbers.indexOf(check) > -1) 
                {
                    last = check;
                }
                else if (firstCheck == false)
                {
                    int index = 0;
                    int number = 1;
                    boolean foundNum = false;
                    while(!foundNum)
                    {
                        number = sline.indexOf(words[index]);
                        System.out.print(index);
                        System.out.print(" " + number);
                        System.out.println(" " + sline);
                        index += 1;
                        if (number == 0)
                        {
                            foundNum = true;
                            sline = sline.substring(1);
                            i++;
                            input = index;
                        }
                        if (index == 9)
                        {
                            index = 0;
                            sline = sline.substring(1);
                            i++;
                            break;
                        }
                        if (sline.length() == 0)
                        {
                            break;
                        }

                    }
                    number = input;
                    last = number + "";
                }
                hold = first + last;
            }
            System.out.println(hold);
            firstCheck = true;
            sum += Integer.parseInt(hold);
        }
        System.out.println(sum);
    }
}