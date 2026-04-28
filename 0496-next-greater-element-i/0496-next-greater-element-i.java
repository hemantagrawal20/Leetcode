class Solution {
    public int[] nextGreaterElement(int[] nums1, int[] nums2) {
        ArrayList<Integer> list=new ArrayList<>();
        for(int i=0;i<nums2.length;i++){
            list.add(nums2[i]);
        }
        for(int i=0;i<nums1.length;i++){
            nums1[i]=sol(list,nums1[i]);
        }
        return nums1;
    }
    public int sol(ArrayList<Integer>  list,int n){
        int k=list.indexOf(n);
        for(int j=k+1;j<list.size();j++){
            if(list.get(j)>n){
                return list.get(j);
            
            }
        }
        return -1;
    }
}