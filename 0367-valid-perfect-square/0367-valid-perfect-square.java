class Solution {
    public boolean isPerfectSquare(int num){
       for(long i=0;i<=num;i++){
        if((long)i*i==num){
            return true;
        }
       } 
       return false;
    }
}