public class MissingNumber {

    public static int missingNumber(int arr[], int N) {
        int flag;
        for(int i = 0; i < N; i++) {
            flag = 0;
            for(int j = 0; j < arr.length; j++) {
                if(arr[j] == i) {
                    flag = 1;
                    break;
                }
            }
            if(flag == 0) {
                return i;
            }
        }
        return -1;
    }
    public static void main(String args[]) {
        int arr[] = {1, 2, 4, 5};
        int N = 5;
        System.out.println(missingNumber(arr, N));
    }
}


//LeetCode
class Solution {
    public int missingNumber(int[] nums) {
        int n = nums.length; 
        int sum = (n*(n+1))/2;
        int s2 = 0;
        for(int i = 0; i < nums.length; i++) {
            s2 += nums[i]; 
        }
        int MissingNumber = sum - s2;
        return MissingNumber;
    }
}

public class Hello {
    
    public static int missingNumber(int arr[], int N) {
        int XOR1 = 0;
        for(int i = 1; i <= N; i++) {
            XOR1 = XOR1 ^ i;
        }
        int XOR2 = 0;
        for(int i = 0; i < N-1; i++) {
            XOR2 = XOR2 ^ arr[i];
        }
        return (XOR1 ^ XOR2);
    }
    
    public static void main(String args[]) {
        int arr[] = {1, 2, 4, 5};
        int N = 5;
        System.out.println(missingNumber(arr, N));
    }
}

