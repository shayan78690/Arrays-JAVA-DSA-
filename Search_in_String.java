import java.util.*;

public class Search_in_String {

    public static boolean search(String name, char target) {
        for(int i = 0; i < name.length(); i++) {
            if(target == name.charAt(i)) {
                return true;
            }
        }
        return false;
    }
    public static void main(String args[]) {
        String name = "Shayan";
        char target = 'y';
        System.out.println(search(name, target));
    }
}
