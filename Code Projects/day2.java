
public class day2 {
    public static void main(String[] args){
        int[] arr = {1,2,3,4,5};
        
        int sum = arr[0];
        int i = 0;
        while (i < arr.length - 1)
        {
            i++;
            System.out.println(i);
            sum += arr[i];
        }

        }
    }