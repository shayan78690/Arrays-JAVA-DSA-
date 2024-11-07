import java.util.*;
public class Hello{
    public static void main(String args[]) {
        int n;
        Scanner sc =  new Scanner(System.in);
        System.out.println("Enter the size of array : ");
        n = sc.nextInt();
        
        int marks[] = new int[n];
        for(int i = 0; i < n; i++) {
            marks[i] = sc.nextInt();
        }
        
        System.out.println("Array Elements are : ");
        for(int i = 0; i < n; i++) {
            System.out.print(marks[i] + " ");
        }
        System.out.println();
    }
}