public class leftRotateArray {
    public static void rotate(int arr[]) {
        for(int i = 1; i < arr.length; i++) {
            int temp = arr[i];
            arr[i] = arr[i-1];
            arr[i-1] = temp;
        }
    }
    public static void main(String args[]) {
        int arr[] = {1, 2, 3, 4, 5};
        rotate(arr);
        for(int i = 0; i < arr.length; i++) {
            System.out.print(arr[i]+ " ");
        }
    }
}


public class Hello {
    public static void rotate(int arr[]) {
        int temp = arr[0];
        for(int i = 1; i < arr.length; i++) {
            arr[i-1] = arr[i];
        }
        arr[arr.length-1] = temp;
    }
    public static void main(String args[]) {
        int arr[] = {1, 2, 3, 4, 5};
        rotate(arr);
        for(int i = 0; i < arr.length; i++) {
            System.out.print(arr[i]+ " ");
        }
    }
}