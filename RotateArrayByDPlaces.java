public class Hello {
    public static void leftRotate(int arr[], int d) {
        int n = arr.length;
        d = d % n;
        int temp[] = new int[d];
        for(int i = 0; i < d; i++) {
            temp[i] = arr[i];
        }
        
        for(int i = d; i < n; i++) {
            arr[i-d] = arr[i];
        }
        
        for(int i = n-d; i < n; i++) {
            arr[i] = temp[i - (n-d)];
        }
    }
    public static void main(String args[]) {
        int arr[] = {1, 2, 3, 4, 5, 6, 7};
        int d = 3;
        leftRotate(arr, d);
        System.out.println("Array After Rotation : ");
        for(int i = 0; i < arr.length; i++) {
            System.out.print(arr[i]+" ");
        }
        System.out.println();
    }
}


class Solution {
    public void rotate(int[] nums, int k) {
        k = k % nums.length;  // Handle cases where k is greater than the array length
        reverse(nums, 0, nums.length - 1);  // Reverse the entire array
        reverse(nums, 0, k - 1);  // Reverse the first k elements
        reverse(nums, k, nums.length - 1);  // Reverse the remaining elements
    }
    
    private void reverse(int[] nums, int start, int end) {
        while (start < end) {
            int temp = nums[start];
            nums[start] = nums[end];
            nums[end] = temp;
            start++;
            end--;
        }
    }
}

class Solution {
    public void rotate(int[] nums, int k) {
        k = k % nums.length;
        int temp[] = new int[k];
        
        // Store the last k elements in temp
        for (int i = 0; i < k; i++) {
            temp[i] = nums[nums.length - k + i];
        }
        
        // Shift the remaining elements to the right
        for (int i = nums.length - k - 1; i >= 0; i--) {
            nums[i + k] = nums[i];
        }
        
        // Copy the last k elements back to the start
        for (int i = 0; i < k; i++) {
            nums[i] = temp[i];
        }
    }
}
