class Solution {
    public List<Integer> addToArrayForm(int[] num, int k) {
       List<Integer> ans = new ArrayList<>();

       int p = num.length-1 ;
       int carry = 0;
       int res;
       int ds;

         while(k>0 || p>=0){
         ds = k % 10; //taking last digit
         k= k/10; // removing last digit 
         if(p<0){
            res = ds+carry;
              int ps = res%10;
              carry = res/10;
              ans.add(ps);
         }else{
            res = num[p]+ds+carry;
            int ps = res%10;
            carry = res/10;
            ans.add(ps);
         }
        
        p--;
    }
     if(carry>0){
           ans.add(carry); // adding carry to the array list
       }
    Collections.reverse(ans);
       return ans ;
     }
}