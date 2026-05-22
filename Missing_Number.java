class Missing_Number {
  public static void main(String[] args) {
     Missing_Number s = new Missing_Number();
    int[] num = {3,0,1};
    s.MissingNumber(num);
  }

    public int MissingNumber(int[] nums) {
        int range = nums.length;
        int actualSum =  (range * (range + 1))/2;
        int currSum = 0 ;
        for(int i=0;i<nums.length;i++){
            currSum = currSum + nums[i];
        }
        int ans = actualSum - currSum ;
         System.out.println(ans);
        return ans;
       
    }
}