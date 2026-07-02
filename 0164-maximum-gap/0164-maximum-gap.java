class Solution {
    public int maximumGap(int[] nums) {
        int temp=0;
        int maxgap=0;
        Arrays.sort(nums);
        
        int k=0;
        int newgap=0;
        while(k<nums.length-1){
            maxgap=nums[k+1]-nums[k];
            if(maxgap>newgap){
                newgap=maxgap;
            }
            k=k+1;            
        }
        return newgap;
        
    }
}