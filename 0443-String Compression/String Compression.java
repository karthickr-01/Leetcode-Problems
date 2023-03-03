class Solution {
    public int compress(char[] chars) {
        int result=0,index=0;
        while(index < chars.length) {
            char cur = chars[index];
            int count=1;
            while(index+1<chars.length && chars[index+1]==cur) {
                index++;
                count++;
            }

            chars[result++]=cur;
            index++;
            if(count==1)    continue;
            else {
                for(char c : String.valueOf(count).toCharArray()){
                    chars[result++]=c;
                }
            }
        }

        return result;
    }
}
