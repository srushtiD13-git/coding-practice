class Solution {
    public int maxArea(int[] height) {

        int maxCap=0;
        int i=0;
        int j=height.length-1;

        while(i<j){
            maxCap=Math.max(maxCap, ((j-i)* Math.min(height[i],height[j])));
            if(height[i]<=height[j]){
                
                int temp=height[i];
                i++;
                while(height[i]<temp && i<j){i++;}
                
            }
            else if(height[i]>height[j]){
                
                int temp=height[j];
                j--;
                while(height[j]<temp && j>i){j--;}
                
            }
        }

        //System.out.println(maxCap);
        return maxCap;
        
    }

    
}