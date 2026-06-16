class Solution {
    public double myPow(double x, int n) {
        long N=n;
        if(N<0){
            x=1/x;
            N=-N;
        }
        return fatPow(x,N);
        
    }
    private double fatPow(double x,long n){
        if(n==0){
            return 1;
        }
        double h=fatPow(x,n/2);
        if(n%2==0){
            return h*h;
        }
        return h*h*x;
    }

}