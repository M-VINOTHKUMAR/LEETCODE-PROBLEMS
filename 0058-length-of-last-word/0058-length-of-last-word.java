class Solution {
    public int lengthOfLastWord(String s) {
        s=s.trim();
        String a[]=s.split(" ");
        // int max=0;
        // System.out.println(Arrays.toString(a));
        // for(int i=0;i<a.length;i++)
        // {
        //   System.out.println(max);
        //     max=Math.max(a[i].length(),max);
        // }
        return a[a.length-1].length();
    }
}