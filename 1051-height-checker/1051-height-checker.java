class Solution {
    public int heightChecker(int[] heights) {
        int[] arr=new int[heights.length];
        int count =0;
        int n = arr.length;
        for(int i=0;i<n;i++){
            arr[i]=heights[i];
        }
        for (int i = 0; i < n - 1; i++) {
            int min_idx = i;

            
            for (int j = i + 1; j < n; j++) {
                if (arr[j] < arr[min_idx]) {
                
                    min_idx = j;
                }
            }
            int temp = arr[i];
            arr[i] = arr[min_idx];
            arr[min_idx] = temp;           
        }
        for(int i=0;i<n;i++){
            if(arr[i]!=heights[i]){
                count++;
            }
        }
        return count;
    
    

        
    }
}