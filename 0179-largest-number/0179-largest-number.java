class Solution {
    public String largestNumber(int[] nums) {
        int n=nums.length;
       String str[]=new String[n];
       for(int i=0;i<n;i++)
       {
         str[i]=String.valueOf(nums[i]);
       }
     
     for(int i=0;i<n;i++)
     {
        for(int j=i+1;j<n;j++)
        {
            if((str[j]+str[i]).compareTo(str[i]+str[j])>0)
            {
                String t=str[j];
                str[j]=str[i];
                str[i]=t;
            }
            //System.out.println((str[j]+str[i]).compareTo(str[i]+str[j])==1);
        }
     }
       String s="";
       if(str[0].equals("0"))
         return "0";
       for(String a:str)
        s+=a;
       return s;
    }
}