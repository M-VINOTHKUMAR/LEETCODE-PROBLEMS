class Solution {
    public String sortSentence(String s) {
        String a[]=s.split(" ");
        int n=a.length;
        for(int i=0;i<n-1;i++)
        {
            for(int j=0;j<n-i-1;j++)
            {
                 char c1=a[j+1].charAt(a[j+1].length()-1);
                  char c2=a[j].charAt(a[j].length()-1);
               if(c1<c2)
               {
                 String t=a[j];
                 a[j]=a[j+1];
                 a[j+1]=t;
               }
           //  System.out.println(c1+" "+c2);
            }
           // System.out.println(Arrays.toString(a));
        }
           StringBuilder sb=new StringBuilder();
            for(int i=0;i<a.length;i++)
            {
                sb.append(a[i].substring(0,a[i].length()-1)+" ");
            }
            return sb.toString().trim();
    }
}