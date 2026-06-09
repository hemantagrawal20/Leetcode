class Solution {
    public int subtractProductAndSum(int n) {
        int x=n;
        int sum=0;
        int mult=1;
        int y=0;
        while(x>0){
            y=x%10;
            x=x/10;
            mult=mult*y;
            sum=sum+y;
            
        }
        return(mult-sum);
        
    }
}