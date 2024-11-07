import java.util.*;

 public class Max_Subarry_Kadanes_Algorithm {
     
     public static void kadanes(int numbers[]) {
        int current_sum = 0;
        int max_sum = Integer.MIN_VALUE;
        for(int i = 0; i < numbers.length; i++) {
            current_sum = current_sum + numbers[i];
            if(current_sum < 0) {
                current_sum = 0;
            }
            max_sum = Math.max(current_sum, max_sum);
        }
        System.out.println("Maximum Sum = " + max_sum);
     }
     
     public static void main(String args[]) {
         int numbers[] = {-2, -3, 4, -1, -2, 1, 5, -3};
         kadanes(numbers);
     }
 }


 /*
  import java.util.*;

 public class Max_Subarry_Kadanes_Algorithm {
     
     public static void kadanes(int numbers[]) {
        int current_sum = 0;
        int max_sum = Integer.MIN_VALUE;
        for(int i = 0; i < numbers.length; i++) {
            current_sum = current_sum + numbers[i];
            if(current_sum < 0) {
                current_sum = 0;
            }
            System.out.println(current_sum);
            max_sum = Math.max(current_sum, max_sum);
        }
        System.out.println("Maximum Sum = " + max_sum);
     }
     
     public static void main(String args[]) {
         int numbers[] = {-2, -3, 4, -1, -2, 1, 5, -3};
         kadanes(numbers);
     }
 }
  */


//  import java.util.*;

//  public class Max_Subarry_Kadanes_Algorithm {
     
//      public static void kadanes(int numbers[]) {
//         int current_sum = 0;
//         int min_sum = Integer.MAX_VALUE;
//         for(int i = 0; i < numbers.length; i++) {
//             current_sum = current_sum + numbers[i];
        
           
//             min_sum = Math.min(current_sum, min_sum);
//         }
//         System.out.println("Minimum Sum = " + min_sum);
//      }
     
//      public static void main(String args[]) {
//          int numbers[] = {-1, -2, -3, -4};
//          kadanes(numbers);
//      }
//  }

/*import java.util.*;

public class Arrays{
    
    public static void kadanes(int numbers[]) {
        int cs = 0;
        int ms = Integer.MIN_VALUE;
        int MS = Integer.MAX_VALUE;
        
        for(int i = 0; i < numbers.length; i++) {
            cs = cs + numbers[i];
            System.out.println(cs);
            
            if(cs < 1) {
                cs = 0;
            }
            ms = Math.max(ms, cs);
            MS = Math.min(MS, cs);
        }
        System.out.println("MAXIMUM SUM = " + ms);
        System.out.println("MINIMUM SUM = " + MS);
    } 
    
    public static void main(String args[]) {
        int numbers[] = {1, 3, -4, 7, 9, -3, -9, 10};
        kadanes(numbers);
    }
} */


/*import java.util.*;

public class Arrays{
    
    public static void kadanes(int numbers[]) {
        int cs = 0;
        int ms = Integer.MIN_VALUE;
        int MS = Integer.MAX_VALUE;
        
        for(int i = 0; i < numbers.length; i++) {
            cs = cs + numbers[i];
            System.out.println(cs);
            
            
            ms = Math.max(ms, cs);
            MS = Math.min(MS, cs);
        }
        System.out.println("SMALLEST SUM = " + ms);
        System.out.println("LARGEST SUM = " + MS);
    } 
    
    public static void main(String args[]) {
        int numbers[] = {-1, -2, -4, -7, -19, -3, -9, -10};
        kadanes(numbers);
    }
} */