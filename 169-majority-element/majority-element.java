class Solution {
    public int majorityElement(int[] nums) {
      
        int majority=0;
        int n=nums.length;
        for(int i = 0 ; i<nums.length;i++){
              int counter=0;
            for(int j = i ; j<nums.length ;j++){
                if(nums[i]==nums[j]){
                    counter++;
                }  
            }
            if(counter>(n/2)){
                      majority = nums[i];
                    }
        }
        return majority;
    }
}