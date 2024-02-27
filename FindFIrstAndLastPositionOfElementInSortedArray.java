class Solution {
    public int[] searchRange(int[] nums, int target) {
        int left =0;
        int right = nums.length-1;
        boolean flag = false;
        int mid = (left+right)/2;
        while(left <= right){
            if(nums[mid]==target){
                flag = true;
                break;
            }
            if(nums[mid]>target){
                right = mid-1;
            }else{
                left = mid+1;
            }
            mid = (left+right)/2;
        }
        if(!flag){
            return new int[] {-1,-1};
        }
        for(;left<right;left++){
            if(nums[left] == target){
                break;
            }
        }
        for(;left<right;right--){
            if(nums[right] == target){
                break;
            }
        }
        return new int[] {left,right};
}
}