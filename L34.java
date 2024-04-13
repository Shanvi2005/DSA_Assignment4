class Solution {
    public int[] searchRange(int[] nums, int target) {
        int[] output = {-1, -1}; 
        int firstIndex = binarySearch(nums, target, true); 
        int lastIndex = binarySearch(nums, target, false); 
        output[0] = firstIndex;
        output[1] = lastIndex;
        return output;
    }
    public int binarySearch(int[] nums, int target, boolean findFirst){
        int result = -1; 
        int left = 0;
        int right = nums.length - 1;

        while(left <= right){
            int mid = left + (right - left) / 2;
            if (target > nums[mid]){
                left = mid + 1; 
            } else if(target < nums[mid]){
                right = mid - 1; 
            } else { 
                result = mid;
                if(findFirst){
                    right = mid - 1;
                } else { 
                    left = mid + 1; 
                }
            }
        }
        return result;
    }
}
