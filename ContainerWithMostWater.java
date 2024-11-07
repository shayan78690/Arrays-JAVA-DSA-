public class Hello {
    
    public static int maxArea(int height[]) {
        int maxWater = 0;
        for(int i = 0; i < height.length; i++) {
            for(int j = i+1; j < height.length; j++) {
                int w = j-1;
                int ht = Math.min(height[i], height[j]);
                int currentWater = w * ht;
                maxWater = Math.max(currentWater, maxWater);
            }
        }
        return maxWater;
    }
    
    public static void main(String args[]) {
        int height[] = {1, 8, 6, 2, 5, 4, 8, 3, 7};
        System.out.println(maxArea(height));
    }
}





public class Hello {
    
    public static int maxArea(int height[]) {
        int maxWater = 0;
        int lp = 0;
        int rp = height.length-1;
        while(lp < rp) {
            int w = rp - lp;
            int ht = Math.min(height[lp], height[rp]);
            int currentWater = w * ht;
            maxWater = Math.max(maxWater, currentWater);
            if(height[lp] < height[rp]) {
                lp++;
            }
            else {
                rp--;
            }
        }
        return maxWater;
    }
    
    public static void main(String args[]) {
        int height[] = {1, 8, 6, 2, 5, 4, 8, 3, 7};
        System.out.println(maxArea(height));
    }
}
