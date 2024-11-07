public class MoveZeroesToEnd {
    public static void move(int arr[]) {
        int j = -1;
        for(int i = 0; i < arr.length; i++) {
            if(arr[i] == 0) {
                j = i;
                break;
            }
        }
        for(int i = j + 1; i < arr.length; i++) {
            if(arr[i] != 0) {
                int temp = arr[i];
                arr[i] = arr[j];
                arr[j] = temp;
                j++;
            }
        }
    }
    
    public static void main(String args[]) {
        int arr[] = {1, 0, 2, 3, 2, 0, 0, 4, 5, 1};
        move(arr);
        for(int i = 0; i < arr.length; i++) {
            System.out.print(arr[i]+ " ");
        }
    }
}


public class Hello {
    
    public static void move(int arr[]) {
        int j = Integer.MAX_VALUE;
        for(int i = arr.length-1; i >=0; i--) {
            if(arr[i] == 0) {
                j = i;
                break;
            }
        }
        for(int i = j-1;i >= 0; i--) {
            if(arr[i] != 0) {
                int temp = arr[i];
                arr[i] = arr[j];
                arr[j] = temp;
                j--;
            }
        }
    }
    
    public static void main(String args[]) {
        int arr[] = {1, 0, 2 ,3, 2, 0, 0, 4, 5, 1};
        move(arr);
        System.out.println("Moving Zeroes to the Start ");
        for(int i = 0; i < arr.length; i++) {
            System.out.print(arr[i]+" ");
        }
    }
}


/*
class Solution {
    public void moveZeroes(int[] nums) {
         int j = 0;  // Pointer to keep track of where to move the next non-zero element
        
        // First pass: Move all non-zero elements to the front
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] != 0) {
                nums[j] = nums[i];
                j++;
            }
        }
        
        // Second pass: Fill the remaining part of the array with zeros
        for (int i = j; i < nums.length; i++) {
            nums[i] = 0;
        }
    }
}
 */
