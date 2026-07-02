class Solution {
    public int missingNumber(int[] nums) {
        int n = nums.length;
        int[] arr=new int[n+1];
        int sum=0;
        int newsum=0;
        for(int i=0;i<n+1;i++){
            arr[i]=i;

        }
         for(int i=0;i<n;i++){
            sum+=nums[i];

        }
        for(int i=0;i<n+1;i++){
            newsum+=arr[i];

        }
        return newsum-sum;
    }

}