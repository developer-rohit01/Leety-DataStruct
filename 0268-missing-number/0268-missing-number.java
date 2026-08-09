class Solution {
    public int missingNumber(int[] nums) {
       int len=nums.length;
       
       int actSum = (len*(len+1))/2;
       int currSum = 0;

       for(int i = 0; i<len; i++){
        currSum = currSum + nums[i];
       }
       return actSum - currSum;
    }
}