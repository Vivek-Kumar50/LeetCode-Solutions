class Solution {
    public int findNumbers(int[] nums) {
        int evencount=0;
        for(int num:nums){
           int digitcount=(int)Math.floor(Math.log10(num))+1;
           if(digitcount%2==0){
            evencount++;
           }
            }
        return evencount;
    }
}