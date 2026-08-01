class Solution {
    public int subtractProductAndSum(int n) {
        int sum=0;
        int product=1,rem;
        while(n!=0){
            rem=n%10;
            sum+=rem;
            n=n/10;
            product*=rem;
        }
        return product-sum;
    }
}