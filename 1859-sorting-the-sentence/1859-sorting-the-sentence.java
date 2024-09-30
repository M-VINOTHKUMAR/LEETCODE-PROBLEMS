class Solution {
    public String sortSentence(String s) {
        String a[]=s.split(" ");
        int n=a.length;
        for(int i=0;i<n;i++)
        {
           
            for(int j=0;j<n;j++)
            {
                 char c1=a[i].charAt(a[i].length()-1);
                  char c2=a[j].charAt(a[j].length()-1);
               if(c1<c2)
               {
                 String t=a[i];
                 a[i]=a[j];
                 a[j]=t;
               }
           //  System.out.println(c1+" "+c2);
            }
           // System.out.println(Arrays.toString(a));
        }
            s="";
            for(int i=0;i<a.length;i++)
            {
                s+=a[i].substring(0,a[i].length()-1)+" ";
            }
            return s.trim();
    }
}