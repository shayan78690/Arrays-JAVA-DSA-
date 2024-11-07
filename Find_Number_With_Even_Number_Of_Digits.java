import java.util.*;

public class Find_Number_With_Even_Number_Of_Digits {
    public static void main(String args[]) {
        int nums[] = {12, 345, 2, 6, 7896};
        System.out.println(findNumber(nums));
    }

    public static int findNumber(int nums[]) {
        int count = 0;
        for(int num : nums) {
            if(even(num)) {
                count++;
            }
        }
        return count;
    }

    public static boolean even(int num) {
        int number_of_digit = digits(num);
        if(number_of_digit % 2 == 0) {
            return true;
        }
        return false;
    }

    public static int digits(int num) {
        int count = 0;
        while(num > 0) {
            count++;
            num = num /10;
        }
        return count;
    }
}
