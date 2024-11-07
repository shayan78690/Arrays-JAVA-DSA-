public class secondLargestElement {
    public static int secondLargest(int arr[]) {
        int largest = arr[0];
        for(int i = 0; i < arr.length; i++) {
            if(arr[i] > largest) {
                largest = arr[i];
            }
        }
        
        int second_largest = -1;
        for(int i = 0; i < arr.length; i++) {
            if(arr[i] > second_largest && arr[i] != largest) {
                second_largest = arr[i];
            }
        }
        return second_largest;
    }
    public static void main(String args[]) {
        int arr[] = {1, 2, 4, 7, 7, 5};
        System.out.println(secondLargest(arr));
    }
} 

//Optimal

/*public class Hello {
    public static int secondLargest(int arr[]) {
        int n = arr.length;
        int largest = arr[0];
        int second_largest = -1;
        for(int i= 1; i < n; i++) {
            if(arr[i] > largest) {
                second_largest = largest;
                largest = arr[i];
            }
            else if(arr[i] < largest && arr[i] > second_largest) {
                second_largest = arr[i];
            }
        }
        return second_largest;
    }
    
        public static int secondSmallest(int arr[]) {
            int smallest = arr[0];
            int second_smallest = Integer.MAX_VALUE;
                    int n = arr.length;
            for(int i = 1; i < n; i++) {
                if(arr[i] < smallest) {
                    second_smallest = smallest;
                    smallest = arr[i];
                }
                else if(arr[i] > smallest && arr[i] < second_smallest) {
                    second_smallest = arr[i];
                }
            }
            return second_smallest;
    }
    
    public static void main(String args[]) {
        int arr[] = {1, 2, 4, 7, 5};
        int second_largest = secondLargest(arr);
        int second_smallest = secondSmallest(arr);
        System.out.println(second_largest);
        System.out.println(second_smallest);
    }
}  */