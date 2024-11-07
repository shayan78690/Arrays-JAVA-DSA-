// public class CheckForSorted {
//     class Solution {
//         public static boolean check(int[] nums) {
//             int n = nums.length;
//             for(int i = 0; i < n; i++) {
//                 for(int j = i+1; j < n; j++) {
//                     if(nums[i] > nums[j]) {
//                         return false;
//                     }
//                 }
//             }
//             return true;
//         } 
//         public static void main(String args[]) {
//             int nums[] = {1, 3, 7, 2, 5};
//             System.out.println(check(nums));
//         }
//     }
// }



// class TUF {
//     public static boolean isSorted(int arr[], int n) {
//       for (int i = 1; i < n; i++) {
//         if (arr[i] < arr[i - 1])
//           return false;
//       }
  
//       return true;
//     }
  
//     public static void main(String args[]) {
//       int arr[] = {1, 2, 3, 4, 5}, n = 5;
  
//       System.out.println(isSorted(arr, n));
//     }
//   }


//Leetcode
/*
The final keyword in Java is used to restrict and define entities that cannot be changed or modified
class Solution {
  public boolean check(int[] nums) {
    final int n = nums.length;
    int rotates = 0;

    for (int i = 0; i < n; ++i)
      if (nums[i] > nums[(i + 1) % n] && ++rotates > 1)
        return false;

    return true;
  }
}
 */