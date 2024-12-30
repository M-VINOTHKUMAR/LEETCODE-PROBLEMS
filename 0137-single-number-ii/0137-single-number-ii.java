class Solution {
    public int singleNumber(int[] nums) {
        int ones=0;
        int twos=0;
        for(int a:nums)
        {
            ones^=a&~twos;
            twos^=a&~ones;
            System.out.println(Integer.toBinaryString(ones)+" "+Integer.toBinaryString(twos));
        }
        return ones;
    }
}