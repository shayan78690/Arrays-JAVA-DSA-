//Maximum Subarray
import java.util.*;

public class Max_Subarray{
    
    public static void max_subarray(int numbers[]) {
        int current_sum = 0;
        int max_sum = Integer.MIN_VALUE;
        for(int i = 0; i < numbers.length; i++) {
            int start = i;
            for(int  j = 0; j < numbers.length; j++) {
                int end = j;
                current_sum = 0;
                for(int k = start; k <= end; k++) {
                    current_sum = current_sum + numbers[k];
                }
                System.out.println(current_sum);
                if(max_sum < current_sum) {
                    max_sum = current_sum;
                }
            }   
            }
            System.out.println("Maximum Sum = " + max_sum);
    }
    
    public static void main(String args[]) {
        int numbers[] = {2, 4, 6, 8, 10};
        max_subarray(numbers);
    }
}
