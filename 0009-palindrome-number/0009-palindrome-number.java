class Solution {
    public boolean isPalindrome(int n) {
int sum=0,rem;
int orig=n;
while(n>0){
    rem=n%10;
    sum=(sum*10)+rem;
n=n/10;
}
if(orig==sum){
    return true;
}else{
    return false;
}
    }
}