class Solution {
    public boolean isPalindrome(int x) {
        if(x<0) return false;
        int n=0;
        int x1=x;
        while(x1!=0) {
            int rem = x1 % 10;
            n = n*10 + rem;
            x1=x1/10;
        }

        if(n==x)    return true;
        return false;
    }
}
