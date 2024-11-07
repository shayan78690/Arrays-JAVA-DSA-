// import java.util.*;

// public class Contains_Duplicate {     
//     public static boolean Duplicate(int nums[]) {
//         for(int i = 0; i < nums.length; i++) {
//             for(int j = i+1; j < nums.length; j++) {
//                 if(nums[i] == nums[j]) {
//                     return true;
//                 }
//             }
//         }
//         return false;
//     }
    
//     public static void main(String args[]) {
//         int nums[] = {1, 2, 3, 1};
//         System.out.println(Duplicate(nums));
//     } 
// }

import java.util.*;
import java.util.Collections;
public class Contains_Duplicate {
    public static boolean Duplicate(int nums[]) {
        Arrays.sort(nums);  // O(n log n)
                
        for (int i = 1; i < nums.length; i++) {
            if (nums[i] == nums[i - 1]) {
                return true;  // Duplicate found
            }
        }
        
        return false;  // No duplicates found
    }


    public static void main(String args[]) {
        int nums[] = {1, 2, 3, 1};
        System.out.println(Duplicate(nums));
    }
}