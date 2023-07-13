class Solution {
    public int maxArea(int[] height) {
        int left=0;
        int res=0;
        int right=height.length-1;
        while(left<right){
            int container_height=right-left;
            int area=container_height * Math.min(height[left], height[right]);
            res= Math.max(res,area);
            if(height[left]<height[right]){
                left++;
            }
            else{
                right--;
            }
        }
        return res;
    }
}
