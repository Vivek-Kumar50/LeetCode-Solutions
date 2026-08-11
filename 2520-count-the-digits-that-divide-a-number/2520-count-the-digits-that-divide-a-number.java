class Solution {
    public int countDigits(int num) {
        int sum=0;
        int orig=num;
        while(num!=0){
            int digit=num%10;
            if(orig%digit==0){
                sum++;
            }
            num=num/10;
        }

        return sum;
    }
}