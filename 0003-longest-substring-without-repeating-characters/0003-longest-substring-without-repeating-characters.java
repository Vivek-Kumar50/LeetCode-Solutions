class Solution {
    public int lengthOfLongestSubstring(String s) {
        int left=0;
        int right=0;
        int []arr=new int[256];
        int max=0;
        while(s.length()>right){
            char currentChar=s.charAt(right);
            int currentCharAscii=(int) currentChar;
            arr[currentCharAscii]++;
            while(arr[currentCharAscii]>1){
                char leftChar=s.charAt(left);
                int leftcharAscii=(int)leftChar;
                arr[leftcharAscii]--;
                left++;
            }
            int currentWindowSize=right-left+1;
if(currentWindowSize>max){
    max=currentWindowSize;
}
right++;
        }
        return max;
    }
}