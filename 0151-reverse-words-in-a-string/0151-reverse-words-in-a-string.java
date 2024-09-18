class Solution {
    public String reverseWords(String s) {
        s=s.trim();
        String a[]=s.split(" ");
        s="";
    
        for(int i=a.length-1;i>=0;i--)
        {
                //System.out.println(!a[i].trim().equals(" "));
            if(!a[i].equals(""))
                  s+=a[i]+" ";
        }
        return s.trim();
    }
}