class Solution {
    public int countEven(int num) {
        int count=0;
        for(int i=1; i<=num; i++) {
            int ii=i;
            int sum = 0;
            while(ii!=0) {
                int rem = ii%10;
                ii = ii/10;
                sum+=rem;
            }
            if(sum%2==0)    count++;
        }
        return count;
    }
}
