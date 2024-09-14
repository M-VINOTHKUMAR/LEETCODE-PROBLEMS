class Solution {
    public int hIndex(int[] c) {
        int h=c.length;
        Arrays.sort(c);
        for(int i=0;i<c.length;i++)
        {
           if(c[i]>=h-i)
            return h-i;
        }
        return 0;
    }
}