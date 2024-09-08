public class consequtiveoneswithkzeros {
    public int longestOnes(int[] nums, int k) {
        int c = 0; 
        int max = 0;
        for(int j = 0; j < nums.length; j++){
            int z =0;
            c = 0;
            for(int i = j; i< nums.length; i++){
                if(nums[i]==0){
                    z++;
                }
                if(z <= k){
                    c = i-j+1;
                    max = Math.max(max,c);
                }
                else if ( z > k)
                    break;
            }
        }return max;
    }
}