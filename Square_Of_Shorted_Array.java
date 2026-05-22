public class Square_Of_Shorted_Array {

  public static void main(String[] args) {
    Square_Of_Shorted_Array s = new Square_Of_Shorted_Array();
    int[] num = {-4,-1,0,3,10};
    s.sortedSquares(num);
  }
    public int[] sortedSquares(int[] nums) {

        int[] ans = new int[nums.length];
        int start = 0 ;
        int end = nums.length-1 ;
        int ptr = ans.length-1 ;

        while(start<=end){
            int ss = nums[start] * nums[start];
            int es = nums[end] * nums[end];
            if(ss>es){
                ans[ptr] = ss;
                start++;
            }else{
                ans[ptr] = es ;
                end--;
            }
            ptr--;
        }
        System.out.println(java.util.Arrays.toString(ans));
        return ans ;
    }
}

