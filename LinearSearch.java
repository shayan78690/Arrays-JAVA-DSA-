//Linear Search
import java.util.*;
public class LinearSearch{
    public static int linearSearch(int numbers[], int key) {
        for(int i = 0; i < numbers.length; i++) {
            if(numbers[i] == key) {
                return i;
            }
        }
        return -1;
    }
    public static void main(String args[]) {
        int numbers[] = {2, 4, 6, 8, 10, 12, 14, 16};
        int key = 10;
        int index = linearSearch(numbers, key);
        if(index == -1) {
            System.out.println("Key not found");
        }
        else {
            System.out.println("Key is at index : " + index);
        }
        
    }
}
//********************************************************************************************************************************* */
// import java.util.*;
// public class Hello{
//     public static String search(String menu[], String item) {
//         for(int i = 0; i < menu.length; i++) {
//             if(menu[i] == item) {
//                 return item;
//             }
//         }
//         return "notFound";
//     }
//     public static void main(String args[]) {
//         String menu[] = {"Dosa", "CholeBhature", "Maggie", "Coke", "Samosa"};
//         Scanner sc = new Scanner(System.in);
//         System.out.println("Enter the item you want to buy : ");
//         String item = sc.next();
//         String index = search(menu, item);
//             if(index == "notFound") {
//                 System.out.println("Item not found");
//             }
//             else {
//                 System.out.println("Item found at index : " + index);
//             }
//     }
// }
