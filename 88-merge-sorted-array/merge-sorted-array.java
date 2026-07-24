class Solution {
    public void merge(int[] nums1, int m, int[] nums2, int n) {
        int j = 0;
        for(n = m ; n < nums1.length; n++){
            nums1[n]=nums2[j];
            j++;
        }
        for(j=0;j<nums1.length-1; j++){
        for(int i=0 ; i<nums1.length-1; i++){
            if(nums1[i] > nums1[i+1]){
                int temp = nums1[i];
                nums1[i]=nums1[i+1];
                nums1[i+1]=temp;
            }
        }
        }
        System.out.println(Arrays.toString(nums1));
    }
}