import java.util.*;

public class main{

    public static void update(int arr[]) {
        for(int i = 0; i < arr.length; i++) {
            arr[i] += 1;
        }
    }

    public static int linear_search(int arr[], int key) {
        for(int i = 0; i < arr.length; i++) {
            if(arr[i] == key) {
                return i;
            }
        }
        return -1;
    }

    public static int check(int arr[]) {
        int largest = Integer.MIN_VALUE;
        int smallest = Integer.MAX_VALUE;
        for(int i = 0; i < arr.length; i++) {
            if(largest < arr[i]) {
                largest = arr[i];
            }
            if(smallest > arr[i]) {
                smallest = arr[i];
            }
        }
        System.out.println("Smallest Number = " + smallest);
        return largest;
    }

    public static int binary_search(int arr[], int key) {
        int start = 0;
        int end = arr.length-1;
        while(start <= end) {
            int mid = (start + end) / 2;
            if(key == arr[mid]) {
                return mid;
            }
            if(key < arr[mid]) {
                start = mid + 1;
            }
            else{
                end = mid - 1;
            }
        }
        return -1;
    }

    public static void reverse(int arr[]) {
        int first = 0;
        int last = arr.length-1;
        while(first < last) {
            int temp = arr[first];
            arr[first] = arr[last];
            arr[last] = temp;

            first++;
            last--;
        }
    }

    public static void pairs(int arr[]) {
        for(int i = 0; i < arr.length; i++) {
            int current = arr[i];
            for(int j = i+1; j < arr.length; j++) {
                System.out.print("(" + current + ", " + j + ") ");
            }
            System.out.println();
        }
    }

    public static void sub_array(int arr[]) {
        int max_sub_arry = Integer.MIN_VALUE;
        int current_sum = 0;
        for(int i = 0; i < arr.length; i++) {
            int start = i;
            for(int j = i; j < arr.length; j++) {
                int end = j;
                current_sum = 0;
                for(int k = start; k <= end; k++) {
                    current_sum += arr[k];
                }
                System.out.println(current_sum);
                if(max_sub_arry < current_sum) {
                    max_sub_arry = current_sum;
                }

            }
        }
        System.out.println("Maximum Sum = " + max_sub_arry);
    }

    public static void prefix_sum(int arr[]) {
        int n = arr.length;
        int current_sum = 0;
        int max_sum = Integer.MIN_VALUE;
        int prefix[] = new int[n];
        prefix[0] = arr[0];
        for(int i = 1; i < prefix.length; i++) {
            prefix[i] = arr[i] + prefix[i-1];
            System.out.println(prefix[i]);
        }

        for(int i = 0; i < arr.length; i++) {
            int start = i;
            for(int j = i; j < arr.length; j++) {
                int end = j;
                current_sum = start == 0? prefix[end] : prefix[end] - prefix[start-1];
                if(max_sum < current_sum) {
                    max_sum = current_sum;
                }
            }
        }
        System.out.println("Maximum Sum = " + max_sum);
    }

    public static void kadanes(int arr[]) {
        int max_sum = Integer.MIN_VALUE;
        int current_sum = 0;
        for(int i = 0; i < arr.length; i++) {
            current_sum += arr[i];
            if(current_sum < 0) {
                current_sum = 0;
            }
            max_sum = Math.max(current_sum, max_sum);
        }
        System.out.println("Maximum Sum = " + max_sum);
    }

    public static int trapped_water(int height[]) {
        int n = height.length;
        int left_max[] = new int[n];
        left_max[0] = height[0];
        for(int i = 1; i < n; i++) {
            left_max[i] = Math.max(height[i], left_max[i-1]);
        }

        int right_max[] = new int[n];
        right_max[n-1] = height[n-1];
        for(int i = n-2; i >= 0; i--) {
            right_max[i] = Math.max(height[i], right_max[i+1]);
        }

        int trappedWater = 0;
        for(int i = 0; i < n; i++) {
            int water_level = Math.min(left_max[i], right_max[i]);
            trappedWater += water_level - height[i];
        }
        return trappedWater;
    }

    public static int buy_and_sell_stocks(int prices[]) {
        int buy_price = Integer.MAX_VALUE;
        int max_profit = 0;
        for(int i = 0; i < prices.length; i++) {
            if(buy_price < prices[i]) {
                int profit = prices[i] - buy_price;
                max_profit = Math.max(profit, max_profit);
            }
            else{
                buy_price = prices[i];
            }
        }
        return max_profit;
    }

    public static boolean verify(int arr[]) {
        for(int i = 0; i < arr.length; i++) {
            for(int j = i+1; j < arr.length; j++) {
                if(arr[i] == arr[j]) {
                    return true;
                }
            }
        }
        return false;
    }

    public static int rotated_sorted_array(int nums[], int target) {
        int start = 0;
        int end = nums.length-1;
        while(start <= end) {
            int mid = (start+end) / 2;
            if(target == nums[mid]) {
                return mid;
            }
            
            if(nums[start] <= nums[mid]) {
                if(nums[start] <= target && target <= nums[mid]) {
                    end = mid - 1;
                }
                else{
                    start = mid + 1;
                }
            }
            else{
                if(nums[end] >= target && target >= nums[mid]) {
                    start = mid + 1;
                }
                else{
                    end = mid - 1;
                }
            }
        }
        return -1;
    }
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int nums[] = {4, 5, 6, 7, 0, 1, 2};
        int target = 7;
        System.out.println(rotated_sorted_array(nums, target));
        }
}