class Solution {
    public int maxArea(int[] height) {

        int maxCap=0;
        int i=0;
        int j=height.length-1;

        while(i<j){
            maxCap=Math.max(maxCap, getCapacity(i,j,height));
            if(height[i]<=height[j]){
                // int temp=height[i];
                // while(height[i]<temp && i<j){i++;}
                i++;
            }
            else if(height[i]>height[j]){
                // int temp=height[j];
                // while(height[j]<temp && j>i){j--;}
                j--;
            }
        }

        System.out.println(maxCap);
        return maxCap;
        
    }

    public int getCapacity(int i, int j, int[] height){
        return (j-i)* Math.min(height[i],height[j]);
    }
}