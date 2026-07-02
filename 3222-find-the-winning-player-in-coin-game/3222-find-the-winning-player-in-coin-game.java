class Solution {
    public String winningPlayer(int x, int y) {
        int c =0;
        while(x>0 && y>3){
            x=x-1;
            y=y-4;
            c++;
        }
        if(c%2==0){
            return "Bob";
        }
        else{
            return "Alice";
        }
        
    }
}